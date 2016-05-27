package at.fhv.ecss2016.restest.controller.util;

import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;

import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.ConfigExpectedResultPair;
import at.fhv.ecss2016.restest.model.ExpectedResult;
import at.fhv.ecss2016.restest.model.ModelFactory;

public class ConfigExpectedResultPairMapper implements Function<JsonNode, ConfigExpectedResultPair>{
	
	private static final String CONFIG = "config";
	private static final String EXPECTED_RESULT = "expectedResult";

	@Override
	public ConfigExpectedResultPair apply(JsonNode jsonNode) {

		ConfigExpectedResultPair configExpectedResultPair = ModelFactory.eINSTANCE.createConfigExpectedResultPair();

		JsonNode configNode = jsonNode.get(CONFIG);
		if (isNonNullObjectNode(configNode)) {
			Config config = new ConfigMapper().apply(configNode);
			configExpectedResultPair.setConfig(config);
		}
		
		JsonNode expectedResultNode = jsonNode.get(EXPECTED_RESULT);
		if (isNonNullObjectNode(expectedResultNode)) {
			ExpectedResult expectedResult = new ExpectedResultMapper().apply(expectedResultNode);
			configExpectedResultPair.setExpectedResult(expectedResult);
		}
		
		return configExpectedResultPair;
	}
	
	private boolean isNonNullObjectNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isObject();
	}
}
