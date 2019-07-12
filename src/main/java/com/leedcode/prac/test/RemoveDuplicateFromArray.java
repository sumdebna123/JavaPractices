package com.leedcode.prac.test;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromArray {
	static Integer[] inputArray = {0,0,1,1,1,2,2,3,3,4};
	public static void main(String[] args) {
		
		System.out.println(removeDuplicate(inputArray));
		
	}
	
	public static int removeDuplicate(Integer[] nums) {
		return new HashSet<>(Arrays.asList(nums)).size();
	}

}
