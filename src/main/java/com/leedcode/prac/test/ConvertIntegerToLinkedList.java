package com.leedcode.prac.test;

import java.util.LinkedList;

public class ConvertIntegerToLinkedList {
	
	public static void main(String[] args) {
		int input =23456;
		LinkedList<Integer> myList = new LinkedList<>();
		char[] charArray = Integer.toString(input).toCharArray();
		for (char c : charArray)
			myList.add(Integer.parseInt(Character.toString(c)));
		System.out.println(myList);
	}
}
