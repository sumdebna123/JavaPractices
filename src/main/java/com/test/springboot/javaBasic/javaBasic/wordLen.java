package com.test.springboot.javaBasic.javaBasic;

import java.util.HashMap;
import java.util.Map;

public class wordLen {
	public static void main(String[] args) {
		
	}
	public static Map<String, Integer> wordLen(String[] strings) {
		  Map<String,Integer> returnMap = new HashMap<String, Integer>();
		  for (int i=0;i<strings.length;i++) {
			  returnMap.put(strings[i],strings[i].length());
		  }
		  return returnMap;
		  
	}


}
