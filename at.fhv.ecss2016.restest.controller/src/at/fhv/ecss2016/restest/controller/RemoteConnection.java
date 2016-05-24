package at.fhv.ecss2016.restest.controller;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import at.fhv.ecss2016.restest.model.ModelFactory;
import at.fhv.ecss2016.restest.model.Response;

/**
 * ConfigPart UI and logic definition.
 * 
 * @author Sergii Maidanov at 21.05.2016
 */
public class RemoteConnection {
	
	private static final String NOT_AVAILABLE = "N/A";
	private static final String HEADER_CONTENT_TYPE = "Content-Type";
	
	private static final String CONTENT_TYPE_TEXT = "text";
	private static final String CONTENT_TYPE_TEXT_PLAIN = "text/plain";
	private static final String CONTENT_TYPE_XML_TEXT = "text/xml";
	private static final String CONTENT_TYPE_XML_APPLICATION = "application/xml";
	private static final String CONTENT_TYPE_JSON = "application/json";
	private static final String CONTENT_TYPE_HTML = "text/html";
	private static final String CONTENT_TYPE_JAVASCRIPT = "application/javascript";
	
	public RemoteConnection() {
	}
	
	/**
	 * Sends HTTP GET request using given parameters.
	 * 
	 * @param uri where request will be send.
	 * @param contentType type of the content if available
	 * @return instance of {@code Response}, containing response information for produced request.
	 * @throws IOException
	 */
	public Response sendGetRequest(String uri, at.fhv.ecss2016.restest.model.ContentType contentType)
	throws IOException {
		
		// Assembling request
		HttpGet requestBase = new HttpGet(uri);
		
		return sendRequest(contentType, requestBase);
	}
	
	/**
	 * Sends HTTP POST request using given parameters.
	 * 
	 * @param uri where request will be send.
	 * @param contentType type of the content if available.
	 * @body body (content) of the request.
	 * @return instance of {@code Response}, containing response information for produced request.
	 * @throws IOException
	 */
	public Response sendPostRequest(String uri, at.fhv.ecss2016.restest.model.ContentType contentType, String body)
	throws IOException {
		
		// Assembling request
		HttpPost requestBase = new HttpPost(uri);
		
		StringEntity bodyEntity = new StringEntity(body);
		requestBase.setEntity(bodyEntity);

		return sendRequest(contentType, requestBase);
	}
	
	/**
	 * Sends HTTP request using given parameters.
	 * 
	 * @param uri where request will be send.
	 * @param contentType type of the content if available.
	 * @body body (content) of the request.
	 * @return instance of {@code Response}, containing response information for produced request.
	 * @throws IOException
	 */
	public Response sendPutRequest(String uri, at.fhv.ecss2016.restest.model.ContentType contentType, String body)
	throws IOException {
		
		// Assembling request
		HttpPut requestBase = new HttpPut(uri);
		
		StringEntity bodyEntity = new StringEntity(body);
		requestBase.setEntity(bodyEntity);

		return sendRequest(contentType, requestBase);
	}
	
	/**
	 * Sends HTTP request according to the given parameters.
	 * 
	 * @param uri where request will be send.
	 * @param contentType type of the content if available.
	 * @return instance of {@code Response}, containing response information for produced request.
	 * @throws IOException
	 */
	public Response sendDeleteRequest(String uri, at.fhv.ecss2016.restest.model.ContentType contentType)
	throws IOException {
		
		// Assembling request
		HttpDelete requestBase = new HttpDelete(uri);
		
		return sendRequest(contentType, requestBase);
	}
	
	/**
	 * Helper method for sending HTTP requests using HttpRequestBase abstraction.
	 * 
	 * @param contentType type of the content if available.
	 * @param requestBase request base abstraction which may contain custom values like request body, etc.
	 * @return instance of {@code Response}, containing response information for produced request.
	 * @throws IOException
	 */
	private Response sendRequest(at.fhv.ecss2016.restest.model.ContentType contentType, HttpRequestBase requestBase)
	throws IOException {
		
		// Creating new client
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		// Setting content type to the request
		String contentTypeValue = getContentTypeValue(contentType);
		requestBase.setHeader(HEADER_CONTENT_TYPE, contentTypeValue);
		
		// Sending request
		CloseableHttpResponse rawHttpResponse = httpClient.execute(requestBase);
		
		// Fetching response data if available
		Response response = fetchResponse(rawHttpResponse);
		
		// Closing network stuff
		rawHttpResponse.close();
		httpClient.close();
		
		return response;
	}
	
	/**
	 * Helper method that fetches response code, content type, response body and assembles the into internal {@code Response} instance.
	 * 
	 * @param rawHttpResponse raw HTTP response to be used as a data source.
	 * @return instance of {@code Response}, containing response information fetched from {@code CloseableHttpResponse} response.
	 * @throws IOException
	 */
	private Response fetchResponse(CloseableHttpResponse rawHttpResponse)
	throws IOException {
		
		if (rawHttpResponse == null) return null;
		
		// Fetching response data if available
		int fetchedStatusCode = rawHttpResponse.getStatusLine().getStatusCode();
		
		HttpEntity responseEntity = rawHttpResponse.getEntity();

		ContentType responseContentType = ContentType.getOrDefault(responseEntity);
		String fetchedContentType = responseContentType.getMimeType();
		
		String fetchedBody = responseEntity != null ? EntityUtils.toString(responseEntity) : NOT_AVAILABLE;
		
		// Preparing internal response object
		Response response = ModelFactory.eINSTANCE.createResponse();
		response.setResponseCode(String.valueOf(fetchedStatusCode));
		response.setResponseContentType(fetchedContentType);
		response.setResponseBody(fetchedBody);
		
		return response;
	}

	/**
	 * Helper method that returns HTTP compatible content-types.
	 * 
	 * @param contentType internal content-type instance that will be converted to its HTTP string representation.
	 * @return HTTP string representation of content-type.
	 */
	private String getContentTypeValue(at.fhv.ecss2016.restest.model.ContentType contentType) {
		switch (contentType) {
			case TEXT: return CONTENT_TYPE_TEXT;
			
			case TEXT_PLAIN: return CONTENT_TYPE_TEXT_PLAIN;
			
			case XML_TEXT: return CONTENT_TYPE_XML_TEXT;
			
			case XML_APPLICATION: return CONTENT_TYPE_XML_APPLICATION;
			
			case JSON: return CONTENT_TYPE_JSON;
			
			case HTML: return CONTENT_TYPE_HTML;
			
			case JAVASCRIPT: return CONTENT_TYPE_JAVASCRIPT;
			
			default: return CONTENT_TYPE_TEXT;
		}
	}
}
