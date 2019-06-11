package com.test.springboot.javaBasic.javaBasic;

import java.util.HashMap;
import java.util.Map;

public class FirstCharKey {
	public static void main(String[] args) {
		String[] input= {"apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"};
		System.out.println(firstChar(input));
	}
	
	public static Map<String, String> firstChar(String[] strings) {
		  Map<String,String> returnMap = new HashMap<String, String>();
		  if (strings.length==0) {
			  return returnMap;
		  }
		  for (String s : strings) {
			  String firstChar=s.substring(0,1);
			  System.out.println("The first Char :"+firstChar);
			  String keyValue = "";
			  for (String k: strings) {
				  System.out.println("K substring:"+k.substring(0,1));
				  if (firstChar.equals(k.substring(0,1))) {
					  keyValue=keyValue+k;
				  }
			  }
			  returnMap.put(firstChar, keyValue);

		  }
		  return returnMap;

		  
	}


}
