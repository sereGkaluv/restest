package at.fhv.ecss2016.restest.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import at.fhv.ecss2016.restest.model.Config;
import at.fhv.ecss2016.restest.model.Response;

public class JsonProvider {
    
	private static final String DEFAULT_ENCODING = "UTF-8";
	private static final String URL = "https://api.github.com/users/MathewJS/repos";
	private ObjectMapper mapper = new ObjectMapper();
	
	public JsonProvider() {
	}
	
	public Iterator<Entry<String, JsonNode>> readJSON(String jsonString)
	throws JsonProcessingException, IOException {
        
        //Need to remove [] from the JSON string to work with Jackson
		String json = jsonString;
		
		if (json.startsWith("[") && json.endsWith("]")) {
			json = json.substring(1, json.length() - 1);
		}
        
    	JsonNode root = new ObjectMapper().readTree(json);
        return root.fields();
	}	
	
	@SuppressWarnings("unchecked")
	public Map<String,Object> getJsonMapFactory(String jsonText)
	throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        
        return mapper.readValue(jsonText, Map.class);
	}
	
	public Map<String, Object> createJSON()
	throws JsonParseException, JsonMappingException, IOException {
		
		InputStream inputStream = new URL(URL).openStream();
        BufferedReader bReader = new BufferedReader(
    		new InputStreamReader(inputStream, Charset.forName(DEFAULT_ENCODING))
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
    
	public void serialize(String filePath, Object object) {
		
        try {
			mapper.writeValue(new File(filePath), object);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
	public Map<String, Object> deserialize(String filePath) {
				
				String jsonString;
				Map<String, Object> map = null;
				try {
					jsonString = mapper.readValue(filePath, String.class);
					map = getJsonMapFactory(jsonString);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return map;
	}
	
	public <TReturn, TMapper extends Function<JsonNode, TReturn>> TReturn deserialize(String filePath, TMapper objectMapper)
	throws JsonProcessingException, IOException {
		
    	JsonNode root = new ObjectMapper().readTree(new File(filePath));
		return objectMapper.apply(root);
	}
}
