package com.test.springboot.javaBasic.javaBasic;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int[] returnArray = new int[2];
		for (int i = 0; i < nums.length; i++) {
			System.out.println("value of i:"+i);
			for (int j = i+1; j < nums.length; j++) {
				System.out.println("value of j:"+j);
				System.out.println("nums[i] :" + nums[i]);
				System.out.println("nums[j] :" + nums[j]);
				if ((nums[i] + nums[j]) == target) {
					
					System.out.println("Inside if value of i:"+i);
					System.out.println("Inside if value of j:"+j);

					returnArray[0] = i;
					returnArray[1] = j;
					return returnArray;
				}
			}

		}
		return null;

	}

	public static void main(String[] args) {
		int[] inputArray = { 2,7,11,15};
		int[] result = twoSum(inputArray, 9);
		System.out.println("result :" + result[0] + " " + result[1]);
	}

}
