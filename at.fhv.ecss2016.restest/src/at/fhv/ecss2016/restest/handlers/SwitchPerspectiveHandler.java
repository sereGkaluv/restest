 
package at.fhv.ecss2016.restest.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
/**
 * Handler that switches perspectives.
 * 
 * @author Sergii Maidanov on 24-05-2016
 */
public class SwitchPerspectiveHandler {
	
	@Execute
	public void execute(
		@Named("at.fhv.ecss2016.restest.commandparameter.perspectivestack.id") final String perspectiveStackId,
		@Named("at.fhv.ecss2016.restest.commandparameter.perspectivestack.perspective.id") final String perspectiveId,
		EModelService modelService,
		MTrimmedWindow window
	) {
		
		MPerspectiveStack perspectiveStack = (MPerspectiveStack) modelService.find(perspectiveStackId, window);
		if (perspectiveStack != null) {
			
			for (MPerspective perspective : perspectiveStack.getChildren()) {
				
				boolean isVisisblePerspective = perspective.isToBeRendered() && perspective.isVisible();
				
				if (isVisisblePerspective && perspective.getElementId().equals(perspectiveId)) {
					perspectiveStack.setSelectedElement(perspective);
				}
			}
		}
	}
}