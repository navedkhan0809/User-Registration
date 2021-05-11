package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_registration {

	public static void main(String[] args) {
		
		boolean res;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter email: ");
		String email = s.nextLine();
		
		String nameRegex = "^[abc]{3}(?=.*[+.-]).{0,1}[0-9]{0,}@[a-z0-9]{1,}.[a-z]{0,}.[a-z]{0,}$";
	  
		Pattern p = Pattern.compile(nameRegex);
	    Matcher m = p.matcher(email);
	    res  = m.find();
	    
	    if (!res) {
	    	System.out.println("Invalid Input");
	    	
	    }else{
	    	System.out.println("Correct input");
	    }
	}
}
