package at.fhv.ecss2016.restest.parts;

import java.io.IOException;

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
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
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

import at.fhv.ecss2016.restest.controller.RemoteConnection;
import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.HttpVerb;
import at.fhv.ecss2016.restest.model.Response;
import at.fhv.ecss2016.restest.util.BindHelper;
import at.fhv.ecss2016.restest.util.StringConstants;

/**
 * ConfigPart UI and logic definition.
 * 
 * @author Sergii Maidanov at 15.05.2016
 */
public class ConfigPart {
	
	private static final String CREATABLE_PART_ID = "at.fhv.ecss2016.restest.partdescriptor.response";
	private static final String RIGHT_PART_STACK_ID = "at.fhv.ecss2016.restest.config.partstack.right";
	
	private static final String URL_ATTRIBUTE = "URL_ATTRIBUTE";
	private static final String VERB_ATTRIBUTE = "VERB_ATTRIBUTE";
	private static final String CONTENT_TYPE_ATTRIBUTE = "CONTENT_TYPE_ATTRIBUTE";
	private static final String CONTENT_BODY_ATTRIBUTE = "CONTENT_BODY_ATTRIBUTE";
	
	private static final int ELEMENT_VERTICAL_SPACING = 5;
	private static final int ELEMENT_HORIZONTAL_SPACING = 15;
	
	private static final BindHelper BIND_HELPER = new BindHelper();
	
	@Inject
	public MDirtyable _dirty;
	
	@Inject
	public ConfigPart() {
	}
	
	@PostConstruct
	public void postConstruct(Display display, Composite parent, EMenuService menuService, EPartService partService, EModelService modelService, MPerspective perspective) {
		
		// Setting parent layout
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.verticalSpacing = ELEMENT_VERTICAL_SPACING;
		gridLayout.horizontalSpacing = ELEMENT_HORIZONTAL_SPACING;
		
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
		BIND_HELPER.bindWidget(URL_ATTRIBUTE, urlText);
		
		Label verbLabel = new Label(parent, SWT.NONE);
		verbLabel.setText("Verb:");
		verbLabel.setFont(defaultFont);
		
		ComboViewer verbCombo = new ComboViewer(parent, SWT.DROP_DOWN | SWT.READ_ONLY);
		verbCombo.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		verbCombo.setContentProvider(new ArrayContentProvider());
		verbCombo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof HttpVerb) return ((HttpVerb) element).getLiteral();
				else return super.getText(element);
			}
		});
		verbCombo.setInput(HttpVerb.values());
		BIND_HELPER.bindViewer(VERB_ATTRIBUTE, verbCombo);
		
		Label contentTypeLabel = new Label(parent, SWT.NONE);
		contentTypeLabel.setText("Content-Type:");
		contentTypeLabel.setFont(defaultFont);
		
		ComboViewer contentTypeCombo = new ComboViewer(parent, SWT.DROP_DOWN | SWT.READ_ONLY);
		contentTypeCombo.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		contentTypeCombo.setContentProvider(new ArrayContentProvider());
		contentTypeCombo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof ContentType) return ((ContentType) element).getLiteral();
				else return super.getText(element);
			}
		});
		contentTypeCombo.setInput(ContentType.values());
		BIND_HELPER.bindViewer(CONTENT_TYPE_ATTRIBUTE, contentTypeCombo);
		
		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		Label bodyLabel = new Label(parent, SWT.NONE);
		bodyLabel.setText("Body:");
		bodyLabel.setFont(defaultFont);
		
		StyledText contentBodyText = new StyledText(parent, SWT.BORDER);
		contentBodyText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		BIND_HELPER.bindWidget(CONTENT_BODY_ATTRIBUTE, contentBodyText);
		
		Button sendButton = new Button(parent, SWT.NONE);
		sendButton.setText("Send");
		sendButton.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false, 2, 1));
		
		sendButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {				
				display.asyncExec(() ->  {
					// Reading data from UI
					String uri = urlText.getText();
					
					IStructuredSelection vSelection = (IStructuredSelection) verbCombo.getSelection();
					HttpVerb httpVerb = (vSelection != null && !vSelection.isEmpty()) ? (HttpVerb) vSelection.getFirstElement() : null;
	
					IStructuredSelection cSelection = (IStructuredSelection) contentTypeCombo.getSelection();
					ContentType contentType = (cSelection != null && !cSelection.isEmpty()) ? (ContentType) cSelection.getFirstElement() : null;
					
					String body = contentBodyText.getText();
					
					try {
						
						// Sending request
						Response response = sendNewRequest(uri, httpVerb, contentType, body);
						openResponsePerspective(response, perspective, partService, modelService);
						
					} catch (IllegalArgumentException | IOException e) { e.printStackTrace(); }
				});
			}
		});
	}
	
	@Inject
	@Optional
	private void setModel(@Named(IServiceConstants.ACTIVE_SELECTION) Config config) {
		if (config != null) {			
			// Set new values for the map entries from a model object
			BIND_HELPER.updateAttributeValue(URL_ATTRIBUTE, config.getRequestURL());
			BIND_HELPER.updateAttributeValue(VERB_ATTRIBUTE, config.getVerb());
			BIND_HELPER.updateAttributeValue(CONTENT_TYPE_ATTRIBUTE, config.getContentType());
			BIND_HELPER.updateAttributeValue(CONTENT_BODY_ATTRIBUTE, config.getRequestBody());
	    }
	}
	
	@Inject
	private void setSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Config config) {
		if (config != null) setModel(config);
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
	
	/**
	 * Helper method that sends HTTP request.
	 * 
	 * @param uri where request will be send.
	 * @param httpVerb request method.
	 * @param contentType type of the content if available
	 * @param body (content) of the request.
	 * @return instance of {@code Response}, containing response information for produced request.
	 * @throws IllegalArgumentException
	 * @throws IOException
	 */
	private Response sendNewRequest(String url, HttpVerb httpVerb, ContentType contentType, String body)
	throws IllegalArgumentException, IOException {
		RemoteConnection remoteConnection = new RemoteConnection();
		
		if (httpVerb != null) {
			switch (httpVerb) {
				case GET: return remoteConnection.sendGetRequest(url, contentType);
				case POST: return remoteConnection.sendPostRequest(url, contentType, body);
				case PUT: return remoteConnection.sendPutRequest(url, contentType, body);
				case DELETE: return remoteConnection.sendDeleteRequest(url, contentType);
			}
		}
		
		return null;
	}
	
	/**
	 * Helper method that opens response perspective.
	 * 
	 * @param response response to be displayed in new part.
	 * @param perspective current perspective.
	 * @param partService service for part management.
	 * @param modelService service for fetching elements by id.
	 */
	private void openResponsePerspective(Response response, MPerspective perspective, EPartService partService, EModelService modelService) {
		
		// Forwarding response to the response part
		perspective.getContext().set(
			StringConstants.CONFIG_RESPONSE.getConstant(),
			response
		);
		
		// Opening response part
		MPart editPart = partService.createPart(CREATABLE_PART_ID);
		
		MPartStack partStack = (MPartStack) modelService.find(RIGHT_PART_STACK_ID, perspective);
		partStack.getChildren().add(editPart);
		
		partService.showPart(editPart, PartState.ACTIVATE);
	}
}