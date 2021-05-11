package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_registration {

	public static void main(String[] args) {
		
		boolean res;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Mobile number with country code: ");
		String number = s.nextLine();
		
		String nameRegex = "^[0-9]{2} [0-9]{10}$";
		
		Pattern p = Pattern.compile(nameRegex);
	    Matcher m = p.matcher(number);
	    res  = m.find();
	    
	    if (!res) {
	    	System.out.println("Invalid Input");
	    
	    }else {
	    	System.out.println("Correct input");
	    }
	}
}
