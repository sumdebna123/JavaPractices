package com.test.springboot.javaBasic.javaBasic;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateWord {
	public static void main(String[] args) {
		System.out.println(removeDuplicate("in inthe"));
	}

	public static String removeDuplicate(String str) {
		String[] strArr = str.split(" ");
		List<String> strList = new ArrayList<String>();
		String toLower = str.toLowerCase();
		for (int i = 0; i < strArr.length; i++) {
			String tempLower= strArr[i].toLowerCase();
			if (toLower.contains(tempLower)) {
				toLower=toLower.replace(tempLower, "");
				strList.add(strArr[i]);
			}
		}
		String returnStr ="";
		for (String s : strList) 
			returnStr=returnStr+s+" ";
		
		return returnStr.trim();
	}

}
