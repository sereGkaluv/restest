package at.fhv.ecss2016.restest.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.widgets.Composite;

public class ResponsePart {
	
	@Inject
	public ResponsePart() {
	}
	
	@PostConstruct
	public void postConstruct(Composite parent, IEclipseContext context) {
		//TODO class for Mathew
	}
}