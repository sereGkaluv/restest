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
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import com.fasterxml.jackson.databind.JsonNode;

import at.fhv.ecss2016.restest.controller.JsonProvider;
import at.fhv.ecss2016.restest.controller.util.ConfigMapper;
import at.fhv.ecss2016.restest.controller.util.ScenarioMapper;
import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.ConfigResultPair;
import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.HTTPVerb;
import at.fhv.ecss2016.restest.model.Response;
import at.fhv.ecss2016.restest.model.Scenario;
import at.fhv.ecss2016.restest.model.impl.ModelFactoryImpl;
import at.fhv.ecss2016.restest.util.StringConstants;

public class ResponsePart {

	private static final String CONTENT_TYPE_JSON = "application/json";
	private static final String ROOT_ELEMENT = "JSON";
	private static final String ARRAY_PLACEHOLDER = "{}";
	private static final String KEY_VALUE_DELIMITER = " : ";
	
	private static final JsonProvider JSON_PROVIDER = new JsonProvider();

	@Inject
	public ResponsePart() {
	}

	@PostConstruct
	public void postConstruct(Display display, Composite parent, IEclipseContext context)
	throws MalformedURLException, IOException {

		parent.setLayout(new GridLayout(2, false));
		
		//Serialize test content
		Response testResponse = ModelFactoryImpl.eINSTANCE.createResponse();
		testResponse.setResponseBody("test response");
		testResponse.setResponseCode("200 OK");
		testResponse.setResponseContentType("text");
		testResponse.setResponseTime("0 seconds");
		
		Config config = ModelFactoryImpl.eINSTANCE.createConfig();
		config.setContentType(ContentType.TEXT);
		config.setRequestBody("test request body");
		config.setRequestURL("http://url.com");
		config.setResponse(testResponse);
		config.setVerb(HTTPVerb.GET);
		JSON_PROVIDER.serialize("C:\\Users\\msmith\\Desktop\\output.json", config);
		
		Scenario scenario = ModelFactoryImpl.eINSTANCE.createScenario();
		scenario.setScenariosFile("C:\\Users\\msmith\\Desktop\\output.json");
		
		ConfigResultPair configResultPair = ModelFactoryImpl.eINSTANCE.createConfigResultPair();
		configResultPair.setConfig(config);
		configResultPair.setResponse(testResponse);
		List<ConfigResultPair> configResultPairsList = scenario.getConfigResultPairs();
		configResultPairsList.add(configResultPair);

		Scenario deserializedScenario = JSON_PROVIDER.deserialize("C:\\Users\\msmith\\Desktop\\output.json", new ScenarioMapper());
		System.out.println(deserializedScenario.getConfigResultPairs());
		
		// Setting parent font
		FontData initFontData = parent.getFont().getFontData()[0];
		
		FontData fontData = new FontData(initFontData.getName(), initFontData.getHeight(), SWT.BOLD);
		Font defaultFont = new Font(parent.getDisplay(), fontData);

		Response response = (Response) context.get(
			StringConstants.CONFIG_RESPONSE.getConstant()
		);
		
		// If we received a response
		if (response != null) {
			
			// Starting async task so GUI will not freeze //TODO update ui
			display.syncExec(() -> {
				
				if (CONTENT_TYPE_JSON.equals(response.getResponseContentType())) {
					
					// Displaying JSON response
					Tree tree = new Tree(parent, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
					tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		
					TreeItem treeRoot = new TreeItem(tree, SWT.NONE);
					treeRoot.setText(ROOT_ELEMENT + KEY_VALUE_DELIMITER + ARRAY_PLACEHOLDER);

					try {
						
						// Getting iterator for the JSON tree
						Iterator<Entry<String, JsonNode>> jsonTreeIterator = JSON_PROVIDER.readJSON(response.getResponseBody());
						
						// Displaying JSON tree as a root of {@code treeRoot}
						displayJsonTree(treeRoot, jsonTreeIterator);
						
					} catch (Exception e) { e.printStackTrace(); }
				
				} else {
					
					// Displaying not a JSON response
					StyledText styledText = new StyledText(parent, SWT.BORDER | SWT.V_SCROLL | SWT.WRAP);
					styledText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
					styledText.setText(response.getResponseBody());
				}
				
				// Showing additional information
				Label contentTypeLabel = new Label(parent, SWT.NONE);
				contentTypeLabel.setText("Content-Type:");
				contentTypeLabel.setFont(defaultFont);
				
				Label contentTypeValueLabel = new Label(parent, SWT.NONE);
				contentTypeValueLabel.setText(response.getResponseContentType());
				
				Label responseCodeLabel = new Label(parent, SWT.NONE);
				responseCodeLabel.setText("Response code:");
				responseCodeLabel.setFont(defaultFont);
				
				Label responseCodeValueLabel = new Label(parent, SWT.NONE);
				responseCodeValueLabel.setText(response.getResponseCode());
			});
		}
	}
	
	private void displayJsonTree(TreeItem treeRootElement, Iterator<Entry<String, JsonNode>> jsonTreeIterator) {
	
		// Adding root elements to the queue
		LinkedList<Entry<TreeItem, Iterator<Entry<String, JsonNode>>>> jsonTreeQueue = new LinkedList<>();
		jsonTreeQueue.add(new AbstractMap.SimpleImmutableEntry<>(treeRootElement, jsonTreeIterator));

		// Handling all available pairs
		while (!jsonTreeQueue.isEmpty()) {
		
			Entry<TreeItem, Iterator<Entry<String, JsonNode>>> currentPair = jsonTreeQueue.poll();
			
			TreeItem currentRootElement = currentPair.getKey();
			Iterator<Entry<String, JsonNode>> currentIterator = currentPair.getValue();
			
			// Iterates over the collection to create the tree items
			// If child value is a JsonNode, adds to the queue for further processing
			while (currentIterator.hasNext()) {
				Entry<String, JsonNode> currentEntry = currentIterator.next();
				
				TreeItem currentTreeElement = new TreeItem(currentRootElement, SWT.NONE);
				String stringEntry = currentEntry.getKey();
				JsonNode entryValue = currentEntry.getValue();
				
				if (entryValue.isValueNode()) {
					// We have reached the deepest value for this tree, branch traversing is finished
					stringEntry = stringEntry + KEY_VALUE_DELIMITER + entryValue.toString();
				} else {
					// There are child elements in this value adding to the queue for further processing
					stringEntry = stringEntry + KEY_VALUE_DELIMITER + ARRAY_PLACEHOLDER;
					jsonTreeQueue.add(new AbstractMap.SimpleImmutableEntry<>(currentTreeElement, entryValue.fields()));
				}
				
				currentTreeElement.setText(stringEntry);
			}
		}
		
		// Expanding root tree element
		treeRootElement.setExpanded(true);
	}
}