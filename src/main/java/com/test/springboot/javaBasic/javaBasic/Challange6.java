package com.test.springboot.javaBasic.javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
	public static void getResult(int a, int b, int n) {
		int pow = 0;
		int sum = 0;
		List<Integer> returnList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			pow = (int) (Math.pow(2, i));
			int tempnode = pow * b;
			sum = sum + tempnode;
			int instVal = sum + a;
			returnList.add((instVal));

		}
		for (int i = 0; i < returnList.size(); i++) {
			System.out.print(returnList.get(i) + "\t");
		}
	}

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[][] input = new int[t][3];

		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			input[i][0] = a;
			input[i][1] = b;
			input[i][2] = n;
		}

		for (int i = 0; i < input.length; i++) {
			getResult(input[i][0], input[i][1], input[i][2]);
			System.out.println();
		}
	}
}
