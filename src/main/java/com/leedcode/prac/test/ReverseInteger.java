package com.leedcode.prac.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseInteger {
	public static void main(String[] args) {
		
		Object[] result = reverseInteger(101);
		for (Object i : result) System.out.println(i);
		
	}
	
	public static Object[] reverseInteger(int input) {
		String str = Integer.toString(input);
		char[] chArray = str.toCharArray();
		List<Integer> returnArray = new ArrayList<>();;
		for (Character c : chArray) {
			if (!c.equals('0')) {
				returnArray.add(Integer.parseInt(Character.toString(c)));
			}
		}
		return returnArray.toArray();
		
	}

}
