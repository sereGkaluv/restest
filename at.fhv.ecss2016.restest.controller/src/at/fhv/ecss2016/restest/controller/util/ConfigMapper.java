package at.fhv.ecss2016.restest.controller.util;

import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;

import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.HttpVerb;
import at.fhv.ecss2016.restest.model.ModelFactory;

public class ConfigMapper implements Function<JsonNode, Config> {
	
	private static final String NAME = "name";
	private static final String REQUEST_URL = "requestURL";
	private static final String HTTP_VERB = "httpVerb";
	private static final String CONTENT_TYPE = "contentType";
	private static final String REQUEST_BODY = "requestBody";
	private static final String RESPONSE = "response";
	
	@Override
	public Config apply(JsonNode jsonNode) {
		
		Config config = ModelFactory.eINSTANCE.createConfig();
		
		JsonNode nameNode = jsonNode.get(NAME);
		if (isNonNullValueNode(nameNode)) config.setName(nameNode.asText());
		
		JsonNode requestURLNode = jsonNode.get(REQUEST_URL);
		if (isNonNullValueNode(requestURLNode)) config.setRequestURL(requestURLNode.asText());
		
		JsonNode verbNode = jsonNode.get(HTTP_VERB);
		if (isNonNullValueNode(verbNode)) config.setHttpVerb(HttpVerb.getByName(verbNode.asText()));
		
		JsonNode contentTypeNode = jsonNode.get(CONTENT_TYPE);
		if (isNonNullValueNode(contentTypeNode)) config.setContentType(ContentType.getByName(contentTypeNode.asText()));
		
		JsonNode requestBodyNode = jsonNode.get(REQUEST_BODY);
		if (isNonNullValueNode(requestBodyNode)) config.setRequestBody(requestBodyNode.asText());
		
		JsonNode responseNode = jsonNode.get(RESPONSE);
		if (isNonNullObjectNode(responseNode)) config.setResponse(new ResponseMapper().apply(responseNode));
		
		return config;
	}
	
	private boolean isNonNullValueNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isValueNode();
	}
	
	private boolean isNonNullObjectNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isObject();
	}
}
