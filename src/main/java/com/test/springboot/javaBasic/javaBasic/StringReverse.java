package com.test.springboot.javaBasic.javaBasic;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {
	public static void main(String[] args) {
		String[] inputStr = {"Sumit","aba","pqr","test","pqp"};
		List<String> outputString = new ArrayList<String>();
		int i=0;
		for (String str:inputStr) {
			
			if (check(str)==true) {
				System.out.println("status :"+str);
				outputString.add(str);
				i++;
			}
		}
		System.out.println(outputString);

	}

	public static boolean check(String str) {
		char[] revStr = new char[str.length()];
		int ctr = 0;
		for (int i = (str.length() - 1); i >= 0; i--) {
			revStr[ctr] = str.charAt(i);
			ctr++;
		}
		System.out.println(revStr);
		if (str.equalsIgnoreCase(new String(revStr)))
			return true;
		else
			return false;
	}

}
