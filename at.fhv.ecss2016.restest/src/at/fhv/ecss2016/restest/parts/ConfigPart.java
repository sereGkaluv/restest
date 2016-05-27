package at.fhv.ecss2016.restest.parts;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
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
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
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
import org.eclipse.swt.widgets.Text;

import at.fhv.ecss2016.restest.controller.JsonProvider;
import at.fhv.ecss2016.restest.controller.RemoteConnection;
import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.HttpVerb;
import at.fhv.ecss2016.restest.model.ModelFactory;
import at.fhv.ecss2016.restest.model.Response;
import at.fhv.ecss2016.restest.util.BindHelper;
import at.fhv.ecss2016.restest.util.FileDialogHelper;
import at.fhv.ecss2016.restest.util.StringConstants;

/**
 * ConfigPart UI and logic definition.
 * 
 * @author Sergii Maidanov at 15.05.2016
 */
public class ConfigPart {
	
	private static final String CREATABLE_PART_ID = "at.fhv.ecss2016.restest.partdescriptor.response";
	private static final String RIGHT_PART_STACK_ID = "at.fhv.ecss2016.restest.config.partstack.right";
	
	private static final String ICON_CONTROL_SEND = "icons/control/send.png";
	
	private static final String NAME_ATTRIBUTE = "NAME_ATTRIBUTE";
	private static final String URL_ATTRIBUTE = "URL_ATTRIBUTE";
	private static final String VERB_ATTRIBUTE = "VERB_ATTRIBUTE";
	private static final String CONTENT_TYPE_ATTRIBUTE = "CONTENT_TYPE_ATTRIBUTE";
	private static final String CONTENT_BODY_ATTRIBUTE = "CONTENT_BODY_ATTRIBUTE";
	
	private static final String FILE_DIALOG_TITLE = "Save config?";
	private static final String DEFAULT_SAVE_ERROR_MESSAGE = "Error occurred while saving config file.";
	private static final String DEFAULT_SEND_ERROR_MESSAGE = "Error occurred while processing current config.";
	
	private static final int ELEMENT_VERTICAL_SPACING = 5;
	private static final int ELEMENT_HORIZONTAL_SPACING = 15;
	
	private static final int SIZE_HINT = 35;
	
	private static final BindHelper BIND_HELPER = new BindHelper();

	private final Image _imageControlSend;
	
	private Config _currentConfig;
	
	@Inject
	private MDirtyable _dirty;
	
