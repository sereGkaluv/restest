package at.fhv.ecss2016.restest.controller.util;

import java.util.List;
import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;

import at.fhv.ecss2016.restest.model.ConfigResultPair;
import at.fhv.ecss2016.restest.model.ModelFactory;
import at.fhv.ecss2016.restest.model.Scenario;

public class ScenarioMapper implements Function<JsonNode, Scenario>{

	private static final String SCENARIOS_FILE = "scenariosFile";
	private static final String CONFIG_RESULT_PAIRS = "configResultPairs";
	
	@Override
	public Scenario apply(JsonNode jsonNode) {
		Scenario scenario = ModelFactory.eINSTANCE.createScenario();
		
		JsonNode scenariosFile = jsonNode.get(SCENARIOS_FILE);
		if (isNonNullValueNode(scenariosFile)) scenario.setScenariosFile(scenariosFile.asText());
		
		JsonNode configResultPairs = jsonNode.get(CONFIG_RESULT_PAIRS);
		List<ConfigResultPair> configResultPairsList = scenario.getConfigResultPairs();
		if (isNonNullContainerNode(configResultPairs)) {
			if (configResultPairs.isArray()) {
				for (JsonNode pairNode : configResultPairs) {
					ConfigResultPair configResultPair = new ConfigResultPairMapper().apply(pairNode);
					configResultPairsList.add(configResultPair);
				}
			}
		}
		
		return scenario;
	}
	
	private boolean isNonNullValueNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isValueNode();
	}

	private boolean isNonNullContainerNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isContainerNode();
	}
}
