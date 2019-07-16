package com.leedcode.prac.test;

import java.util.Arrays;
import java.util.List;

public class TwoSum {
	
	public static void main(String[] args) {
		
	}
	
	public static int[] twoSum(Integer[] nums, int target) {
		int[] returnArray = new int[2];
        Integer[] intNums = ((Object) Arrays.stream(nums)).boxed().toArray( Integer[]::new );
        List<Integer> list = Arrays.asList(intNums);
		for (int i = 0; i < nums.length; i++) {
			if (list.contains(target-nums[i])) {
        		returnArray[0]=nums[i];
        		returnArray[1]=target-nums[i];
        	}
		}
		return null;
	}

}
