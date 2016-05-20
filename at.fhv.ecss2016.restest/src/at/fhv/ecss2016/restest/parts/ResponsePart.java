package at.fhv.ecss2016.restest.parts;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import at.fhv.ecss2016.restest.response.HttpProvider;
import at.fhv.ecss2016.restest.response.JsonProvider;

public class ResponsePart {
	
	private static final JsonProvider JSON_PROVIDER = new JsonProvider();
	private static final HttpProvider HTTP_PROVIDER = new HttpProvider();
	
	@Inject
	public ResponsePart() {
	}
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	public void postConstruct(Composite parent, IEclipseContext context) throws MalformedURLException, IOException {
		//TODO class for Mathew
		parent.setLayout(new GridLayout(1, true));
		
		Map<String, Object> jsonMap = JSON_PROVIDER.getJsonMap();
		
		final Tree tree = new Tree(parent, SWT.BORDER | SWT.V_SCROLL);
		tree.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		//Iterates over the map to create the tree items. If the value is a HashMap, iterates over that map to create children
		TreeItem jsonItem = new TreeItem(tree, 0);
		jsonItem.setText("JSON");
		for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
			TreeItem treeParent = new TreeItem(jsonItem, 0);
			treeParent.setText(entry.getKey());
			System.out.println("parent set");
			if (entry.getValue() == null) {
			} else if (entry.getValue().getClass() != LinkedHashMap.class) {
				TreeItem treeChild = new TreeItem(treeParent, 0);
				treeChild.setText(entry.getValue().toString());
				System.out.println("child set");
			} else {
				Object childJsonMap = entry.getValue();
				for (Map.Entry<String, Object> childEntry : ((Map<String, Object>) childJsonMap).entrySet()) {
					TreeItem treeChild = new TreeItem(treeParent, 0);
					treeChild.setText(childEntry.getKey());
					if (childEntry.getValue() != null & childEntry.getValue().toString() != "") {
						TreeItem treeChildsChild = new TreeItem(treeChild, 0);
						treeChildsChild.setText(childEntry.getValue().toString());
					} 
				}
			}
		}
		jsonItem.setExpanded(true);
		
		Label responseCodeLabel = new Label(parent, SWT.NONE);
		try {
			responseCodeLabel.setText(HTTP_PROVIDER.getResponseCode());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}