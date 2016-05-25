package at.fhv.ecss2016.restest.controller.util;

import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;

import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.Response;
import at.fhv.ecss2016.restest.model.StatusCode;
import at.fhv.ecss2016.restest.model.impl.ModelFactoryImpl;

public class ResponseMapper implements Function<JsonNode, Response> {
	
	private final static String RESPONSE_CODE = "responseCode";
	private final static String RESPONSE_CONTENT_TYPE = "responseContentType";
	private final static String RESPONSE_TIME = "responseTime";
	private final static String RESPONSE_BODY = "responseBody";
	
	@Override
	public Response apply(JsonNode jsonNode) {
		
		Response response = ModelFactoryImpl.eINSTANCE.createResponse();
		
		JsonNode responseCode = jsonNode.get(RESPONSE_CODE);
		if (isNonNullValueNode(responseCode)) response.setResponseCode(StatusCode.get(responseCode.asInt()));
		
		JsonNode responseContentType = jsonNode.get(RESPONSE_CONTENT_TYPE);
		if (isNonNullValueNode(responseContentType)) response.setResponseContentType(ContentType.get(responseContentType.asText()));
		
		JsonNode responseTime = jsonNode.get(RESPONSE_TIME);
		if (isNonNullValueNode(responseTime)) response.setResponseTime(responseTime.asText());
		
		JsonNode responseBody = jsonNode.get(RESPONSE_BODY);
		if (isNonNullValueNode(responseBody)) response.setResponseBody(responseBody.asText());

		return response;
	}

	private boolean isNonNullValueNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isValueNode();
	}
}
