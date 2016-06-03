
package at.fhv.ecss2016.restest.parts;

import java.io.IOException;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import at.fhv.ecss2016.restest.controller.JsonProvider;
import at.fhv.ecss2016.restest.controller.util.ConfigMapper;
import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.ConfigExpectedResultPair;
import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.ExpectedResult;
import at.fhv.ecss2016.restest.model.ModelFactory;
import at.fhv.ecss2016.restest.model.StatusCode;
import at.fhv.ecss2016.restest.util.FileDialogHelper;

public class NewConfigDialog extends Dialog {

	private static final String DIALOG_TITLE = "Add a new config to scenario?";
	private static final String FILE_DIALOG_TITLE = "Load config?";
	private static final String FILE_SELECTOR_TEXT = "Please select a file...";
	private static final String NO_NAME = "NO_NAME";
			
	private static final int ELEMENT_VERTICAL_SPACING = 5;
	private static final int ELEMENT_HORIZONTAL_SPACING = 15;
	
	private static final int SIZE_HINT = 35;
	
	private final int _width;
	private final int _height;

	private Config _config;
	
	private StatusCode _resultStatusCode;
	private ContentType _resultContentType;
	private String _resultBodyText;
	
	public NewConfigDialog(int width, int height, Shell shell) {
		super(shell);
		
		_width = width;
		_height = height;
	}
	
	public NewConfigDialog(ConfigExpectedResultPair prototypePair, int width, int height, Shell shell) {
		super(shell);
		
		_width = width;
		_height = height;
		
		if (prototypePair != null) {
			_config = prototypePair.getConfig();
			
			ExpectedResult expectedResult = prototypePair.getExpectedResult();
			_resultStatusCode = expectedResult.getStatusCode();
			_resultContentType = expectedResult.getContentType();
			_resultBodyText = expectedResult.getResponseBody();
		}
	}

	/**
	 * Helper method that assembles a {@code ConfigExpectedResultPair} instance.
	 * 
	 * @return assembled {@code ConfigExpectedResultPair} instance.
	 */
	public ConfigExpectedResultPair assembleConfigExpectedResultPair() {
		ExpectedResult expectedResult = ModelFactory.eINSTANCE.createExpectedResult();
		expectedResult.setStatusCode(_resultStatusCode);
		expectedResult.setContentType(_resultContentType);
		expectedResult.setResponseBody(_resultBodyText);
		
		ConfigExpectedResultPair configResultPair = ModelFactory.eINSTANCE.createConfigExpectedResultPair();
		configResultPair.setConfig(_config);
		configResultPair.setExpectedResult(expectedResult);
		
		return configResultPair;
	}
	
	/**
	 * Helper method that re-assembles a {@code ConfigExpectedResultPair} instance.
	 * 
	 * @return re-assembled {@code ConfigExpectedResultPair} instance.
	 */
	public ConfigExpectedResultPair assembleConfigExpectedResultPair(ConfigExpectedResultPair targetPair) {		
		if (targetPair != null) {
			
			ExpectedResult expectedResult = targetPair.getExpectedResult();
			if (expectedResult == null) expectedResult = ModelFactory.eINSTANCE.createExpectedResult();
			
			expectedResult.setStatusCode(_resultStatusCode);
			expectedResult.setContentType(_resultContentType);
			expectedResult.setResponseBody(_resultBodyText);
			
			targetPair.setConfig(_config);
			targetPair.setExpectedResult(expectedResult);
		}
		
		return targetPair;
	}
	
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		
		newShell.setText(DIALOG_TITLE);
		newShell.setSize(_width, _height);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = (Composite) super.createDialogArea(parent);
		
	    // Defining UI
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.verticalSpacing = ELEMENT_VERTICAL_SPACING;
		gridLayout.horizontalSpacing = ELEMENT_HORIZONTAL_SPACING;
		
	    container.setLayout(gridLayout);
	    
		// Setting parent font
		FontData initFontData = container.getFont().getFontData()[0];
		
		FontData fontData = new FontData(initFontData.getName(), initFontData.getHeight(), SWT.BOLD);
		Font defaultFont = new Font(container.getDisplay(), fontData);

		// File for new config
		Label lblFileName = new Label(container, SWT.NONE);
		lblFileName.setFont(defaultFont);
		lblFileName.setText("Config file:");
		
		// Creating composite for text field and button
		GridLayout fileSelectCompositeLayout = new GridLayout(2, false);
		fileSelectCompositeLayout.verticalSpacing = 0;
		fileSelectCompositeLayout.horizontalSpacing = 0;
		
