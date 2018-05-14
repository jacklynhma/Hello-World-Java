package httpRequest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class CommandTest {
	Website website = null;
	
	public CommandTest() throws IOException{
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		ArrayList<String> list = new ArrayList<String>(Arrays.asList( "text/html; charset=utf-8"));
		map.put("Content-Type", list);

		this.website = new Website(new MockURLConnection("<!DOCTYPE html>", map));
	}
	
	@Test 
	public void printResultTest() {
		assertEquals("nullContent-Type: [text/html; charset=utf-8]", new Command(1, this.website).printResult());
		assertEquals("<!DOCTYPE html>", new Command(2, this.website).printResult());
		assertEquals("Exiting..", new Command(3, this.website).printResult());
		assertEquals("That is not the correct command", new Command(4, this.website).printResult());
	}

}
