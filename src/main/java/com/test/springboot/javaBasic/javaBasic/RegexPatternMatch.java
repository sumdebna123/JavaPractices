package com.test.springboot.javaBasic.javaBasic;

public class RegexPatternMatch {
	public static void main(String[] args) {
		System.out.println(checkIP("I.Am.not.an.ip"));

	}

	public static boolean checkIP(String str) {
		String[] strArray = str.split("\\.");
		if (strArray.length !=4) return false;
		for (String s : strArray) {
			try {
				int i = Integer.parseInt(s);
				if (i <= 0 || i >= 255)
					return false;
			} catch (Exception e) {
				return false;
			}
			
		}
		return true;
	}

}
