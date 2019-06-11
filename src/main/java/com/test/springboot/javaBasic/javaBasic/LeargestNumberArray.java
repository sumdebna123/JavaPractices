package com.test.springboot.javaBasic.javaBasic;

public class LeargestNumberArray {
	public static int findLargestNum(int[] nums) {
		int leargestNumber=0;
		int a = 15-29;
		System.out.println("a :"+a);
		//{32, 35, 37, 39}
		for (int i=0;i<nums.length-1;i++) {
			if (leargestNumber>=nums[i] && leargestNumber>=nums[i+1]) {
				
			} else {
				if (nums[i]>=nums[i+1])
					leargestNumber=nums[i];
				else 
					leargestNumber=nums[i+1];
			}
		}
		return leargestNumber;
		
		
	}
	public static void main(String[] args) {
		int[] array= {32, 35, 37, 39};
		System.out.println(findLargestNum(array));
	}

}
