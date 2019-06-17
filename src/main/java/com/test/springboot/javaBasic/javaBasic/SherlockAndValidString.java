package com.test.springboot.javaBasic.javaBasic;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndValidString {
	public static void main(String[] args) {
		System.out.println(isValid("aaaabbcc"));
		
	}
	
	
	
	
	public static String isValid(String s) {
		char[] charArray = s.toCharArray();
		Map<Character,Integer> charMap= new HashMap<Character,Integer>(); 
		for (char c : charArray) {
			if (charMap.containsKey(c))
				charMap.put(c, (charMap.get(c)+1));
			else if (!charMap.containsKey(c))
				charMap.put(c, 1);
		}
		
		
		int initialVal =0;
		int countOtherMapValues =0;
		int checkSingle =0;
		for (Map.Entry<Character,Integer> entry : charMap.entrySet()) {
			
			if (initialVal==0) {
				initialVal = entry.getValue();
			} else {
				
				if (initialVal != entry.getValue()) {
					
					if ((initialVal-1)!=entry.getValue() && initialVal!=(entry.getValue()-1)) {
						checkSingle++;
						if (checkSingle>1) {
							return "NO";
						}
					} else {
						countOtherMapValues++;
					}
				}
			}
		}
		if (countOtherMapValues>1) {
			return "NO";
		}
		return "YES";
		
	}

}
