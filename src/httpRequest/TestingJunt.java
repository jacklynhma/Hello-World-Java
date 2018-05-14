package httpRequest;

public class TestingJunt {
	private String message;

	   //Constructor
	   //@param message to be printed
	   public TestingJunt(String message) {
	      this.message = message;
	   }
	      
	   // prints the message
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }   
}