		Composite fileSelectComposite = new Composite(container, SWT.BORDER);
		GridData compositeGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		compositeGridData.heightHint = SIZE_HINT;
		fileSelectComposite.setLayoutData(compositeGridData);
		fileSelectComposite.setLayout(fileSelectCompositeLayout);

		Text txtFilePath = new Text(fileSelectComposite, SWT.BORDER | SWT.READ_ONLY);		
		txtFilePath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		txtFilePath.setMessage(FILE_SELECTOR_TEXT);
		txtFilePath.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) 
		    {
		        if(e.stateMask == SWT.CTRL && e.keyCode == 'a') txtFilePath.selectAll();
		    }
		});
		if (_config != null) txtFilePath.setText(_config.getName());

		Button btnChooseFile = new Button(fileSelectComposite, SWT.PUSH);
		btnChooseFile.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		btnChooseFile.setText("Select file...");

		Listener fileSelectionListener = new Listener() {
			@Override
			public void handleEvent(Event event) {
				// open file dialog when button is clicked
				FileDialog fileDialog = FileDialogHelper.getFileDialog(
					FILE_DIALOG_TITLE,
					FileDialogHelper.FILTER_NAMES_CONFIG,
					FileDialogHelper.FILTER_EXTS_CONFIG,
					getShell(),
					SWT.OPEN
				);
				
				String filePath = fileDialog.open();
				if(filePath != null && !filePath.isEmpty()){
					new Thread(() ->  {
						try {

							_config = new JsonProvider().deserialize(filePath, new ConfigMapper());
							if (_config != null) {
								String configName = _config.getName() != null && !_config.getName().isEmpty() ? _config.getName() : NO_NAME;
								Display.getDefault().asyncExec(() -> txtFilePath.setText(configName));
							}
								
						} catch (IOException e) { e.printStackTrace(); }
					}).start();
				}
			}
		};
		
		txtFilePath.addListener(SWT.MouseDown, fileSelectionListener);
		btnChooseFile.addListener(SWT.Selection, fileSelectionListener);

		Label separator = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		Label lblStatusCode = new Label(container, SWT.NONE);
		lblStatusCode.setFont(defaultFont);
		lblStatusCode.setText("Result status code:");

		ComboViewer resultStatusCodeCombo = new ComboViewer(container, SWT.DROP_DOWN | SWT.READ_ONLY);
		resultStatusCodeCombo.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		resultStatusCodeCombo.setContentProvider(new ArrayContentProvider());
		resultStatusCodeCombo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof StatusCode) {
					StatusCode statusCode = (StatusCode) element;
					return String.valueOf(statusCode.getValue()) + " - " + statusCode.getLiteral();
				}
				else return super.getText(element);
			}
		});
		resultStatusCodeCombo.setInput(StatusCode.values());
		resultStatusCodeCombo.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sSelection = (IStructuredSelection) resultStatusCodeCombo.getSelection();
				_resultStatusCode = (StatusCode) sSelection.getFirstElement();
			}
		});
		if (_resultStatusCode != null) resultStatusCodeCombo.setSelection(new StructuredSelection(_resultStatusCode));
		
		Label lblResultContentType = new Label(container, SWT.NONE);
		lblResultContentType.setFont(defaultFont);
		lblResultContentType.setText("Result Content-Type:");

		ComboViewer resultContentTypeCombo = new ComboViewer(container, SWT.DROP_DOWN | SWT.READ_ONLY);
		resultContentTypeCombo.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		resultContentTypeCombo.setContentProvider(new ArrayContentProvider());
		resultContentTypeCombo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof ContentType) return ((ContentType) element).getLiteral();
				else return super.getText(element);
			}
		});
		resultContentTypeCombo.setInput(ContentType.values());
		resultContentTypeCombo.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection rSelection = (IStructuredSelection) resultContentTypeCombo.getSelection();
				_resultContentType = (ContentType) rSelection.getFirstElement();
			}
		});
		if (_resultContentType != null) resultContentTypeCombo.setSelection(new StructuredSelection(_resultContentType));
		
		Label separator2 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		Label lblResBody = new Label(container, SWT.NONE);
		lblResBody.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT, true, false, 2, 1));
		lblResBody.setFont(defaultFont);
		lblResBody.setText("Result body:");
		
		Text bodyText = new Text(container, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
		bodyText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		bodyText.addModifyListener(new ModifyListener(){
			@Override
			public void modifyText(ModifyEvent e) {
				_resultBodyText = bodyText.getText().trim();
			}
		});
		bodyText.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) 
		    {
		        if(e.stateMask == SWT.CTRL && e.keyCode == 'a') bodyText.selectAll();
		    }
		});
		if (_resultBodyText != null) bodyText.setText(_resultBodyText);
		
		return container;
	}
}