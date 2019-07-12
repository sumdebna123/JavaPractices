package com.amazon.interview;

import java.util.Arrays;
import java.util.List;

public class TwoSum {
	
	public static void main(String[] args) {
		Integer[] input = {2,7,11,15};
		int[] result = twoSum(input,9);
		System.out.println(result[0]+","+result[1]);
	}

	
	public static int[] twoSum(Integer[] nums, int target) {
		int[] returnArray = new int[2];
        List<Integer> list = Arrays.asList(nums);
		for (int i = 0; i < nums.length; i++) {
			if (list.contains(target-nums[i])) {
        		returnArray[0]=nums[i];
        		System.out.println(returnArray[0]);
        		returnArray[1]=target-nums[i];
        		System.out.println(returnArray[1]);
        	}
		}
		return null;

	}

}
