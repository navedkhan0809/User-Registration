package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_registration {

	public static void main(String[] args) {
		
		boolean res;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter last name: ");	
		String lastname = s.nextLine();
		
		String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
		
		Pattern p = Pattern.compile(nameRegex);
	    Matcher m = p.matcher(lastname);
	    res  = m.find();
	    
	    if (!res) {
	    	System.out.println("Invalid Input");
	    
	    }else{
	    	System.out.println("Correct input");
	    }
	}
}
