package at.fhv.ecss2016.restest.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import at.fhv.ecss2016.restest.util.StringConstants;

/**
 * ConfigPart UI and logic definition.
 * 
 * @author sereGkaluv at 15.05.2016
 */
public class ConfigPart {
	
	private static final String CREATABLE_PART_ID = "at.fhv.ecss2016.restest.partdescriptor.response";
	private static final String RIGHT_PART_STACK_ID = "at.fhv.ecss2016.restest.config.partstack.right";
	
	private static final int ELEMENT_VERTICAL_SPACING = 5;
	private static final int ELEMENT_HORISONTAL_SPACING = 15;
	
	@Inject
	public MDirtyable _dirty;
	
	@Inject
	public ConfigPart() {
	}
	
	@PostConstruct
	public void postConstruct(Composite parent, EMenuService menuService, EPartService partService, EModelService modelService, MPerspective perspective) {
		
		// Setting parent layout
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.verticalSpacing = ELEMENT_VERTICAL_SPACING;
		gridLayout.horizontalSpacing = ELEMENT_HORISONTAL_SPACING;
		
		parent.setLayout(gridLayout);
		
		// Setting parent font
		FontData initFontData = parent.getFont().getFontData()[0];
		
		FontData fontData = new FontData(initFontData.getName(), initFontData.getHeight(), SWT.BOLD);
		Font defaultFont = new Font(parent.getDisplay(), fontData);
		
		// Setting UI elements

		Label urlLabel = new Label(parent, SWT.NONE);
		urlLabel.setText("URL:");
		urlLabel.setFont(defaultFont);
		
		Text urlText = new Text(parent, SWT.BORDER);
		urlText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label verbLabel = new Label(parent, SWT.NONE);
		verbLabel.setText("Verb:");
		verbLabel.setFont(defaultFont);
		
		Combo verbCombo = new Combo(parent, SWT.NONE);
		verbCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label contentTypeLabel = new Label(parent, SWT.NONE);
		contentTypeLabel.setText("Content-Type:");
		contentTypeLabel.setFont(defaultFont);
		
		Combo contentTypeCombo = new Combo(parent, SWT.NONE);
		contentTypeCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		Label bodyLabel = new Label(parent, SWT.NONE);
		bodyLabel.setText("Body:");
		bodyLabel.setFont(defaultFont);
		
		StyledText styledText = new StyledText(parent, SWT.BORDER);
		styledText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		
		Button button = new Button(parent, SWT.NONE);
		button.setText("Send");
		button.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false, 2, 1));
		
		button.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
					
//				perspective.getContext().set(
//					StringConstants.CONFIG_RESPONSE.getConstant(),
//					value
//				);
				
				MPart editPart = partService.createPart(CREATABLE_PART_ID);
				
				MPartStack partStack = (MPartStack) modelService.find(RIGHT_PART_STACK_ID, perspective);
				partStack.getChildren().add(editPart);
				
				partService.showPart(editPart, PartState.ACTIVATE);
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