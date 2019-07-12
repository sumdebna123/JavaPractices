package com.leetcode.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
	public static void main(String[] args) {
		int[] myArray = {1,0,3};
		List<int[]> lst = new ArrayList<>();
		Arrays.sort(myArray);
		lst=Arrays.asList(myArray);
		int min = myArray[0];
		System.out.println(min);
		int max = myArray[myArray.length-1];
		
		for (int i=min;i<max;i++) {
			System.out.println("Value of I :"+i);
			System.out.println(lst.contains(i));
			if(!(lst.contains(i))) {
				System.out.println(i);
			}
		}
		
		
	}
	
	
}
