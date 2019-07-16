package com.leedcode.prac.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstUniqueCharInStr {
	public static void main(String[] args) {
		System.out.println(firstUnitChar("loveleetcode"));
		
	}
	
	public static int firstUnitChar(String str) {
		char[] chArray = str.toCharArray();
		Map<Character,Integer> hashMap = new HashMap<>();
		for (int i =0; i<chArray.length;i++) {
			if (!hashMap.containsKey(chArray[i])) {
				hashMap.put(chArray[i], 1);
			} else {
				hashMap.put(chArray[i], 2);
			}
		}
		for (int i=0;i<chArray.length;i++) {
			if (hashMap.get(chArray[i])==1) {
				return i;
			}
		}
		return -1;
		
	}

}
