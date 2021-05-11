package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_registration {

	public static void main(String[] args) {
		
		boolean res;
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter Email id: ");
		String email = s.nextLine();
		
		String nameRegex = "^[A-Za-z]{1,}.[A-Za-z]{0,}@[a-z]{1,}.[a-z]{1,}.[a-z]{0,}$";
		
		Pattern p = Pattern.compile(nameRegex);
	    Matcher m = p.matcher(email);
	    res  = m.find();
	    
	    if (!res) {
	    	System.out.println("Invalid Input");
	    
	    }else {
	    	System.out.println("Correct input");
	    }
		
	}
}
