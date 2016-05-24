
package at.fhv.ecss2016.restest.parts;

import org.apache.http.HttpStatus;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
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

		Label lblResType = new Label(parent, SWT.NONE);
		lblResType.setText("Result type: ");

		ComboViewer contentTypeCombo = new ComboViewer(parent, SWT.DROP_DOWN | SWT.READ_ONLY);
		contentTypeCombo.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		contentTypeCombo.setContentProvider(new ArrayContentProvider());
		contentTypeCombo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof ContentType) return ((ContentType) element).getName();
				else return super.getText(element);
			}
		});
		contentTypeCombo.setInput(ContentType.values());

		Button containsBodyBtn = new Button(parent, SWT.CHECK);
		containsBodyBtn.setText("Contains body");

		Label lblResBody = new Label(parent, SWT.NONE);
		lblResBody.setText("Result body: ");
		new Text(parent, SWT.BORDER);

		Button addBtn = new Button(parent, SWT.PUSH);
		addBtn.setText("Add");

		Button cancelBtn = new Button(parent, SWT.PUSH);
		cancelBtn.setText("Cancel");
	}

}