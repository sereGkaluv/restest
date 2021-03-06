package at.fhv.ecss2016.restest.parts;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.list.WritableList;
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
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import at.fhv.ecss2016.restest.controller.JsonProvider;
import at.fhv.ecss2016.restest.controller.RemoteConnection;
import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.ConfigExpectedResultPair;
import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.ExpectedResult;
import at.fhv.ecss2016.restest.model.ModelFactory;
import at.fhv.ecss2016.restest.model.Response;
import at.fhv.ecss2016.restest.model.Scenario;
import at.fhv.ecss2016.restest.model.StatusCode;
import at.fhv.ecss2016.restest.util.BindHelper;
import at.fhv.ecss2016.restest.util.FileDialogHelper;
import at.fhv.ecss2016.restest.util.StringConstants;

/**
 * ConfigPart UI and logic definition.
 * 
 * @author Sergii Maidanov at 24.05.2016
 */
public class ScenarioPart {
	
	private static final String CREATABLE_PART_ID = "at.fhv.ecss2016.restest.partdescriptor.response";
	private static final String RIGHT_PART_STACK_ID = "at.fhv.ecss2016.restest.scenario.partstack.right";
	
	private static final String ICON_STATUS_UNKNOWN = "icons/status/unknown.png";
	private static final String ICON_STATUS_PROGRESS = "icons/status/progress.png";
	private static final String ICON_STATUS_OK = "icons/status/ok.png";
	private static final String ICON_STATUS_FAIL = "icons/status/fail.png";
	private static final String ICON_STATUS_EXCEPTION = "icons/status/exception.png";
	
	private static final String ICON_CONTROL_EDIT = "icons/control/edit.png";
	private static final String ICON_CONTROL_ADD = "icons/control/add.png";
	private static final String ICON_CONTROL_DELETE = "icons/control/delete.png";
	private static final String ICON_CONTROL_UP = "icons/control/up.png";
	private static final String ICON_CONTROL_DOWN = "icons/control/down.png";
	private static final String ICON_CONTROL_CLEAR_ALL = "icons/control/clear_all.png";
	private static final String ICON_CONTROL_SEND = "icons/control/send.png";
	
	private static final String SCENARIO_FILE_ATTRIBUTE = "SCENARIO_FILE_ATTRIBUTE";
	private static final String CONFIG_RESULT_PAIRS_ATTRIBUTE = "CONFIG_RESULT_PAIRS_ATTRIBUTE";
	
	private static final String FILE_DIALOG_TITLE = "Save scenario?";
	private static final String DEFAULT_SAVE_OK_MESSAGE = "Changes were saved.";
	private static final String DEFAULT_ERROR_MESSAGE = "Error occurred while saving scenario file.";
	
	private static final int ELEMENT_VERTICAL_SPACING = 5;
	private static final int ELEMENT_HORISONTAL_SPACING = 15;
	
	private static final int SIZE_HINT = 35;
	
	private static final int FILE_DIALOG_WIDTH = 500;
	private static final int FILE_DIALOG_HEIGHT = 400;
	
	private static final BindHelper BIND_HELPER = new BindHelper();
	
	private static final IObservableList CONFIG_RESULT_PAIR_LIST = new WritableList(Realm.getDefault());

	private final Image _imageStatusUnknown;
	private final Image _imageStatusProgress;
	private final Image _imageStatusOk;
	private final Image _imageStatusFail;
	private final Image _imageStatusException;
	
	private final Image _imageControlEdit;
	private final Image _imageControlAdd;
	private final Image _imageControlDelete;
	private final Image _imageControlUp;
	private final Image _imageControlDown;
	private final Image _imageControlClearAll;
	private final Image _imageControlSend;
	
	private Scenario _currentScenario;
	
	@Inject
	private MDirtyable _dirty;
	
