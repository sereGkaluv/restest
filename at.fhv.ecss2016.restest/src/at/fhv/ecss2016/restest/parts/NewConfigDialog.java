
package at.fhv.ecss2016.restest.parts;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.StatusCode;
import at.fhv.ecss2016.restest.util.FileDialogHelper;

public class NewConfigDialog extends Dialog {

	private static final String DIALOG_TITLE = "Add a new config to scenario?";
	private static final String FILE_DIALOG_TITLE = "Load config?";
	private static final String FILE_SELECTOR_TEXT = "Please select a file...";
			
	private static final int ELEMENT_VERTICAL_SPACING = 5;
	private static final int ELEMENT_HORIZONTAL_SPACING = 5;
	
	private static final int SIZE_HINT = 35;
	
	private final int _width;
	private final int _height;

	private String _filePath;
	private StatusCode _resultStatusCode;
	private ContentType _resultContentType;
	private String _resultBodyText;
	
	public NewConfigDialog(int width, int height, Shell shell) {
		super(shell);
		
		_width = width;
		_height = height;
	}

	
	public String getFilePath(){
		return _filePath;
	}
	
	public StatusCode getResultStatusCode() {
		return _resultStatusCode;
	}
	
	public ContentType getResultContentType(){
		return _resultContentType;
	}
	
	public String getResultBodyText(){
		return _resultBodyText;
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

		// file for new config
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

		Text txtFilePath = new Text(fileSelectComposite, SWT.BORDER);		
		txtFilePath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		txtFilePath.setMessage(FILE_SELECTOR_TEXT);
		txtFilePath.addModifyListener(new ModifyListener(){
			@Override
			public void modifyText(ModifyEvent e) {
				_filePath = txtFilePath.getText().trim();
			}
		});

		Button btnChooseFile = new Button(fileSelectComposite, SWT.PUSH);
		btnChooseFile.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		btnChooseFile.setText("Select file...");
		btnChooseFile.addListener(SWT.Selection, new Listener() {
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
				
				String responseValue = fileDialog.open();
				if(responseValue != null) txtFilePath.setText(responseValue);
			}
		});

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
				if (element instanceof StatusCode) return String.valueOf(((StatusCode) element).getValue());
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
		
		Label separator2 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		Label lblResBody = new Label(container, SWT.NONE);
		lblResBody.setLayoutData(new GridData(SWT.DEFAULT, SWT.DEFAULT, true, false, 2, 1));
		lblResBody.setFont(defaultFont);
		lblResBody.setText("Result body:");
		
		StyledText styledBodyText = new StyledText(container, SWT.BORDER);
		styledBodyText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		styledBodyText.addModifyListener(new ModifyListener(){
			@Override
			public void modifyText(ModifyEvent e) {
				_resultBodyText = styledBodyText.getText().trim();
			}
		});
		
		return container;
	}
}