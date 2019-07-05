package com.test.springboot.javaBasic.javaBasic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckDuplicateAvailable {
	public static void main(String[] args) {
		Integer[] intArray = {1,2,2,3,4};
		
		
		Set<Integer> mySet1 =Arrays.stream(intArray).collect(Collectors.toSet());
		Set<Integer> mySet = new HashSet<>(Arrays.asList(intArray));
		if (intArray.length>mySet.size()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
