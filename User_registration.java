package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_registration {

	public static void main(String[] args) {
		
		boolean res;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter password with 8 character and 1 upper-case: ");
		String pass = s.nextLine();
		
		String nameRegex = "^(?=.*[A-Z])(?=.*[a-z]).{8}$";
		
		Pattern p = Pattern.compile(nameRegex);
	    Matcher m = p.matcher(pass);
	    res  = m.find();
	    
	    if (!res) {
	    	System.out.println("Invalid Input");
	    
	    }else {
	    	System.out.println("Correct input");
	    }
	}
}
