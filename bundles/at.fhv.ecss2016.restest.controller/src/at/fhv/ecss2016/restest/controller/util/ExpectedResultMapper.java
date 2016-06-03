package at.fhv.ecss2016.restest.controller.util;

import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;

import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.ExpectedResult;
import at.fhv.ecss2016.restest.model.ModelFactory;
import at.fhv.ecss2016.restest.model.StatusCode;

public class ExpectedResultMapper implements Function<JsonNode, ExpectedResult>{

	private final static String STATUS_CODE = "statusCode";
	private final static String CONTENT_TYPE = "contentType";
	private final static String RESPONSE_BODY = "responseBody";
	
	@Override
	public ExpectedResult apply(JsonNode jsonNode) {
		
		ExpectedResult expectedResult = ModelFactory.eINSTANCE.createExpectedResult();
		
		JsonNode statusCodeNode = jsonNode.get(STATUS_CODE);
		if (isNonNullValueNode(statusCodeNode)) expectedResult.setStatusCode(StatusCode.getByName(statusCodeNode.asText()));
		
		JsonNode contentTypeNode = jsonNode.get(CONTENT_TYPE);
		if (isNonNullValueNode(contentTypeNode)) expectedResult.setContentType(ContentType.getByName(contentTypeNode.asText()));
		
		JsonNode responseBodyNode = jsonNode.get(RESPONSE_BODY);
		if (isNonNullValueNode(responseBodyNode)) expectedResult.setResponseBody(responseBodyNode.asText());

		return expectedResult;
	}
	
	private boolean isNonNullValueNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isValueNode();
	}
}
