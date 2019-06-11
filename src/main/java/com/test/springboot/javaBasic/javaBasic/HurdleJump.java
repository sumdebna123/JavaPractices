package com.test.springboot.javaBasic.javaBasic;

public class HurdleJump {
	public static boolean hurdleJump(int[] hurdles, int h) {
		int count =0;
		for (int i: hurdles) {
		
			if (h>=i) {
				count++;
			}
		}
		if (count==hurdles.length) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		//[1, 2, 3, 4, 5], 5
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(hurdleJump(arr, 5));
		
	}

}
