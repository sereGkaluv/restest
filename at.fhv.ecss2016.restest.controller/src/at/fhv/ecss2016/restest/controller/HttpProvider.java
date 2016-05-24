package at.fhv.ecss2016.restest.controller;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class HttpProvider {

	private Map<String, List<String>> httpMap;
	private String responseCode;
	private String contentType;
	
	public void CreateHttpHeader()
	throws IOException {
		String url = "https://api.github.com/users/MathewJS/repos";
		
		URL urlObject = new URL(url);
		URLConnection connection = urlObject.openConnection();
		
		//Creates a map of the HTTP header where Key = field name, Value = field content.
		httpMap = connection.getHeaderFields();

		//Gets response code (e.g. 200 OK) as a string
		responseCode = connection.getHeaderField(0);
		contentType = connection.getHeaderField("Content-Type");
	}
	
	public Map<String, List<String>> GetHttpMap()
	throws IOException {
		CreateHttpHeader();
		return httpMap;
	}
	
	public String getResponseCode()
	throws IOException {
		CreateHttpHeader();
		return responseCode;
	}
	
	public String getContentType()
	throws IOException {
		CreateHttpHeader();
		return contentType;
	}
}
