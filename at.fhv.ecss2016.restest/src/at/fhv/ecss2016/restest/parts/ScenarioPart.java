package at.fhv.ecss2016.restest.parts;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import at.fhv.ecss2016.restest.controller.JsonProvider;
import at.fhv.ecss2016.restest.controller.RemoteConnection;
import at.fhv.ecss2016.restest.controller.util.ConfigMapper;
import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.ConfigResultPair;
import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.ExpectedResult;
import at.fhv.ecss2016.restest.model.ModelFactory;
import at.fhv.ecss2016.restest.model.Response;
import at.fhv.ecss2016.restest.model.Scenario;
import at.fhv.ecss2016.restest.model.StatusCode;
import at.fhv.ecss2016.restest.util.BindHelper;
import at.fhv.ecss2016.restest.util.StringConstants;

/**
 * ConfigPart UI and logic definition.
 * 
 * @author Sergii Maidanov at 24.05.2016
 */
public class ScenarioPart {
	
	private static final String CREATABLE_PART_ID = "at.fhv.ecss2016.restest.partdescriptor.response";
	private static final String RIGHT_PART_STACK_ID = "at.fhv.ecss2016.restest.scenario.partstack.right";
	
	private static final String SCENARIO_FILE_ATTRIBUTE = "SCENARIO_FILE_ATTRIBUTE";
	private static final String CONFIG_RESULT_PAIRS_ATTRIBUTE = "CONFIG_RESULT_PAIRS_ATTRIBUTE";
	
	private static final int ELEMENT_VERTICAL_SPACING = 5;
	private static final int ELEMENT_HORISONTAL_SPACING = 15;
	
	private static final int FILE_DIALOG_WIDTH = 500;
	private static final int FILE_DIALOG_HEIGHT = 300;
	private static final String FILE_DIALOG_TITLE = "Add new config to scenario?";
	
	private static final BindHelper BIND_HELPER = new BindHelper();
	
	private static final List<ConfigResultPair> CONFIG_RESULT_PAIR_LIST = new LinkedList<>();

	@Inject
	private MDirtyable _dirty;
	
	@Inject
	public ScenarioPart() {
	}
	
