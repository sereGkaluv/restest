package at.fhv.ecss2016.restest.handlers;

import java.io.IOException;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

import com.fasterxml.jackson.core.JsonProcessingException;

import at.fhv.ecss2016.restest.controller.JsonProvider;
import at.fhv.ecss2016.restest.controller.util.ConfigMapper;
import at.fhv.ecss2016.restest.model.Config;

public class LoadConfigHandler {
	
	private static final String FILE_DIALOG_TITLE = "Load config";
	private static final String DEFAULT_LOAD_MESSAGE = "Config was loaded.";

	@Inject
	private ESelectionService _selectionService;
	
	@Execute
	public void execute(Shell parentshell) throws JsonProcessingException, IOException {
	
		FileDialog fileDialog = new FileDialog(parentshell);
		fileDialog.setText(FILE_DIALOG_TITLE);
		
		String filePath = fileDialog.open();
		if (filePath != null && !filePath.isEmpty()) {
			Config config = new JsonProvider().deserialize(filePath, new ConfigMapper());
			_selectionService.setSelection(config);
			
			MessageBox messageBox = new MessageBox(parentshell);
			messageBox.setMessage(DEFAULT_LOAD_MESSAGE);
			messageBox.open();
		}
	}	
}