	@Inject
	public ScenarioPart() {
		
		// Caching images
		ClassLoader classLoader = getClass().getClassLoader();

		_imageStatusUnknown = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_STATUS_UNKNOWN)
		).createImage();
		
		_imageStatusProgress = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_STATUS_PROGRESS)
		).createImage();
		
		_imageStatusOk = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_STATUS_OK)
		).createImage();
		
		_imageStatusFail = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_STATUS_FAIL)
		).createImage();
		
		_imageStatusException = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_STATUS_EXCEPTION)
		).createImage();
		
		_imageControlEdit = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_CONTROL_EDIT)
		).createImage();
		
		_imageControlAdd = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_CONTROL_ADD)
		).createImage();
		
		_imageControlDelete = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_CONTROL_DELETE)
		).createImage();
		
		_imageControlUp = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_CONTROL_UP)
		).createImage();
		
		_imageControlDown = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_CONTROL_DOWN)
		).createImage();
		
		_imageControlClearAll = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_CONTROL_CLEAR_ALL)
		).createImage();
		
		_imageControlSend = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_CONTROL_SEND)
		).createImage();
	}
	
	@PostConstruct
	private void postConstruct(Display display, Shell shell, Composite parent, EMenuService menuService, EPartService partService, EModelService modelService, MPerspective perspective) {
		
		// Setting parent layout
		GridLayout gridLayout = new GridLayout(3, false);
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
		
		Text filePathText = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		filePathText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		filePathText.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) 
		    {
		        if(e.stateMask == SWT.CTRL && e.keyCode == 'a') filePathText.selectAll();
		    }
		});
		BIND_HELPER.bindWidgetText(SCENARIO_FILE_ATTRIBUTE, filePathText);
		
		Label horizontalSeparator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		horizontalSeparator.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		Label scenariosListLabel = new Label(parent, SWT.NONE);
		scenariosListLabel.setText("Scenarios:");
		scenariosListLabel.setFont(defaultFont);
		
		// Flexible placeholder
		Label placeholderLabel = new Label(parent, SWT.NONE);
		placeholderLabel.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false));
		
	    Composite scenarioControlComposite = new Composite(parent, SWT.BORDER);
	    scenarioControlComposite.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
	    scenarioControlComposite.setLayout(new GridLayout(9, false));
		
		GridData buttonGridData = new GridData(SWT.RIGHT, SWT.CENTER, false, false);
		buttonGridData.widthHint = SIZE_HINT;
		buttonGridData.heightHint = SIZE_HINT;
		
		Button editConfigButton = new Button(scenarioControlComposite, SWT.NONE);
		editConfigButton.setLayoutData(buttonGridData);
		editConfigButton.setImage(_imageControlEdit);
		
		Label verticalSeparator = new Label(scenarioControlComposite, SWT.NONE);
		verticalSeparator.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		verticalSeparator.setText("|");
		
		Button addConfigButton = new Button(scenarioControlComposite, SWT.NONE);
		addConfigButton.setLayoutData(buttonGridData);
		addConfigButton.setImage(_imageControlAdd);

		Button deleteConfigButton = new Button(scenarioControlComposite, SWT.NONE);
		deleteConfigButton.setLayoutData(buttonGridData);
		deleteConfigButton.setImage(_imageControlDelete);
		
		Label verticalSeparator2 = new Label(scenarioControlComposite, SWT.NONE);
		verticalSeparator2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		verticalSeparator2.setText("|");
		
		Button configUpButton = new Button(scenarioControlComposite, SWT.NONE);
		configUpButton.setLayoutData(buttonGridData);
		configUpButton.setImage(_imageControlUp);
		
		Button configDownButton = new Button(scenarioControlComposite, SWT.NONE);
		configDownButton.setLayoutData(buttonGridData);
		configDownButton.setImage(_imageControlDown);
		
		Label verticalSeparator3 = new Label(scenarioControlComposite, SWT.NONE);
		verticalSeparator3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		verticalSeparator3.setText("|");
		
		Button clearAllConfigButton = new Button(scenarioControlComposite, SWT.NONE);
		clearAllConfigButton.setLayoutData(buttonGridData);
		clearAllConfigButton.setImage(_imageControlClearAll);
		
		Composite tableComposite = new Composite(parent, SWT.NONE);
		tableComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
		
		TableViewer tableViewer = new TableViewer(tableComposite, SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE | SWT.FULL_SELECTION);
		
		TableColumn singleColumn = new TableColumn(tableViewer.getTable(), SWT.NONE);
		TableColumnLayout tableColumnLayout = new TableColumnLayout();
		tableColumnLayout.setColumnData(singleColumn, new ColumnWeightData(100));
		tableComposite.setLayout(tableColumnLayout);
		
		tableViewer.setContentProvider(new ArrayContentProvider());
		tableViewer.setLabelProvider(new LabelProvider() {
			@Override
			public Image getImage(Object element) {
				if (element instanceof ConfigExpectedResultPair) return _imageStatusUnknown;
				else return super.getImage(element);
			}
			@Override
			public String getText(Object element) {
				if (element instanceof ConfigExpectedResultPair) return ((ConfigExpectedResultPair) element).getConfig().getName();
				else return super.getText(element);
			}
		});
		
		// Setting input and binding table viewer values
		BIND_HELPER.bindViewerInput(CONFIG_RESULT_PAIRS_ATTRIBUTE, tableViewer);
		tableViewer.setInput(CONFIG_RESULT_PAIR_LIST);
		
		// Double-click list Listener -> opens Response perspective
		tableViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				StructuredSelection selection = (StructuredSelection) tableViewer.getSelection();
				if (selection != null && !selection.isEmpty()) {
					ConfigExpectedResultPair pair = (ConfigExpectedResultPair) selection.getFirstElement();
					Response response = pair.getConfig().getResponse();
					
					if (response != null) openResponsePerspective(response, perspective, partService, modelService, display);
				}
			}
		});
		
		// Edit config
		editConfigButton.addListener(SWT.Selection, new Listener(){
			@Override
			public void handleEvent(Event event) {
				int selectionIndex = tableViewer.getTable().getSelectionIndex();
				if (selectionIndex >= 0 && selectionIndex < CONFIG_RESULT_PAIR_LIST.size()) {
					
					ConfigExpectedResultPair oldPair = (ConfigExpectedResultPair) tableViewer.getTable().getItem(selectionIndex).getData();
					
					// opens new config dialog to modify existing pair
					NewConfigDialog newConfigDialog = new NewConfigDialog(
						oldPair,
						FILE_DIALOG_WIDTH,
						FILE_DIALOG_HEIGHT,
						shell
					);
					
					int statusCode = newConfigDialog.open();
					if (statusCode == Window.OK) {
						newConfigDialog.assembleConfigExpectedResultPair(oldPair);
						
						MessageBox messageBox = new MessageBox(shell, SWT.ICON_INFORMATION);
						messageBox.setMessage(DEFAULT_SAVE_OK_MESSAGE);
						messageBox.open();
						
						_dirty.setDirty(true);
					}
				}
			}
		});
		
		// Add config
		addConfigButton.addListener(SWT.Selection, new Listener(){
			@Override
			public void handleEvent(Event event) {
				// opens new config dialog
				NewConfigDialog newConfigDialog = new NewConfigDialog(
					FILE_DIALOG_WIDTH,
					FILE_DIALOG_HEIGHT,
					shell
				);
				
				int statusCode = newConfigDialog.open();
				if (statusCode == Window.OK) {
					new Thread(() -> {
						ConfigExpectedResultPair pair = newConfigDialog.assembleConfigExpectedResultPair();
						if (pair != null) CONFIG_RESULT_PAIR_LIST.getRealm().asyncExec(() -> CONFIG_RESULT_PAIR_LIST.add(pair));
					}).start();
				}
			}
		});
		
		// Delete config
		deleteConfigButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				int selectionIndex = tableViewer.getTable().getSelectionIndex();
				if (selectionIndex >= 0 && selectionIndex < CONFIG_RESULT_PAIR_LIST.size()) {
					CONFIG_RESULT_PAIR_LIST.remove(selectionIndex);
					if (tableViewer.getTable().getItemCount() > selectionIndex) tableViewer.getTable().setSelection(selectionIndex);
				}
			}
		});
		
		// Shift list elements up
		configUpButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				int selectionIndex = tableViewer.getTable().getSelectionIndex();
				if (selectionIndex > 0 && selectionIndex < CONFIG_RESULT_PAIR_LIST.size()) {
					Collections.swap(CONFIG_RESULT_PAIR_LIST, selectionIndex - 1, selectionIndex);
					tableViewer.getTable().setSelection(selectionIndex - 1);
				}
			}
		});
				
		// Shift list elements down
		configDownButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				int selectionIndex = tableViewer.getTable().getSelectionIndex();
				if (selectionIndex >= 0 && selectionIndex < CONFIG_RESULT_PAIR_LIST.size() - 1) {
					Collections.swap(CONFIG_RESULT_PAIR_LIST, selectionIndex, selectionIndex + 1);
					tableViewer.getTable().setSelection(selectionIndex + 1);
				}
			}
		});
		
		// Clears element list
		clearAllConfigButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if (!CONFIG_RESULT_PAIR_LIST.isEmpty()) CONFIG_RESULT_PAIR_LIST.clear();
			}
		});
		
		Label successfulTestsLabel = new Label(parent, SWT.NONE);
		successfulTestsLabel.setText("Successful tests:");
		successfulTestsLabel.setFont(defaultFont);
		
		Label successfulTestsValueLabel = new Label(parent, SWT.NONE);
		successfulTestsValueLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		successfulTestsValueLabel.setText("-");
		successfulTestsValueLabel.setFont(defaultFont);
		
		Button startButton = new Button(parent, SWT.BOLD);
		startButton.setImage(_imageControlSend);
		startButton.setFont(defaultFont);
		
		GridData startButtonGridData = new GridData(SWT.RIGHT, SWT.CENTER, false, false);
		startButtonGridData.widthHint = SIZE_HINT * 3;
		startButtonGridData.heightHint = SIZE_HINT;
		
		startButton.setLayoutData(startButtonGridData);
		startButton.setText("Start");
		startButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				
				// Disabling scenario controls
				scenarioControlComposite.setEnabled(false);
				
				// Fetching data
				TableItem[] tableItems = tableViewer.getTable().getItems();
				
				// Yes, it should be linked hash map if we want to execute tests from the first to the last order
				Map<TableItem, ConfigExpectedResultPair> tableMap = new LinkedHashMap<>();
				for (TableItem tableItem : tableItems) {
					Object dataObject = tableItem.getData();
					if (dataObject instanceof ConfigExpectedResultPair) {
						tableMap.put(tableItem, (ConfigExpectedResultPair) dataObject);
					}
				}
				
				// Starting new thread for sending requests
				new Thread(() ->  {
					
					int successfulTests = 0;
					
					for (TableItem tableItem : tableMap.keySet()) {
						
						display.syncExec(() -> tableItem.setImage(_imageStatusProgress));
						
						// At this point we have a reference to ConfigResultPair instance
						// which is also stored in CONFIG_RESULT_PAIR_LIST
						ConfigExpectedResultPair pair = tableMap.get(tableItem);
						
						// Doing HTTP request
						Config config = pair.getConfig();
						ExpectedResult expectedResult = pair.getExpectedResult();
						
						try {
					
							Response response = new RemoteConnection().sendNewRequest(config);
							
							// Updating response (will also affect entry in CONFIG_RESULT_PAIR_LIST,
							// because we referencing exactly THAT object stored in list.
							config.setResponse(response);
						
							if (isExpectationMatch(expectedResult, response)) {
								
								display.asyncExec(() -> tableItem.setImage(_imageStatusOk));
								 ++successfulTests;

							} else {
								display.asyncExec(() -> tableItem.setImage(_imageStatusFail));
							}
							
						} catch (IllegalArgumentException | IOException e) { 
							display.asyncExec(() -> tableItem.setImage(_imageStatusException));
							
							Response response = ModelFactory.eINSTANCE.createResponse();
							
							response.setContentType(ContentType.JAVA_LANG_EXCEPTION);
							response.setStatusCode(StatusCode.CONNECTION_EXCEPTION);
							response.setResponseBody(e.toString());
							config.setResponse(response);
						}
						
						int successfulTestsHolder = successfulTests;
						display.asyncExec(() -> successfulTestsValueLabel.setText(successfulTestsHolder + " / " + tableItems.length));
					}
					
					// Enabling scenario controls
					display.asyncExec(() -> scenarioControlComposite.setEnabled(true));
					
				}).start();
			}
		});
		
		CONFIG_RESULT_PAIR_LIST.addListChangeListener(new IListChangeListener() {
			@Override
			public void handleListChange(ListChangeEvent event) {
				tableViewer.refresh();
				_dirty.setDirty(true);
			}
		});
	}
	
	@Inject
	@Optional
	private void setModel(@Named(IServiceConstants.ACTIVE_SELECTION) Scenario scenario) {
		if (scenario != null) {
			_currentScenario = scenario;
			
			// Set new values for the map entries from a model object
			BIND_HELPER.updateAttributeValue(SCENARIO_FILE_ATTRIBUTE, scenario.getScenarioFilePath());
			
			// Partial workaround for table input list
			CONFIG_RESULT_PAIR_LIST.clear();
			CONFIG_RESULT_PAIR_LIST.addAll(scenario.getConfigExpectedResultPairList());
			BIND_HELPER.updateAttributeValue(CONFIG_RESULT_PAIRS_ATTRIBUTE, CONFIG_RESULT_PAIR_LIST);
	    }
	}
	
	@Inject
	private void setSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Scenario scenario) {
		if (scenario != null) {
			setModel(scenario);
			_dirty.setDirty(false); //Fix for dirty state right after load.
		}
	}
	
	@Persist
	private void save(Shell parentShell) {
	    try {
	    	
	    	// Assembling scenario
	    	String curerntFilePath = (String) BIND_HELPER.getAttributeValue(SCENARIO_FILE_ATTRIBUTE);
			
	    	Scenario scenario = getCurrentOrDefaultScenario();
	    	scenario.setScenarioFilePath(curerntFilePath);
	    	
			List<ConfigExpectedResultPair> configResultPairs = scenario.getConfigExpectedResultPairList();
			configResultPairs.clear();
			
			for (Object pair : CONFIG_RESULT_PAIR_LIST) {
				if (pair instanceof ConfigExpectedResultPair) {
					
					// This step is required to eliminate saving of the response into the scenario file.
					ConfigExpectedResultPair currentConfigExpectedResultPair = (ConfigExpectedResultPair) pair;
					Config currentConfig = currentConfigExpectedResultPair.getConfig();
					
					Config adoptedConfig = ModelFactory.eINSTANCE.createConfig();
					adoptedConfig.setName(currentConfig.getName());
					adoptedConfig.setRequestURL(currentConfig.getRequestURL());
					adoptedConfig.setHttpVerb(currentConfig.getHttpVerb());
					adoptedConfig.setContentType(currentConfig.getContentType());
					adoptedConfig.setRequestBody(currentConfig.getRequestBody());
					
					ConfigExpectedResultPair adoptedConfigExpectedResultPair = ModelFactory.eINSTANCE.createConfigExpectedResultPair();
					adoptedConfigExpectedResultPair.setConfig(adoptedConfig);
					adoptedConfigExpectedResultPair.setExpectedResult(currentConfigExpectedResultPair.getExpectedResult());
					
					configResultPairs.add(adoptedConfigExpectedResultPair);
				}
			}
	    	
			// Saving assembled scenario			
			FileDialog fileDialog = FileDialogHelper.getFileDialog(
				FILE_DIALOG_TITLE,
				FileDialogHelper.FILTER_NAMES_SCENARIO,
				FileDialogHelper.FILTER_EXTS_SCENARIO,
				parentShell,
				SWT.SAVE
			);
				
			String filePath = fileDialog.open();
			if (filePath != null && !filePath.isEmpty()) {
			    // Save the content
			    new JsonProvider().serialize(filePath, getCurrentOrDefaultScenario());
				_dirty.setDirty(false);
			}

	    } catch (IOException e) { 
			MessageBox messageBox = new MessageBox(parentShell, SWT.ICON_ERROR);
			messageBox.setMessage(DEFAULT_ERROR_MESSAGE);
			messageBox.open();
			
			e.printStackTrace();
	    }
    }
	
	/**
	 * Virtual getter for current scenario.
	 * 
	 * @return current instance or default (empty) instance.
	 */
	private Scenario getCurrentOrDefaultScenario() {
		if (_currentScenario == null) {
			_currentScenario = ModelFactory.eINSTANCE.createScenario();
		}
		
		return _currentScenario;
	}
	
	/**
	 * Helper method that checks if expectations meet response or not.
	 * 
	 * @param expectedResult result to be expected.
	 * @param response real result.
	 * @return true if was expected otherwise false.
	 */
	private boolean isExpectationMatch(ExpectedResult expectedResult, Response response) {
		
		if (expectedResult == null || response == null) return false;
		
		boolean isStatusCodeMatch = false;
		boolean isContentTypeMatch = false;
		boolean isBodyMatch = false;
		
		if (expectedResult.getStatusCode() == null && response.getStatusCode() == null) isStatusCodeMatch = true;
		else if (expectedResult.getStatusCode() != null && expectedResult.getStatusCode().equals(response.getStatusCode())) isStatusCodeMatch = true;
		
		if (expectedResult.getContentType() == null && response.getContentType() == null) isContentTypeMatch = true;
		else if (expectedResult.getContentType() != null && expectedResult.getContentType().equals(response.getContentType())) isContentTypeMatch = true;
		
		if (expectedResult.getResponseBody() == null && response.getResponseBody() == null) isBodyMatch = true;
		else if (expectedResult.getResponseBody() != null && expectedResult.getResponseBody().equals(response.getResponseBody())) isBodyMatch = true;
		
		return isStatusCodeMatch && isContentTypeMatch && isBodyMatch;
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