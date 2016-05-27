package at.fhv.ecss2016.restest.controller.util;

import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;

import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.ConfigResultPair;
import at.fhv.ecss2016.restest.model.ModelFactory;
import at.fhv.ecss2016.restest.model.Response;

public class ConfigResultPairMapper implements Function<JsonNode, ConfigResultPair>{
	
	private static final String CONFIG = "config";
	private static final String RESPONSE = "response";

	@Override
	public ConfigResultPair apply(JsonNode jsonNode) {

		ConfigResultPair configResultPair = ModelFactory.eINSTANCE.createConfigResultPair();

		JsonNode configNode = jsonNode.get(CONFIG);
		if (isNonNullObjectNode(configNode)) {
			Config config = new ConfigMapper().apply(configNode);
			configResultPair.setConfig(config);
		}
		
		JsonNode responseNode = jsonNode.get(RESPONSE);
		if (isNonNullObjectNode(responseNode)) {
			Response response = new ResponseMapper().apply(responseNode);
			configResultPair.setResponse(response);
		}
		
		return configResultPair;
	}
	
	private boolean isNonNullObjectNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isObject();
	}
}
