package at.fhv.ecss2016.restest.controller.util;

import java.util.function.Function;

import com.fasterxml.jackson.databind.JsonNode;

import at.fhv.ecss2016.restest.model.ContentType;
import at.fhv.ecss2016.restest.model.ExpectedResult;
import at.fhv.ecss2016.restest.model.ModelFactory;
import at.fhv.ecss2016.restest.model.StatusCode;

public class ExpectedResultMapper implements Function<JsonNode, ExpectedResult>{

	private final static String RESPONSE_CODE = "responseCode";
	private final static String RESPONSE_CONTENT_TYPE = "responseContentType";
	private final static String RESPONSE_BODY = "responseBody";
	
	@Override
	public ExpectedResult apply(JsonNode jsonNode) {
		
		ExpectedResult expectedResult = ModelFactory.eINSTANCE.createExpectedResult();
		
		JsonNode responseCode = jsonNode.get(RESPONSE_CODE);
		if (isNonNullValueNode(responseCode)) expectedResult.setResponseCode(StatusCode.get(responseCode.asInt()));
		
		JsonNode responseContentType = jsonNode.get(RESPONSE_CONTENT_TYPE);
		if (isNonNullValueNode(responseContentType)) expectedResult.setResponseContentType(ContentType.get(responseContentType.asText()));
		
		JsonNode responseBody = jsonNode.get(RESPONSE_BODY);
		if (isNonNullValueNode(responseBody)) expectedResult.setResponseBody(responseBody.asText());

		return expectedResult;
	}
	
	private boolean isNonNullValueNode(JsonNode jsonNode) {
		return jsonNode != null && jsonNode.isValueNode();
	}
}
