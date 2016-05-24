
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import at.fhv.ecss2016.restest.model.ContentType;

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
		Button chooseFileBtn = new Button(cFileChoose, SWT.PUSH);
		chooseFileBtn.setText("Choose file...");

		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));

		Button containsBodyBtn = new Button(parent, SWT.CHECK);
		containsBodyBtn.setText("Contains body");

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
		Button addBtn = new Button(parent, SWT.PUSH);
		addBtn.setText("Add");

		// cancel action & close dialog window
		Button cancelBtn = new Button(parent, SWT.PUSH);
		cancelBtn.setText("Cancel");
	}

}