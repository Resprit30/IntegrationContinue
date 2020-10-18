package tn.esprit;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.json.JSONObject;

public class CallRestWebService {
	private static final Logger l = Logger.getLogger(CallRestWebService.class); 
	public static final String endpoint = "https://httpbin.org/get";
	public static void main(String[] args) {
		l.info("main() : ");
	HttpClient client = new DefaultHttpClient();
	HttpGet request = new HttpGet(endpoint);
	String ip = "not found"; 
	try {
		
		l.info("In main() : ");
		l.debug(" response");
		
		HttpResponse response = client.execute(request);
		
		l.debug(" jsonResponse");
		
		String jsonResponse = EntityUtils.toString(response.getEntity());
		
		l.debug("Response as String : " + jsonResponse);
		
		JSONObject responseObj = new JSONObject(jsonResponse);

		ip = responseObj.getString("origin");
		
		l.debug("ip : " + ip);
		l.info("Out main() without errors.");

		} catch (IOException e) { 
			 l.error("Error In main() : " + e);
			e.printStackTrace(); }
		}

}
