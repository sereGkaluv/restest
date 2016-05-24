package at.fhv.ecss2016.restest.parts;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
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

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * ConfigPart UI and logic definition.
 * 
 * @author Sergii Maidanov at 24.05.2016
 */
public class ScenarioPart {
	
	private static final String CREATABLE_PART_ID = "at.fhv.ecss2016.restest.partdescriptor.response";
	private static final String RIGHT_PART_STACK_ID = "at.fhv.ecss2016.restest.scenario.partstack.right";
	
	private static final int ELEMENT_VERTICAL_SPACING = 5;
	private static final int ELEMENT_HORISONTAL_SPACING = 15;
	
	private final int _width = 500;
	private final int _height = 300;
	private final String _dialogTitle = "Add new config to scenario?";
	
	@Inject
	public MDirtyable _dirty;
	
	@Inject
	public ScenarioPart() {
	}
	
	@PostConstruct
	public void postConstruct(Display display, Shell shell, Composite parent, EMenuService menuService, EPartService partService, EModelService modelService, MPerspective perspective) {
		
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
		
		Text filePath = new Text(parent, SWT.BORDER);
		filePath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 6, 1));
		
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
		addScenarioButton.addListener(SWT.Selection, new Listener(){
			@Override
			public void handleEvent(Event event) {
				
//				try {
					// opens new config dialog
					NewConfigDialog newConfigDialog = new NewConfigDialog(
						_width,
						_height,
						_dialogTitle,
						shell
					);
					
					int statusCode = newConfigDialog.open();
					
					if (statusCode == Window.OK) {
						newConfigDialog.getConfigName();
					}
					
//				} catch (JsonProcessingException | IOException e) {
//					e.printStackTrace();
//				}
			}
		});
		
		Button removeScenarioButton = new Button(parent, SWT.NONE);
		removeScenarioButton.setText("-");
		removeScenarioButton.setLayoutData(new GridData(SWT.CENTER));
		
		StyledText styledText = new StyledText(parent, SWT.BORDER);
		styledText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 7, 1));
		
		Button startButton = new Button(parent, SWT.NONE);
		startButton.setText("Start");
		startButton.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false, 7, 1));
		
		startButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				
				display.asyncExec(() ->  {
					
				});
			}
		});
	}
	
	@Persist
	public void save() {
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
}