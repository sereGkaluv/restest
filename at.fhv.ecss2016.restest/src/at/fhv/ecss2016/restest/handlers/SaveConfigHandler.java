 
package at.fhv.ecss2016.restest.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
/**
 * Handler that provides save functionality for the Config.
 * 
 * @author sereGkaluv on 13-05-2016
 */
public class SaveConfigHandler {
	
	private static final String DEFAULT_SAVE_MESSAGE = "All entries were saved.";
	
	@Execute
	public void execute(EPartService partService, Shell parentShell) {
		
		partService.saveAll(false);
		
		MessageBox messageBox = new MessageBox(parentShell);
		messageBox.setMessage(DEFAULT_SAVE_MESSAGE);
		messageBox.open();
	}
	
	@CanExecute
	public boolean canExecute(EPartService partService) {
		return !partService.getDirtyParts().isEmpty();
	}	
}