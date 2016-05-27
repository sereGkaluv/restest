package at.fhv.ecss2016.restest.controller.util;

import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;

import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.ExpectedResult;
import at.fhv.ecss2016.restest.model.HttpVerb;
import at.fhv.ecss2016.restest.model.ModelFactory;

public class ConfigMapper implements Function<JsonNode, Config> {
	
	private static final String NAME = "name";
	private static final String REQUEST_URL = "requestURL";
	private static final String VERB = "verb";
	private static final String CONTENT_TYPE = "contentType";
	private static final String REQUEST_BODY = "requestBody";
	private static final String EXPECTED_RESULT= "expectedResult";
	
	@Override
	public Config apply(JsonNode jsonNode) {
		
		Config config = ModelFactory.eINSTANCE.createConfig();
		
		JsonNode name = jsonNode.get(NAME);
		if (isNonNullValueNode(name)) config.setName(name.asText());
		
		JsonNode requestURL = jsonNode.get(REQUEST_URL);
		if (isNonNullValueNode(requestURL)) config.setRequestURL(requestURL.asText());
		
		JsonNode verb = jsonNode.get(VERB);
		if (isNonNullValueNode(verb)) config.setVerb(HttpVerb.get(verb.asText()));
		
		JsonNode contentType = jsonNode.get(CONTENT_TYPE);
		if (isNonNullValueNode(contentType)) config.setContentType(ContentType.get(contentType.asText()));
		
		JsonNode requestBody = jsonNode.get(REQUEST_BODY);
		if (isNonNullValueNode(requestBody)) config.setRequestBody(requestBody.asText());
		
		JsonNode expectedResultNode = jsonNode.get(EXPECTED_RESULT);
		if (isNonNullArrayNode(expectedResultNode)) {
			ExpectedResult expectedResult = new ExpectedResultMapper().apply(expectedResultNode);
			config.setExpectedResult(expectedResult);
		}
		
		return config;
	}
	
	private boolean isNonNullValueNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isValueNode();
	}
	
	private boolean isNonNullArrayNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isArray();
	}
}
