
package at.fhv.ecss2016.restest.parts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NewConfigPart {

	// @Inject
	public NewConfigPart() {
	}

	// @PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(2, false));

		Label lblName = new Label(parent, SWT.NONE);
		lblName.setText("Name: ");
		new Text(parent, SWT.BORDER);

		Label lblFileName = new Label(parent, SWT.NONE);
		lblFileName.setText("Config file: ");

		Composite cFileChoose = new Composite(parent, SWT.NONE);
		cFileChoose.setLayout(new RowLayout());
		Text txtCfile = new Text(cFileChoose, SWT.BORDER);
		txtCfile.setMessage("Select a file");
		Button chooseFileBtn = new Button(cFileChoose, 1);
		chooseFileBtn.setText("Choose file...");

		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));

		Label lblResType = new Label(parent, SWT.NONE);
		lblResType.setText("Result type: ");
		new Combo(parent, 0);

		Label lblResBody = new Label(parent, SWT.NONE);
		lblResBody.setText("Result body: ");
		new Text(parent, SWT.BORDER);
	}

}