package httpRequest;

import java.util.Map;
import java.util.Scanner;
import java.net.URL;
import java.net.URLConnection;

public class CreateUrl {

	public static void main(String[] args) {
		
		Website currentWebsite = null;
		Scanner scanner = new Scanner(System.in);
		while (currentWebsite == null) {
			System.out.print("Enter site: http://");
			
			try {
				currentWebsite = new Website(new URL("https://" + scanner.next()).openConnection());
				
			}	catch (Exception ex) {
				ex.printStackTrace();
				System.out.println("Sorry that is in an invalid url, please try again");
			}
		}
		
		System.out.println("Enter 1 to receive header, Enter 2 to receive body, Enter 3 to quit");
		int input = Integer.parseInt(scanner.next());
		
		while (input != 3) {
			new Command(input, currentWebsite);
			System.out.println(" \nEnter 1 to receive header, Enter 2 to receive body, Enter 3 to quit");
			input = Integer.parseInt(scanner.next());
		}
		
		scanner.close();
			
	}

}
