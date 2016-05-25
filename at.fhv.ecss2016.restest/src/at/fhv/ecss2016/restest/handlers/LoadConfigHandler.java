package at.fhv.ecss2016.restest.handlers;

import java.io.IOException;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

import com.fasterxml.jackson.core.JsonProcessingException;

import at.fhv.ecss2016.restest.controller.JsonProvider;
import at.fhv.ecss2016.restest.controller.util.ConfigMapper;
import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.util.FileDialogHelper;

public class LoadConfigHandler {
	
	private static final String FILE_DIALOG_TITLE = "Load config?";
	private static final String DEFAULT_LOAD_MESSAGE = "Config was loaded.";
	private static final String DEFAULT_ERROR_MESSAGE = "Not supported config file.";

	@Inject
	private ESelectionService _selectionService;
	
	@Execute
	public void execute(Shell parentShell) throws JsonProcessingException, IOException {
	
		FileDialog fileDialog = FileDialogHelper.getFileDialog(
			FILE_DIALOG_TITLE,
			FileDialogHelper.FILTER_NAMES_CONFIG,
			FileDialogHelper.FILTER_EXTS_CONFIG,
			parentShell,
			SWT.OPEN
		);
		
		String filePath = fileDialog.open();
		if (filePath != null && !filePath.isEmpty()) {
			Config config = new JsonProvider().deserialize(filePath, new ConfigMapper());
			
			if (config != null) {
				_selectionService.setSelection(config);
				
				MessageBox messageBox = new MessageBox(parentShell, SWT.ICON_INFORMATION);
				messageBox.setMessage(DEFAULT_LOAD_MESSAGE);
				messageBox.open();
			} else {
				MessageBox messageBox = new MessageBox(parentShell, SWT.ICON_ERROR);
				messageBox.setMessage(DEFAULT_ERROR_MESSAGE);
				messageBox.open();
			}
		}
	}	
}