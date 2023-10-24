package emailVerification;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	
	public boolean isValid(String email) {
		String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$";
		
		Pattern pat = Pattern.compile(regex);
		if(email == null) {
			return false;
		}
		return pat.matcher(email).matches();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
		System.out.println("Please enter your email id");
		String email = sc.next();
		
		Main main = new Main();
		
		if(main.isValid(email)) {
			System.out.println("It is a valid email id");
			break;
		}
		else System.out.println("It is not a valid email id");
		}
		
	}
}