	@PostConstruct
	private void postConstruct(Display display, Shell shell, Composite parent, EMenuService menuService, EPartService partService, EModelService modelService, MPerspective perspective) {
		
		// Setting parent layout
		GridLayout gridLayout = new GridLayout(7, false);
		gridLayout.verticalSpacing = ELEMENT_VERTICAL_SPACING;
		gridLayout.horizontalSpacing = ELEMENT_HORISONTAL_SPACING;
		
		parent.setLayout(gridLayout);
		
		// Setting parent font
		FontData initFontData = parent.getFont().getFontData()[0];
		
		FontData fontData = new FontData(initFontData.getName(), initFontData.getHeight(), SWT.BOLD);
		Font defaultFont = new Font(parent.getDisplay(), fontData);
		
		// Setting UI elements
		Label scenariosFileLabel = new Label(parent, SWT.NONE);
		scenariosFileLabel.setText("Scenarios file:");
		scenariosFileLabel.setFont(defaultFont);
		
		Text filePathText = new Text(parent, SWT.BORDER);
		filePathText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 6, 1));
		BIND_HELPER.bindWidget(SCENARIO_FILE_ATTRIBUTE, filePathText);
		
		Label horizontalSeparator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		horizontalSeparator.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 7, 1));
		
		Label scenariosListLabel = new Label(parent, SWT.NONE);
		scenariosListLabel.setText("Scenarios:");
		scenariosListLabel.setFont(defaultFont);
		
		// Flexible placeholder
		Label placeholderLabel = new Label(parent, SWT.FILL);
		placeholderLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		Button scenarioDownButton = new Button(parent, SWT.NONE);
		scenarioDownButton.setText("⬇");
		scenarioDownButton.setLayoutData(new GridData(SWT.CENTER));
		
		Button scenarioUpButton = new Button(parent, SWT.NONE);
		scenarioUpButton.setText("⬆");
		scenarioUpButton.setLayoutData(new GridData(SWT.CENTER));
		
		Label verticalSeparator = new Label(parent, SWT.NONE);
		verticalSeparator.setText("|");
		verticalSeparator.setLayoutData(new GridData(SWT.CENTER));
		
		Button addScenarioButton = new Button(parent, SWT.NONE);
		addScenarioButton.setText("+");
		addScenarioButton.setLayoutData(new GridData(SWT.CENTER));

		Button removeScenarioButton = new Button(parent, SWT.NONE);
		removeScenarioButton.setText("-");
		removeScenarioButton.setLayoutData(new GridData(SWT.CENTER));
		
		ListViewer listViewer = new ListViewer(parent, SWT.BORDER);
		listViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 7, 1));
		listViewer.setContentProvider(new ArrayContentProvider());
		listViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof ConfigResultPair) return ((ConfigResultPair) element).getConfig().getName();
				else return super.getText(element);
			}
		});
		listViewer.setInput(CONFIG_RESULT_PAIR_LIST);
		BIND_HELPER.bindViewer(CONFIG_RESULT_PAIRS_ATTRIBUTE, listViewer);
		
		// Double-click list Listener -> opens Response perspective
		listViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				StructuredSelection selection = (StructuredSelection) listViewer.getSelection();
				if (selection != null && !selection.isEmpty()) {
					ConfigResultPair pair = (ConfigResultPair) selection.getFirstElement();
					openResponsePerspective(pair.getResponse(), perspective, partService, modelService, display);
				}
			}
		});
		
		// Shift list elements up
		scenarioUpButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				int selectionIndex = listViewer.getList().getSelectionIndex();
				if (selectionIndex > 0 && selectionIndex < CONFIG_RESULT_PAIR_LIST.size()) {
					ConfigResultPair selectedConfig = CONFIG_RESULT_PAIR_LIST.remove(selectionIndex);
					CONFIG_RESULT_PAIR_LIST.add(selectionIndex -1, selectedConfig);
					listViewer.refresh();
				}
			}
		});
				
		// Shift list elements down
		scenarioDownButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				int selectionIndex = listViewer.getList().getSelectionIndex();
				if (selectionIndex >= 0 && selectionIndex < CONFIG_RESULT_PAIR_LIST.size() - 1) {
					ConfigResultPair selectedConfig = CONFIG_RESULT_PAIR_LIST.remove(selectionIndex);
					CONFIG_RESULT_PAIR_LIST.add(selectionIndex +1, selectedConfig);
					listViewer.refresh();
				}
			}
		});
		
		// Add config
		addScenarioButton.addListener(SWT.Selection, new Listener(){
			@Override
			public void handleEvent(Event event) {
				// opens new config dialog
				NewConfigDialog newConfigDialog = new NewConfigDialog(
					FILE_DIALOG_WIDTH,
					FILE_DIALOG_HEIGHT,
					FILE_DIALOG_TITLE,
					shell
				);
				
				int statusCode = newConfigDialog.open();
				if (statusCode == Window.OK) {
					new Thread(() -> addConfigToScenario(
						newConfigDialog.getFilePath(),
						newConfigDialog.getResultStatusCode(),
						newConfigDialog.getResultContentType(),
						newConfigDialog.getResultBodyText()
					)).start();
				}
			}
		});
		
		// Remove config
		removeScenarioButton.addListener(SWT.MouseDown, new Listener() {
			@Override
			public void handleEvent(Event event) {
				int selectionIndex = listViewer.getList().getSelectionIndex();
				CONFIG_RESULT_PAIR_LIST.remove(selectionIndex);
				
				listViewer.refresh();
			}
		});
		
		Button startButton = new Button(parent, SWT.NONE);
		startButton.setText("Start");
		startButton.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false, 7, 1));
		startButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				new Thread(() ->  {
					for (ConfigResultPair pair : CONFIG_RESULT_PAIR_LIST) {
						try {
							
							Config config = pair.getConfig();
							Response response = new RemoteConnection().sendNewRequest(config);
							
							pair.setResponse(response);
							
						} catch (IllegalArgumentException | IOException e) { e.printStackTrace(); }
					}
				}).start();
			}
		});
	}
	
	@Inject
	@Optional
	private void setModel(@Named(IServiceConstants.ACTIVE_SELECTION) Scenario scenario) {
		if (scenario != null) {			
			// Set new values for the map entries from a model object
			BIND_HELPER.updateAttributeValue(SCENARIO_FILE_ATTRIBUTE, scenario.getScenariosFile());
			BIND_HELPER.updateAttributeValue(CONFIG_RESULT_PAIRS_ATTRIBUTE, scenario.getConfigResultPairs());
	    }
	}
	
	@Inject
	private void setSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Scenario scenario) {
		if (scenario != null) setModel(scenario);
	}
	
	@Persist
	private void save() {
//	    try {
//	    	
//	    	Resource resource = new ResourceSetImpl().createResource(URI.createURI("todoList/myList"));
//		    resource.getContents().addAll(_uiEntries);
//	
//		    // Save the content
//		    resource.save(Collections.EMPTY_MAP);
//			_dirty.setDirty(false);
//
//	    } catch (IOException e) {
//	    	e.printStackTrace();
//	    }
    }
	
	private void addConfigToScenario(String filePath, StatusCode resultStatusCode, ContentType resultContentType, String resultBody) {
		try {
			
			ExpectedResult expectedResult = ModelFactory.eINSTANCE.createExpectedResult();
			expectedResult.setResponseCode(resultStatusCode);
			expectedResult.setResponseContentType(resultContentType);
			expectedResult.setResponseBody(resultBody);
			
			Config config = new JsonProvider().deserialize(filePath, new ConfigMapper());
			config.setExpectedResult(expectedResult);
			
			ConfigResultPair configResultPair = ModelFactory.eINSTANCE.createConfigResultPair();
			configResultPair.setConfig(config);
			
			CONFIG_RESULT_PAIR_LIST.add(configResultPair);
			
		} catch (IOException e) { e.printStackTrace(); }
	}
	
	/**
	 * Helper method that opens response perspective.
	 * 
	 * @param response response to be displayed in new part.
	 * @param perspective current perspective.
	 * @param partService service for part management.
	 * @param modelService service for fetching elements by id.
	 * @param display current display.
	 */
	private void openResponsePerspective(Response response, MPerspective perspective, EPartService partService, EModelService modelService, Display display) {
		
		// Forwarding response to the response part
		perspective.getContext().set(
			StringConstants.CONFIG_RESPONSE.getConstant(),
			response
		);
		
		// Opening response part
		display.asyncExec(() -> {
			MPart editPart = partService.createPart(CREATABLE_PART_ID);
			
			MPartStack partStack = (MPartStack) modelService.find(RIGHT_PART_STACK_ID, perspective);
			partStack.getChildren().add(editPart);
			
			partService.showPart(editPart, PartState.ACTIVATE);
		});
	}
}