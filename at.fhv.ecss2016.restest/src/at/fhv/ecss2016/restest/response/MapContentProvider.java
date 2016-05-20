package at.fhv.ecss2016.restest.response;

import java.util.Map;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class MapContentProvider implements IStructuredContentProvider {  
	   
    @Override  
    public void dispose() { }  
 
    @Override  
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) { }  
 
    @SuppressWarnings("rawtypes")  
    @Override  
    public Object[] getElements(Object inputElement) {  
         if (inputElement == null) return null;  
           
         if (inputElement instanceof Map) {  
              return ((Map) inputElement).entrySet().toArray();  
         }  
      
         throw new RuntimeException("Invalid input for MapContentProvider: " + inputElement.getClass());  
    }
}


