package at.fhv.ecss2016.restest.controller.util;

import java.util.List;
import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;

import at.fhv.ecss2016.restest.model.ConfigExpectedResultPair;
import at.fhv.ecss2016.restest.model.ModelFactory;
import at.fhv.ecss2016.restest.model.Scenario;

public class ScenarioMapper implements Function<JsonNode, Scenario>{

	private static final String SCENARIO_FILE_PATH = "scenarioFilePath";
	private static final String CONFIG_EXPECTED_RESULT_PAIR_LIST = "configExpectedResultPairList";
	
	@Override
	public Scenario apply(JsonNode jsonNode) {
		
		Scenario scenario = ModelFactory.eINSTANCE.createScenario();
		
		JsonNode scenarioFileNode = jsonNode.get(SCENARIO_FILE_PATH);
		if (isNonNullValueNode(scenarioFileNode)) scenario.setScenarioFilePath(scenarioFileNode.asText());
		
		JsonNode configExpectedResultPairListNode = jsonNode.get(CONFIG_EXPECTED_RESULT_PAIR_LIST);
		List<ConfigExpectedResultPair> configResultPairsList = scenario.getConfigExpectedResultPairList();
		if (isNonNullArrayNode(configExpectedResultPairListNode)) {
			for (JsonNode pairNode : configExpectedResultPairListNode) {
				ConfigExpectedResultPair configExpectedResultPair = new ConfigExpectedResultPairMapper().apply(pairNode);
				configResultPairsList.add(configExpectedResultPair);
			}
		}
		
		return scenario;
	}
	
	private boolean isNonNullValueNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isValueNode();
	}
	
	private boolean isNonNullArrayNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isArray();
	}
}
