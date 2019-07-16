package com.leedcode.prac.test;

public class PlusOne {
	public static void main(String[] args) {

	}

	public static int[] plusOne(int[] digits) {
		digits[digits.length - 1] = digits[digits.length - 1] + 1;
		int[] newArray = null;
		if (digits[digits.length - 1] > 10) {
			digits[digits.length - 1] = 10 / 10;
			newArray = new int[digits.length + 1];
			newArray = digits;
			newArray[newArray.length - 1] = 10 % 10;
		}
		return newArray;
	}

}
