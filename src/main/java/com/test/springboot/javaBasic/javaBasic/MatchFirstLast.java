package com.test.springboot.javaBasic.javaBasic;

public class MatchFirstLast {
	public static void main(String[] args) {
		System.out.println(frontAgain("edited"));
	}

	public static boolean frontAgain(String str) {
		if (str.length() > 1) {

			if (str.substring(0, 2).equals(str.substring((str.length() - 2), str.length()))) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
