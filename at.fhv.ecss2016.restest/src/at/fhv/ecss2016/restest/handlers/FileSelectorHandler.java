package at.fhv.ecss2016.restest.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileSelectorHandler {
	private static final String FILE_SELECTOR_TEXT = "Please select a file";

	@Execute
	public void execute(EPartService partService, Shell parentShell) {

		partService.saveAll(false);
		FileDialog fileDialog = new FileDialog(parentShell);
		fileDialog.setText(FILE_SELECTOR_TEXT);
		fileDialog.open();
	}

	@CanExecute
	public boolean canExecute(EPartService partService) {
		return !partService.getDirtyParts().isEmpty();
	}
}
