package at.fhv.ecss2016.restest.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonProvider {
	
	public JsonProvider() {
	}
	
	public void serialize(String filePath, Object object)
	throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		
		mapper.writeValue(new File(filePath), object);
	}
	
	public <TReturn, TMapper extends Function<JsonNode, TReturn>> TReturn deserialize(String filePath, TMapper objectMapper)
	throws JsonProcessingException, IOException {
		
    	JsonNode root = new ObjectMapper().readTree(new File(filePath));
		return objectMapper.apply(root);
	}
	
	public Iterator<Entry<String, JsonNode>> readUnknownJSON(String jsonString)
	throws JsonProcessingException, IOException {
        
        
		String json = jsonString;
		
		if (!json.startsWith("{") && !json.endsWith("}")) {
			//Need to add {"JSON": *} to the JSON string to be compatible with Jackson
			json = "{\"JSON\":" + json + "}";	
		}
		
    	JsonNode root = new ObjectMapper().readTree(json);
        return root.fields();
	}
}
