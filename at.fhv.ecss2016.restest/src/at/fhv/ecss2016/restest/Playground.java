package at.fhv.ecss2016.restest;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Playground {

	public Playground() {
	}
	
	public static void main(String[] args) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet("http://localhost/api/user/");
		
		try (CloseableHttpResponse response = httpclient.execute(httpget)){
			// test commit 
			response.getAllHeaders();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