	@Inject
	public ConfigPart() {
		// Caching images
		ClassLoader classLoader = getClass().getClassLoader();
		
		_imageControlSend = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_CONTROL_SEND)
		).createImage();
	}
	
	@PostConstruct
	private void postConstruct(Display display, Shell shell, Composite parent, EMenuService menuService, EPartService partService, EModelService modelService, MPerspective perspective) {
		
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
		Label nameLabel = new Label(parent, SWT.NONE);
		nameLabel.setText("Name:");
		nameLabel.setFont(defaultFont);
		
		Text nameText = new Text(parent, SWT.BORDER);
		nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		BIND_HELPER.bindWidgetText(NAME_ATTRIBUTE, nameText);
		
		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		Label urlLabel = new Label(parent, SWT.NONE);
		urlLabel.setText("URL:");
		urlLabel.setFont(defaultFont);
		
		Text urlText = new Text(parent, SWT.BORDER);
		urlText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		BIND_HELPER.bindWidgetText(URL_ATTRIBUTE, urlText);
		
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
		verbCombo.setSelection(new StructuredSelection(HttpVerb.GET));
		BIND_HELPER.bindViewerSelection(VERB_ATTRIBUTE, verbCombo);
		
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
		contentTypeCombo.setSelection(new StructuredSelection(ContentType.TEXT));
		BIND_HELPER.bindViewerSelection(CONTENT_TYPE_ATTRIBUTE, contentTypeCombo);
		
		Label separator2 = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		Label bodyLabel = new Label(parent, SWT.NONE);
		bodyLabel.setText("Body:");
		bodyLabel.setFont(defaultFont);
		
		Text contentBodyText = new Text(parent, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
		contentBodyText.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) 
		    {
		        if(e.stateMask == SWT.CTRL && e.keyCode == 'a') contentBodyText.selectAll();
		    }
		});
		contentBodyText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		BIND_HELPER.bindWidgetText(CONTENT_BODY_ATTRIBUTE, contentBodyText);
		
		Button startButton = new Button(parent, SWT.BOLD);
		startButton.setFont(defaultFont);
		
		GridData startButtonGridData = new GridData(SWT.RIGHT, SWT.CENTER, true, false, 2, 1);
		startButtonGridData.widthHint = SIZE_HINT * 3;
		startButtonGridData.heightHint = SIZE_HINT;
		
		startButton.setLayoutData(startButtonGridData);
		startButton.setImage(_imageControlSend);
		startButton.setText("Start");

		startButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {				
				// Sending request
				new Thread(() ->  {	
					try {

						Response response = new RemoteConnection().sendNewRequest(getCurrentOrDefaultConfig());
						openResponsePerspective(response, perspective, partService, modelService, display);
						
					} catch (IllegalArgumentException | NullPointerException | IOException e) { 
						display.asyncExec(() -> {
							MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR);
							messageBox.setMessage(DEFAULT_SEND_ERROR_MESSAGE);
							messageBox.open();
						});
					}
				}).start();
			}
		});
		
		// Defining config assemble listeners
		WidgetProperties.text(SWT.Modify).observe(nameText).addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				Config config = getCurrentOrDefaultConfig();
				config.setName(nameText.getText());
				
				_dirty.setDirty(true);
			}
		});
		
		
		WidgetProperties.text(SWT.Modify).observe(urlText).addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				Config config = getCurrentOrDefaultConfig();
				config.setRequestURL(urlText.getText());
				
				_dirty.setDirty(true);
			}
		});
		
		ViewerProperties.singleSelection().observe(verbCombo).addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				IStructuredSelection vSelection = (IStructuredSelection) verbCombo.getSelection();
				HttpVerb httpVerb = (vSelection != null && !vSelection.isEmpty()) ? (HttpVerb) vSelection.getFirstElement() : null;
				
				Config config = getCurrentOrDefaultConfig();
				config.setVerb(httpVerb);
				
				_dirty.setDirty(true);
			}
		});
		
		ViewerProperties.singleSelection().observe(contentTypeCombo).addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				IStructuredSelection cSelection = (IStructuredSelection) contentTypeCombo.getSelection();
				ContentType contentType = (cSelection != null && !cSelection.isEmpty()) ? (ContentType) cSelection.getFirstElement() : null;
				
				Config config = getCurrentOrDefaultConfig();
				config.setContentType(contentType);
				
				_dirty.setDirty(true);
			}
		});
		
		WidgetProperties.text(SWT.Modify).observe(contentBodyText).addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				Config config = getCurrentOrDefaultConfig();
				config.setRequestBody(contentBodyText.getText());
				
				_dirty.setDirty(true);
			}
		});
	}
	
	@Inject
	@Optional
	private void setModel(@Named(IServiceConstants.ACTIVE_SELECTION) Config config) {
		if (config != null) {		
			_currentConfig = config;
			
			// Set new values for the map entries from a model object
			BIND_HELPER.updateAttributeValue(NAME_ATTRIBUTE, config.getName());
			BIND_HELPER.updateAttributeValue(URL_ATTRIBUTE, config.getRequestURL());
			BIND_HELPER.updateAttributeValue(VERB_ATTRIBUTE, config.getVerb());
			BIND_HELPER.updateAttributeValue(CONTENT_TYPE_ATTRIBUTE, config.getContentType());
			BIND_HELPER.updateAttributeValue(CONTENT_BODY_ATTRIBUTE, config.getRequestBody());
	    }
	}
	
	@Inject
	private void setSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Config config) {
		if (config != null) {
			setModel(config);
			_dirty.setDirty(false); //Fix for dirty state right after load.
		}
	}
	
	@Persist
	private void save(Shell parentShell) {
	    try {
	    	
			FileDialog fileDialog = FileDialogHelper.getFileDialog(
				FILE_DIALOG_TITLE,
				FileDialogHelper.FILTER_NAMES_CONFIG,
				FileDialogHelper.FILTER_EXTS_CONFIG,
				parentShell,
				SWT.SAVE
			);
				
			String filePath = fileDialog.open();
			if (filePath != null && !filePath.isEmpty()) {
			    // Save the content
			    new JsonProvider().serialize(filePath, getCurrentOrDefaultConfig());
				_dirty.setDirty(false);
			}

	    } catch (IOException e) { 
			MessageBox messageBox = new MessageBox(parentShell, SWT.ICON_ERROR);
			messageBox.setMessage(DEFAULT_SAVE_ERROR_MESSAGE);
			messageBox.open();
	    }
    }
	
	/**
	 * Virtual getter for current config.
	 * 
	 * @return current instance or default (empty) instance.
	 */
	private Config getCurrentOrDefaultConfig() {
		if (_currentConfig == null) {
			_currentConfig = ModelFactory.eINSTANCE.createConfig();
		}
		
		return _currentConfig;
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