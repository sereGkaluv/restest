package at.fhv.ecss2016.restest.util;

import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * FileDialogHelper simplifies the FileDialog creation, stores file names (extensions) constants.
 * 
 * @author Sergii Maidanov at 25.05.2016
 */
public class FileDialogHelper {
	
	public static final String[] FILTER_NAMES_CONFIG = { "RESTest Config Files (*.rcfg)" };
	public static final String[] FILTER_EXTS_CONFIG = { "*.rcfg" };
	
	public static final String[] FILTER_NAMES_SCENARIO = { "RESTest Scenario Files (*.rscn)" };
	public static final String[] FILTER_EXTS_SCENARIO = { "*.rscn" };
	
	/**
	 * Prepares new FileDialog according to the given parameters.
	 * 
	 * @param title title of the dialog.
	 * @param parentShell a shell which will be the parent of the new instance.
	 * @param style the style of dialog to construct.
	 * @return prepared dialog.
	 */
	public static FileDialog getFileDialog(String title, Shell parentShell, int style) {
		FileDialog fileDialog = new FileDialog(parentShell, style);
		fileDialog.setText(title);
		
		return fileDialog;
	}
	
	/**
	 * Prepares new FileDialog according to the given parameters.
	 * 
	 * @param title title of the dialog.
	 * @param filterNames file format limitation for the dialog.
	 * @param parentShell a shell which will be the parent of the new instance.
	 * @param style the style of dialog to construct.
	 * @return prepared dialog.
	 */
	public static FileDialog getFileDialog(String title, String[] filterNames, String[] filterExtensions, Shell parentShell, int style) {
		FileDialog fileDialog = getFileDialog(title, parentShell, style);
		fileDialog.setFilterNames(filterNames);
		fileDialog.setFilterExtensions(filterExtensions);
		
		return fileDialog;
	}
}
