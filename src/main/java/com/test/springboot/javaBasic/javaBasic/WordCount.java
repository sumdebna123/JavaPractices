package com.test.springboot.javaBasic.javaBasic;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		
	}

	public static Map<String, Integer> wordCount(String[] strings) {
		  Map<String,Integer> returnMap = new HashMap<String, Integer>();
		  for (String s:strings) {
			  int counter =0;
			  for (int i=0;i<strings.length;i++) {
				  if(s==strings[i]) {
					  counter++;
				  }
			  }
			  returnMap.put(s, counter);
		  }
		  return returnMap;

	}

	
	

}
