package httpRequest;

import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.io.IOException;


public class Command {
	int input;
	Website website;
	
	public Command(int input, Website website) {
		this.input = input;
		this.website = website;
		System.out.println(choices());
	}
	
	private String choices() {
		switch (input) {
		case 1: 
			return website.getHeader();
		case 2: 
			return website.getBody();
		case 3: 
			return "quit";
		default: 
			return "That is not the correct command";
		}
	}

}
