package at.fhv.ecss2016.restest.controller.util;

import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;

import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.Response;
import at.fhv.ecss2016.restest.model.StatusCode;
import at.fhv.ecss2016.restest.model.impl.ModelFactoryImpl;

public class ResponseMapper implements Function<JsonNode, Response> {
	
	private final static String STATUS_CODE = "statusCode";
	private final static String CONTENT_TYPE = "contentType";
	private final static String RESPONSE_TIME = "responseTime";
	private final static String RESPONSE_BODY = "responseBody";
	
	@Override
	public Response apply(JsonNode jsonNode) {
		
		Response response = ModelFactoryImpl.eINSTANCE.createResponse();
		
		JsonNode statusCodeNode = jsonNode.get(STATUS_CODE);
		if (isNonNullValueNode(statusCodeNode)) response.setStatusCode(StatusCode.getByName(statusCodeNode.asText()));
		
		JsonNode contentTypeNode = jsonNode.get(CONTENT_TYPE);
		if (isNonNullValueNode(contentTypeNode)) response.setContentType(ContentType.getByName(contentTypeNode.asText()));
		
		JsonNode responseTimeNode = jsonNode.get(RESPONSE_TIME);
		if (isNonNullValueNode(responseTimeNode)) response.setResponseTime(responseTimeNode.asText());
		
		JsonNode responseBodyNode = jsonNode.get(RESPONSE_BODY);
		if (isNonNullValueNode(responseBodyNode)) response.setResponseBody(responseBodyNode.asText());

		return response;
	}

	private boolean isNonNullValueNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isValueNode();
	}
}
