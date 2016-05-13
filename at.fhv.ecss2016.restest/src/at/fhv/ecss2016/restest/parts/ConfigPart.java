 
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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ConfigPart {
	
	private static final String RIGHT_PART_STACK_ID = "at.fhv.ecss2016.homework.task3.todo.partstack.right";
	private static final String TODO_LIST_SELECTION = "todo.list.selection";
	private static final String CREATABLE_PART_ID = "at.fhv.ecss2016.homework.task3.todo.partdescriptor.todo.edit";
	private static final String POPUP_MENU_ID = "at.fhv.ecss2016.homework.task3.todo.popupmenu.listMenu";
	
	@Inject
	public MDirtyable _dirty;
	
	@Inject
	public ConfigPart() {
	}
	
	@PostConstruct
	public void postConstruct(Composite parent, EMenuService menuService, EPartService partService, EModelService modelService, MPerspective perspective) {
		
		parent.setLayout(new GridLayout(2, false));
		
		Label lblURL = new Label(parent, SWT.NONE);
		lblURL.setText("URL:");
		new Text(parent, SWT.BORDER);
		
		Label lblVerb = new Label(parent, SWT.NONE);
		lblVerb.setText("Verb:");
		new Combo(parent, SWT.NONE);
		
		Label lblContentType = new Label(parent, SWT.NONE);
		lblContentType.setText("Content-Type:");
		new Combo(parent, SWT.NONE);
		
		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		
		Label lblBody = new Label(parent, SWT.NONE);
		lblBody.setText("Body:");
		StyledText styledText = new StyledText(parent, SWT.BORDER);
		styledText.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		
//		_tableViewer = new TableViewer(parent, SWT.FULL_SELECTION | SWT.MULTI);
//		menuService.registerContextMenu(_tableViewer.getControl(), POPUP_MENU_ID);
//	
//		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
//			ComposedAdapterFactory.Descriptor.Registry.INSTANCE
//		);
//
//		_tableViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));		
//		_tableViewer.setContentProvider(new ArrayContentProvider());
//		
//		_tableViewer.addDoubleClickListener(new IDoubleClickListener() {
//			@Override
//			public void doubleClick(DoubleClickEvent event) {
//				
//				StructuredSelection selection = (StructuredSelection) _tableViewer.getSelection();
//				if (selection != null && !selection.isEmpty()) {
//					
//					perspective.getContext().set(TODO_LIST_SELECTION, selection.getFirstElement());
//					
//					MPart editPart = partService.createPart(CREATABLE_PART_ID);
//					
//					MPartStack partStack = (MPartStack) modelService.find(RIGHT_PART_STACK_ID, perspective);
//					partStack.getChildren().add(editPart);
//					
//					partService.showPart(editPart, PartState.ACTIVATE);
//				}
//			}
//		});
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