package com.leedcode.prac.test;

import java.util.HashMap;
import java.util.Map;

public class FirstDuplicateCharInCode {
	public static void main(String[] args) {
		String str ="abcdefgg";
		char[] arr = str.toCharArray();
		Map<Character,Integer> myMap = new HashMap<>();
		for (int i=0;i<arr.length;i++) {
			if (myMap.put(arr[i],i)!=null) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
