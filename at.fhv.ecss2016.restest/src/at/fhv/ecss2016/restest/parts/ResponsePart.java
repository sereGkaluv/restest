package at.fhv.ecss2016.restest.parts;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;

import com.fasterxml.jackson.databind.JsonNode;

import at.fhv.ecss2016.restest.controller.JsonProvider;
import at.fhv.ecss2016.restest.model.Response;
import at.fhv.ecss2016.restest.util.StringConstants;

public class ResponsePart {

	private static final String CONTENT_TYPE_JSON = "application/json";
	private static final String KEY_VALUE_DELIMITER = " : ";
	
	private static final String ICON_REPRESENTATION_JSON_TREE = "icons/representation/json_tree.png";
	private static final String ICON_REPRESENTATION_BROWSER = "icons/representation/browser.png";
	private static final String ICON_REPRESNTATION_TEXT = "icons/representation/text.png";
	
	private static final String ICON_JSON_ARRAY = "icons/json/array.png";
	private static final String ICON_JSON_OBJECT = "icons/json/object.png";
	private static final String ICON_JSON_VALUE_BOOLEAN = "icons/json/boolean.png";
	private static final String ICON_JSON_VALUE_NULL = "icons/json/null.png";
	private static final String ICON_JSON_VALUE_NUMBER = "icons/json/number.png";
	private static final String ICON_JSON_VALUE_STRING = "icons/json/string.png";

	private final Image _imageRepresentationJson;
	private final Image _imageRepresentationBrowser;
	private final Image _imageRepresentationText;
	
	private final Image _imageJsonArray;
	private final Image _imageJsonObject;
	private final Image _imageJsonValueBoolean;
	private final Image _imageJsonValueNull;
	private final Image _imageJsonValueNumber;
	private final Image _imageJsonValueString;

