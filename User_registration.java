package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_registration {

	public static void main(String[] args) {
		
		boolean res;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String firstname = s.nextLine();
			
		String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
			
		Pattern p = Pattern.compile(nameRegex);
		Matcher m = p.matcher(firstname);
		res  = m.find();
		  
		if (!res) {
		  	System.out.println("Invalid Input");
		   
		}else {
		   	System.out.println("Correct input");
		}
	}
}
