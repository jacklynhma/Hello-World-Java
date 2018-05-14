package httpRequest;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WebsiteTest {
	String url = "https://team-checkers.herokuapp.com/";
	String header = "";
	Website google = null;
	
	public WebsiteTest() throws IOException{
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		ArrayList<String> list = new ArrayList<String>(Arrays.asList( "text/html; charset=utf-8"));
		map.put("Content-Type", list);

		this.google = new Website(new MockURLConnection("<!DOCTYPE html>", map));
	}

	@Test
	public void getBodyTest() {		
		assertTrue("Body should containe DOCTYPE html",google.getBody().indexOf("<!DOCTYPE html>") != -1);
	}
	
	@Test
	public void getHeaderTest() {	
		assertTrue("Header should containe DOCTYPE html",google.getHeader().indexOf("text/html; charset=utf-8") != -1);
	}
}
