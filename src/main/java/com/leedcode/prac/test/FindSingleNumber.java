package com.leedcode.prac.test;

import java.util.Arrays;

public class FindSingleNumber {
	public static void main(String[] args) {
		{4,1,2,1,2}
		1,1,2,2,4

	}

	public static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i=0;i<nums.length-1;i+=2) {
			if (nums[i]!=nums[i+1]) {
				return nums[i];
			}
		}
		return -1;
		
	}

}
