package httpRequest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunt {
	
	   String message = "Hello World";	
	   TestingJunt messageUtil = new TestingJunt(message);

	   @Test
	   public void testPrintMessage() {	  
	      assertEquals(message,messageUtil.printMessage());
	   }
}
