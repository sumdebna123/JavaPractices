package com.leedcode.prac.test;

public class MoveZero {
	
	public static int[] moveZeroes(int[] nums) {
        int j = -1;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 0 && j == -1) {
                j = i;
                continue;
            }
            if (j != -1 && nums[i] != 0) {
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
            i++;
        }
        return nums;
    }

}
