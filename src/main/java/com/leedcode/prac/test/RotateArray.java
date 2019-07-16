package com.leedcode.prac.test;

public class RotateArray {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5 };
		rotate(input, 3);

	}

	public static void rotate(int[] nums, int k) {
		if (nums.length <= 1) {
			return;
		}
		k = k % nums.length;
		int mid = nums.length - k;
		reverse(nums, mid, nums.length - 1);
		reverse(nums, 0, mid - 1);
		reverse(nums, 0, nums.length - 1);
	}

	private static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			nums[start] = nums[start] ^ nums[end];
			nums[end] = nums[start] ^ nums[end];
			nums[start] = nums[start] ^ nums[end];
			start++;
			end--;
		}
	}

}
