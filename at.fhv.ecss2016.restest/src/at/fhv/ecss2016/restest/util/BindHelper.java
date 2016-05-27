package at.fhv.ecss2016.restest.util;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.Observables;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.map.WritableMap;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Widget;

/**
 * BindHelper provides observable property functionality for custom parts.
 * 
 * @author Sergii Maidanov at 24.05.2016
 */
public class BindHelper {
	
	private static final DataBindingContext DBC = new DataBindingContext();
	private static final IObservableMap ATTRIBUTES_MAP = new WritableMap();
	
	public BindHelper() {
	}

	/**
	 * Associates {@code Widget} text with the given attribute.
	 * 
	 * @param attribute attribute with which the specified {@code Widget} is to be associated.
	 * @param widget widget content of which will be associated to the given attribute.
	 * @return {@code Binding} - created binding.
	 */
	public Binding bindWidgetText(String attribute, Widget widget) {
	    ISWTObservableValue widgetAttributeObservable = WidgetProperties.text(SWT.Modify).observe(widget);
		return bindObservableValue(attribute, widgetAttributeObservable);
	}
	
	/**
	 * Associates {@code Viewer} selection with the given attribute.
	 * 
	 * @param attribute attribute with which the specified {@code Viewer} is to be associated.
	 * @param viewer viewer selection of which will be associated to the given attribute.
	 * @return {@code Binding} - created binding.
	 */
	public Binding bindViewerSelection(String attribute, Viewer viewer) {
		IViewerObservableValue viewerAttributeObservable = ViewerProperties.singleSelection().observe(viewer);
		return bindObservableValue(attribute, viewerAttributeObservable);
	}
	
	/**
	 * Associates {@code Viewer} input with the given attribute.
	 * 
	 * @param attribute attribute with which the specified {@code Viewer} is to be associated.
	 * @param viewer viewer input of which will be associated to the given attribute.
	 * @return {@code Binding} - created binding.
	 */
	public Binding bindViewerInput(String attribute, Viewer viewer) {
		IViewerObservableValue viewerAttributeObservable = ViewerProperties.input().observe(viewer);
		return bindObservableValue(attribute, viewerAttributeObservable);
	}
	
	/**
	 * Associates {@code IObservableValue} with the given attribute.
	 * 
	 * @param attribute attribute with which the specified value is to be associated.
	 * @param observableValue observable value which will be associated to the given attribute.
	 * @return {@code Binding} - created binding.
	 */
	public Binding bindObservableValue(String attribute, IObservableValue observableValue) {
		IObservableValue widgetObservable = Observables.observeMapEntry(ATTRIBUTES_MAP, attribute);
		return DBC.bindValue(observableValue, widgetObservable);
	}
	
	/**
	 * Returns value for the given attribute key.
	 * 
	 * @param attributeKey attribute with which the specified value is associated.
	 * @return the current value associated with key, or null if there was no mapping for key.
	 */
	public Object getAttributeValue(String attributeKey) {
		return ATTRIBUTES_MAP.get(attributeKey);
	}
	
	/**
	 * Updates value for the given attribute key.
	 * 
	 * @param attributeKey attribute with which the specified value is to be associated.
	 * @param value value to be associated with the specified attribute key.
	 * @return the previous value associated with key, or null if there was no mapping for key.
	 */
	public Object updateAttributeValue(String attributeKey, Object value) {
		return ATTRIBUTES_MAP.put(attributeKey, value);
	}
}
