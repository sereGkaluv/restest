
package at.fhv.ecss2016.restest.parts;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import at.fhv.ecss2016.restest.model.ContentType;

public class NewConfigPart {

	private static final String FILE_SELECTOR_TEXT = "Please select a file";

	// @Inject
	public NewConfigPart() {
	}

	// @PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(2, false));

		// name of new config
		Label lblName = new Label(parent, SWT.NONE);
		lblName.setText("Name: ");

		Text txtName = new Text(parent, SWT.BORDER);
		txtName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// file for new config
		Label lblFileName = new Label(parent, SWT.NONE);
		lblFileName.setText("Config file: ");

		Composite chooseFilePanel = new Composite(parent, SWT.NONE);
		chooseFilePanel.setLayout(new RowLayout());

		Text txtFileName = new Text(chooseFilePanel, SWT.BORDER);
		txtFileName.setMessage("Select a file");

		Button btnChooseFile = new Button(chooseFilePanel, SWT.PUSH);
		btnChooseFile.setText("Choose file...");
		btnChooseFile.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				// open file dialog when button is clicked
				FileDialog fileDialog = new FileDialog(new Shell());
				fileDialog.setText(FILE_SELECTOR_TEXT);
				fileDialog.open();
			}

		});

		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));

		Button btnContainsBody = new Button(parent, SWT.CHECK);
		btnContainsBody.setText("Contains body");

		Label lblResType = new Label(parent, SWT.NONE);
		lblResType.setText("Result type: ");

		ComboViewer resultTypeCombo = new ComboViewer(parent, SWT.DROP_DOWN | SWT.READ_ONLY);
		resultTypeCombo.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		resultTypeCombo.setContentProvider(new ArrayContentProvider());
		resultTypeCombo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof ContentType)
					return ((ContentType) element).getName();
				else
					return super.getText(element);
			}
		});
		resultTypeCombo.setInput(ContentType.values());

		Label lblResBody = new Label(parent, SWT.NONE);
		lblResBody.setText("Result body: ");
		new Text(parent, SWT.BORDER);

		// add config to list of custom configs
		Button btnAdd = new Button(parent, SWT.PUSH);
		btnAdd.setText("Add");

		// cancel action & close dialog window
		Button btnCancel = new Button(parent, SWT.PUSH);
		btnCancel.setText("Cancel");
	}

}