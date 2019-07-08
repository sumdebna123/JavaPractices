package com.test.springboot.javaBasic.javaBasic;

import java.util.HashMap;
import java.util.Map;

public class PutMethod {
	public static void main(String[] args) {
		Map<Integer, Integer> myMap = new HashMap<>();
		Integer x=myMap.put(1, 1);
		myMap.put(2, 2);
		Integer i =myMap.put(2, 3);
		System.out.println(i);
		System.out.println(x);
		
		
	}

}
