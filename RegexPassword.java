package com.userRegistration;
import java.util.regex.Pattern;

public class RegexPassword {
	
	public static void  main(String[] args) {
		String passwardRegex = "^[a-zA-Z]{8,}$";
		String passward = "srerdghjj";
		boolean result = Pattern.matches(passwardRegex, passward);
		
		System.out.println(result);
	}

}