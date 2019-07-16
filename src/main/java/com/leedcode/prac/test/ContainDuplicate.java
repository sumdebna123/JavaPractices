package com.leedcode.prac.test;

import java.util.Arrays;
import java.util.HashSet;

public class ContainDuplicate {
	public static void main(String[] args) {
		int[] input = {1,2,3,4,5};
		HashSet<int[]> hashSet = new HashSet<>(Arrays.asList(input));
		if (input.length!=hashSet.size()) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}

}
