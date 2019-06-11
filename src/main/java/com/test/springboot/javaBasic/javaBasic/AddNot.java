package com.test.springboot.javaBasic.javaBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AddNot {
	public static void main(String[] args) {
		String s="is not test";
		s.replaceAll("is", "is not");
		Map<String, String> test = new HashMap<String, String>();
		LinkedList<String> test1= new LinkedList<String>();
		test1.add("test");
		System.out.println(test1.hashCode());
		
		List<String> test2= new ArrayList<String>();
		test2.add("test");
		System.out.println(test2.hashCode());
		
	}

}
