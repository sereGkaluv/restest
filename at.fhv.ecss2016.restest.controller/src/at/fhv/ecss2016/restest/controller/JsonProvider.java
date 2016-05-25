package at.fhv.ecss2016.restest.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonProvider {
	
	public JsonProvider() {
	}
	
	public void serialize(String filePath, Object object) {
        try {
			
        	new ObjectMapper().writeValue(new File(filePath), object);
			
		} catch (IOException e) { e.printStackTrace(); }
	}
	
	public <TReturn, TMapper extends Function<JsonNode, TReturn>> TReturn deserialize(String filePath, TMapper objectMapper)
	throws JsonProcessingException, IOException {
		
    	JsonNode root = new ObjectMapper().readTree(new File(filePath));
		return objectMapper.apply(root);
	}
	
	public Iterator<Entry<String, JsonNode>> readUnknownJSON(String jsonString)
	throws JsonProcessingException, IOException {
        
        //Need to remove [] from the JSON string to work with Jackson
		String json = jsonString;
		
		if (json.startsWith("[") && json.endsWith("]")) {
			json = json.substring(1, json.length() - 1);
		}
        
    	JsonNode root = new ObjectMapper().readTree(json);
        return root.fields();
	}
}
