package at.fhv.ecss2016.restest.response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class JsonProvider {

	private UrlSource urlSource = new UrlSource();
    
	public JsonProvider() {
	}
	
	public Map<String, Object> getJsonMap()
	throws MalformedURLException, IOException {
		return createJson();
	}
	
	@SuppressWarnings("unchecked") 
	public Map<String,Object> getJsonMapFactory(String jsonText)
	throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonText, Map.class);
	}
	
	private Map<String, Object> createJson()
	throws JsonParseException, JsonMappingException, IOException {
		String url = urlSource.url;
		
		InputStream inputStream = new URL(url).openStream();
        BufferedReader bReader = new BufferedReader(
    		new InputStreamReader(inputStream, Charset.forName("UTF-8"))
		);
        
        String jsonText = readAll(bReader);
        
        inputStream.close();
        bReader.close();
        
        //Need to remove [] from the Json string to work with Jackson
        String json = jsonText.substring(1, jsonText.length()-1);
        
        //Parse the Json into a map
        return getJsonMapFactory(json);
	}
	
    private String readAll(Reader rd)
	throws IOException {

	    BufferedReader reader = new BufferedReader(rd);
	    StringBuilder stringBuilder = new StringBuilder();
	    
	    String line = null;
	    while ((line = reader.readLine()) != null) {
	        stringBuilder.append(line);
	    }
	    
	    reader.close();
	    
	    return stringBuilder.toString();
    }
}
