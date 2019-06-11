package com.test.springboot.javaBasic.javaBasic;
/*
 * 
 * https://www.hackerrank.com/challenges/valid-username-checker/problem
 * 
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
	
	public static void main(String[] args) {
		System.out.println(validateUserName("s1umit_6755"));
		
	}
	
	public static String validateUserName(String str) {
		 Pattern p = Pattern.compile("[^A-Za-z0-9_]");
		 
		 int asciiValueOfFChar = str.charAt(0);
	    

		if (str.length()<8) {
			return "INVALID; Username length < 8 characters";
		} else if (str.length()>30) {
			return "INVALID; Username length > 30 characters";
		} else if (asciiValueOfFChar>=49 && asciiValueOfFChar<=57) {
			System.out.println("str.charAt(0) First value ASCII :"+asciiValueOfFChar);
			return "INVALID; Username begins with non-alphabetic character";
		} else {
			char[] chArray = str.toCharArray();
			for (char ch : chArray) {
				Matcher m = p.matcher(Character.toString(ch));
				if (m.find())
					return "INVALID; '"+ch+"' character not allowed";
			}
			return "VALID";
		}
		
	}

}
