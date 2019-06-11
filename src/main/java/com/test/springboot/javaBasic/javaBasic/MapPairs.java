package com.test.springboot.javaBasic.javaBasic;

import java.util.HashMap;
import java.util.Map;

public class MapPairs {
	public static void main(String[] args) {
		
	}
	public static Map<String, String> pairs(String[] strings) {
		  Map<String,String> returnMap = new HashMap<String, String>();

		  for (int i=0;i<strings.length;i++) {
			  returnMap.put(strings[i].substring(0,1), strings[i].substring((strings[i].length()-1),strings[i].length()));
		  }
		  return returnMap;
	}

}
