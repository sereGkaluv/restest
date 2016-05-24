
package at.fhv.ecss2016.restest.parts;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
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

import at.fhv.ecss2016.restest.model.ContentType;

public class NewConfigDialog extends Dialog {

	private static final String FILE_SELECTOR_TEXT = "Please select a file";
	
	private final int _width;
	private final int _height;
	private final String _dialogTitle;
	
	private String _configName; 
	
	public NewConfigDialog(int width, int height, String dialogTitle, Shell shell) {
		super(shell);
		
		_width = width;
		_height = height;
		_dialogTitle = dialogTitle;
	}
	
	public String getConfigName() {
		return _configName;
	}
	
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		
		newShell.setText(_dialogTitle);
		newShell.setSize(_width, _height);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = (Composite) super.createDialogArea(parent);
		
	    // Defining UI
	    container.setLayout(new GridLayout(2, false));

		// name of new config
		Label lblName = new Label(container, SWT.NONE);
		lblName.setText("Name: ");

		Text txtName = new Text(container, SWT.BORDER);
		txtName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtName.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				_configName = txtName.getText().trim();
			}
		});

		// file for new config
		Label lblFileName = new Label(container, SWT.NONE);
		lblFileName.setText("Config file: ");

		Composite chooseFilePanel = new Composite(container, SWT.NONE);
		chooseFilePanel.setLayout(new RowLayout());

		Text txtFileName = new Text(chooseFilePanel, SWT.BORDER);
		txtFileName.setMessage("Select a file");

		Button btnChooseFile = new Button(chooseFilePanel, SWT.PUSH);
		btnChooseFile.setText("Choose file...");
		btnChooseFile.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				// open file dialog when button is clicked
				FileDialog fileDialog = new FileDialog(Display.getCurrent().getActiveShell());
				fileDialog.setText(FILE_SELECTOR_TEXT);
				fileDialog.open();
			}
		});

		Label lblSpace = new Label(container, SWT.NONE);
		lblSpace.setText(" ");
		
		Button btnContainsBody = new Button(container, SWT.CHECK);
		btnContainsBody.setText("Contains body");

		Label lblResType = new Label(container, SWT.NONE);
		lblResType.setText("Result type: ");

		ComboViewer resultTypeCombo = new ComboViewer(container, SWT.DROP_DOWN | SWT.READ_ONLY);
		resultTypeCombo.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		resultTypeCombo.setContentProvider(new ArrayContentProvider());
		resultTypeCombo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof ContentType) return ((ContentType) element).getName();
				else return super.getText(element);
			}
		});
		resultTypeCombo.setInput(ContentType.values());

		Label lblResBody = new Label(container, SWT.NONE);
		lblResBody.setText("Result body: ");
		
		Text txtBody = new Text(container, SWT.BORDER);
		txtBody.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		return container;
	}
}