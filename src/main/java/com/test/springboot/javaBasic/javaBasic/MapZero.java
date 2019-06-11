package com.test.springboot.javaBasic.javaBasic;

import java.util.HashMap;
import java.util.Map;

public class MapZero {
	public static void main(String[] args) {
		
	}
	
	public Map<String, Integer> word0(String[] strings) {
	    Map<String,Integer> returnMap = new HashMap<String,Integer>();
	    for (String s: strings){
	      returnMap.put(s,0);
	    }
	    return returnMap;
	}

	

}