	@Inject
	public ResponsePart() {
		// Caching images
		ClassLoader classLoader = getClass().getClassLoader();
		
		_imageRepresentationJson = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_REPRESENTATION_JSON_TREE)
		).createImage();

		_imageRepresentationBrowser = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_REPRESENTATION_BROWSER)
		).createImage();
		
		_imageRepresentationText = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_REPRESNTATION_TEXT)
		).createImage();

		_imageJsonArray = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_JSON_ARRAY)
		).createImage();
		
		_imageJsonObject = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_JSON_OBJECT)
		).createImage();
		
		_imageJsonValueBoolean = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_JSON_VALUE_BOOLEAN)
		).createImage();
		
		_imageJsonValueNull = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_JSON_VALUE_NULL)
		).createImage();
		
		_imageJsonValueNumber = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_JSON_VALUE_NUMBER)
		).createImage();
		
		_imageJsonValueString = ImageDescriptor.createFromURL(
			classLoader.getResource(ICON_JSON_VALUE_STRING)
		).createImage();
	}

	@PostConstruct
	public void postConstruct(Display display, Composite parent, IEclipseContext context)
	throws MalformedURLException, IOException {

		parent.setLayout(new GridLayout(2, false));
				
		// Setting parent font
		FontData initFontData = parent.getFont().getFontData()[0];
		
		FontData fontData = new FontData(initFontData.getName(), initFontData.getHeight(), SWT.BOLD);
		Font defaultFont = new Font(parent.getDisplay(), fontData);

		Response response = (Response) context.get(
			StringConstants.CONFIG_RESPONSE.getConstant()
		);
		
		// If we received a response
		if (response != null) {
			
			// Displaying not a JSON response
			TabFolder tabFolder = new TabFolder(parent, SWT.NONE);
			tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
			
			if (CONTENT_TYPE_JSON.equals(response.getResponseContentType().getLiteral())) {
				
				// First display possibility 
				TabItem jsonTreeTab = new TabItem(tabFolder, SWT.NULL);
				jsonTreeTab.setImage(_imageRepresentationJson);
				jsonTreeTab.setText("JSON Tree");
				
				// Displaying JSON response
				Tree tree = new Tree(tabFolder, SWT.SINGLE | SWT.V_SCROLL | SWT.H_SCROLL);
				jsonTreeTab.setControl(tree);

				try {
					
					// Getting iterator for the JSON tree
					Iterator<Entry<String, JsonNode>> jsonTreeIterator = new JsonProvider().readUnknownJSON(response.getResponseBody());
					
					// Displaying JSON tree as a root of {@code treeRoot}
					displayJsonTree(tree, jsonTreeIterator);
					
					// Expanding all elements until multiple children detected
					TreeItem topItem = tree.getTopItem();
					while (topItem != null) {
						topItem.setExpanded(true);
						
						// If current element has one child or it is a last single element -> expand
						if (topItem.getItemCount() == 1 || topItem.getItemCount() > 1 && topItem.getParent().getItemCount() == 1) {
							topItem = topItem.getItem(0);
						} else {
							topItem = null;
						}
					}
				
				} catch (Exception e) { e.printStackTrace(); }
			
			} else {

				// First display possibility 
				TabItem browserTab = new TabItem(tabFolder, SWT.NULL);
				browserTab.setImage(_imageRepresentationBrowser);
				browserTab.setText("Browser");
				
				Browser browser = new Browser(tabFolder, SWT.NONE);
				browser.setText(response.getResponseBody());
				browserTab.setControl(browser);
			}
			
			// Alternative representation
			TabItem textTab = new TabItem(tabFolder, SWT.NULL);
			textTab.setImage(_imageRepresentationText);
			textTab.setText("Raw representation");
					
			Text responseText = new Text(tabFolder, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
			responseText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
			responseText.addKeyListener(new KeyAdapter() {
			    @Override
			    public void keyPressed(KeyEvent e) 
			    {
			        if(e.stateMask == SWT.CTRL && e.keyCode == 'a') responseText.selectAll();
			    }
			});
			responseText.setText(response.getResponseBody());
			textTab.setControl(responseText);
			
			// Showing additional information
			Label contentTypeLabel = new Label(parent, SWT.NONE);
			contentTypeLabel.setText("Content-Type:");
			contentTypeLabel.setFont(defaultFont);
			
			Label contentTypeValueLabel = new Label(parent, SWT.NONE);
			contentTypeValueLabel.setText(response.getResponseContentType().getLiteral());
			
			Label responseCodeLabel = new Label(parent, SWT.NONE);
			responseCodeLabel.setText("Response code:");
			responseCodeLabel.setFont(defaultFont);
			
			Label responseCodeValueLabel = new Label(parent, SWT.NONE);
			int responseCode = response.getResponseCode().getValue();
			responseCodeValueLabel.setText(String.valueOf(responseCode));
		}
	}
	
	private void displayJsonTree(Tree tree, Iterator<Entry<String, JsonNode>> jsonTreeIterator) {
		
		//Actual complexity of this algorithm is ~ O(n)
	
		// Adding root elements to the queue 
		LinkedList<Entry<Widget, Iterator<Entry<String, JsonNode>>>> jsonTreeQueue = new LinkedList<>();
		jsonTreeQueue.add(new AbstractMap.SimpleImmutableEntry<>(tree, jsonTreeIterator));

		// Handling all available pairs
		while (!jsonTreeQueue.isEmpty()) {
		
			Entry<Widget, Iterator<Entry<String, JsonNode>>> currentPair = jsonTreeQueue.poll();
			
			Widget currentRootElement = currentPair.getKey();
			Iterator<Entry<String, JsonNode>> currentIterator = currentPair.getValue();
			
			// Iterates over the collection to create the tree items
			// If child value is a JsonNode, adds to the queue for further processing
			while (currentIterator.hasNext()) {
				
					
				Entry<String, JsonNode> currentEntry = currentIterator.next();
				
				TreeItem currentTreeElement = null;
				
				if (currentRootElement instanceof TreeItem) {
					// Children that have "treeItem" as root element
					currentTreeElement = new TreeItem((TreeItem) currentRootElement, SWT.NONE);
				} else if (currentRootElement instanceof Tree) {
					// Children that have "tree" as root element
					currentTreeElement = new TreeItem((Tree) currentRootElement, SWT.NONE);
				} else {
					// Normally this point will be never reached
					return;
				}
				
				String stringEntry = currentEntry.getKey();
				JsonNode entryValue = currentEntry.getValue();
				
				if (entryValue.isValueNode()) {
					
					// We have reached the deepest value for this tree, branch traversing is finished
					if (entryValue.isNumber()) currentTreeElement.setImage(_imageJsonValueNumber);
					else if (entryValue.isBoolean()) currentTreeElement.setImage(_imageJsonValueBoolean);
					else if (entryValue.isTextual()) currentTreeElement.setImage(_imageJsonValueString);
					else if (entryValue.isNull()) currentTreeElement.setImage(_imageJsonValueNull);
					
					stringEntry = stringEntry + KEY_VALUE_DELIMITER + entryValue.toString();
					
				} else if (entryValue.isArray()) {
					
					currentTreeElement.setImage(_imageJsonArray);
					Iterator<JsonNode> arrayIterator = entryValue.elements();
					
					List<Entry<String, JsonNode>> arrayEntries = new LinkedList<>();
					
					while (arrayIterator.hasNext()) arrayEntries.add(
						new AbstractMap.SimpleImmutableEntry<>(String.valueOf(arrayEntries.size()), arrayIterator.next())
					);
					
					jsonTreeQueue.add(new AbstractMap.SimpleImmutableEntry<>(currentTreeElement, arrayEntries.iterator()));
					
				} else if (entryValue.isObject()){
					
					// There are child elements in this value adding to the queue for further processing
					currentTreeElement.setImage(_imageJsonObject);					
					jsonTreeQueue.add(new AbstractMap.SimpleImmutableEntry<>(currentTreeElement, entryValue.fields()));
				}
				
				currentTreeElement.setText(stringEntry);
			}
		}
	}
}