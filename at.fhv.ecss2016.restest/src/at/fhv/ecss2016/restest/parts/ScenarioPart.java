package at.fhv.ecss2016.restest.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
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
import org.eclipse.swt.widgets.Text;

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
	
	@Inject
	public MDirtyable _dirty;
	
	@Inject
	public ScenarioPart() {
	}
	
	@PostConstruct
	public void postConstruct(Display display, Composite parent, EMenuService menuService, EPartService partService, EModelService modelService, MPerspective perspective) {
		
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
		new Label(parent, SWT.FILL);
		
		Button scenarioDownButton = new Button(parent, SWT.NONE);
		scenarioDownButton.setText("⬇");
		scenarioDownButton.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false));
		
		Button scenarioUpButton = new Button(parent, SWT.NONE);
		scenarioUpButton.setText("⬆");
		scenarioUpButton.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false));
		
		Label verticalSeparator = new Label(parent, SWT.SEPARATOR | SWT.VERTICAL);
		verticalSeparator.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, true, false));
		
		Button addScenarioButton = new Button(parent, SWT.NONE);
		addScenarioButton.setText("+");
		addScenarioButton.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false));
		
		Button removeScenarioButton = new Button(parent, SWT.NONE);
		removeScenarioButton.setText("-");
		removeScenarioButton.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false));
		
		StyledText styledText = new StyledText(parent, SWT.BORDER);
		styledText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		
		Button startButton = new Button(parent, SWT.NONE);
		startButton.setText("Start");
		startButton.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false, 2, 1));
		
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