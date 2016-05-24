package at.fhv.ecss2016.restest.controller.util;

import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;

import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.HttpVerb;
import at.fhv.ecss2016.restest.model.ModelFactory;

public class ConfigMapper implements Function<JsonNode, Config> {
	
	private static final String URL_FIELD = "requestURL";
	private static final String VERB = "verb";
	private static final String CONTENT_TYPE = "contentType";
	private static final String REQUEST_BODY = "requestBody";
	private static final String RESPONSE = "response";
	
	@Override
	public Config apply(JsonNode jsonNode) {
		Config config = ModelFactory.eINSTANCE.createConfig();
		
		JsonNode urlField = jsonNode.get(URL_FIELD);
		if (isNonNullValueNode(urlField)) config.setRequestURL(urlField.asText());
		
		JsonNode verb = jsonNode.get(VERB);
		if (isNonNullValueNode(verb)) config.setVerb(HttpVerb.get(verb.asText()));
		
		JsonNode contentType = jsonNode.get(CONTENT_TYPE);
		if (isNonNullValueNode(contentType)) config.setContentType(ContentType.get(contentType.asText()));
		
		JsonNode requestBody = jsonNode.get(REQUEST_BODY);
		if (isNonNullValueNode(requestBody)) config.setRequestURL(requestBody.asText());
		
		JsonNode response = jsonNode.get(RESPONSE);
		if (isNonNullValueNode(response)) config.setRequestURL(response.asText());
		
		return config;
	}
	
	private boolean isNonNullValueNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isValueNode();
	}
}
