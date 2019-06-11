package com.test.springboot.javaBasic.javaBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReverserWIthSpclChar {
	public static void main(String[] args) {
		String str = "S&u*mit";
		System.out.println("Input String :"+str);
		
		char[] myArr= new char[str.length()];
		char[]reverseArr= new char[str.length()];
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Map<Integer,Character> spclCharMap= new HashMap<Integer,Character>();
		
		for (int i=0;i<str.length();i++) {
			Matcher m = p.matcher(Character.toString(str.charAt(i)));
			if (m.find()) {
				spclCharMap.put(i, str.charAt(i));
			}
			myArr[i]=str.charAt(i);
		}
		int ctr=0;
		char[] onlyChar= new char[str.length()-spclCharMap.size()];
		for (int i=0;i<str.length();i++) {
			Matcher m1 = p.matcher(Character.toString(str.charAt(i)));
			if (!m1.find()) {
				onlyChar[ctr]=str.charAt(i);
				ctr++;
			}
		}
		
		int counter =0;
		for (int j=onlyChar.length-1;j>=0;j--) {
			
			if (spclCharMap.containsKey(counter)) {
				reverseArr[counter]=spclCharMap.get(counter);
				counter++;
			} 
				reverseArr[counter]=onlyChar[j];
				counter++;
		}
		
		
		System.out.print("Output String :");
		for (char c:reverseArr)
			System.out.print(c);
			
	}

}
