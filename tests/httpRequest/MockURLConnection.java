package httpRequest;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.net.URLConnection;

public class MockURLConnection extends URLConnection {
	String body;
	Map<String, List<String>> headers;
	
	protected MockURLConnection(String body, Map<String, List<String>> headers) throws MalformedURLException {
		super(new URL("http://example.com"));
		this.body = body;
		this.headers = headers;
	}

	public void connect() {
	}
	
	public InputStream getInputStream() {
		try {
			return new ByteArrayInputStream("<!DOCTYPE html>".getBytes("UTF-8"));
		} catch (Exception ex) {
			return new ByteArrayInputStream(null);
		}
		
	}
	
	public Map<String, List<String>> getHeaderFields() {
		return this.headers;
	}
}
