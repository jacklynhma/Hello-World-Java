package httpRequest;

import java.util.Map;
import java.util.List;
import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Map.Entry;

public class Website {
	URLConnection urlCon;
	String header;
	String body;
	String answer;
	
	public Website(URLConnection urlConnection) throws IOException {
		this.urlCon = urlConnection;
		this.urlCon.connect();
		this.header = parseHeader();
		this.body = parseBody();
	}
	
	public String getHeader() {
		return this.header;
	}
	
	public String getBody() {
		return this.body;
	}
	
	private String parseBody() throws IOException {
		InputStream inputStream = this.urlCon.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		String line = reader.readLine();
		inputStream.close();
		return line;	
	}
	
	private String parseHeader() {	
		for(Map.Entry<String, List<String>> entry : this.urlCon.getHeaderFields().entrySet()) {
			answer += String.format("%s: %s", entry.getKey(), entry.getValue());
		}
		return answer;
	}
}
