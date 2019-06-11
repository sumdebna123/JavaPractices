package com.test.springboot.javaBasic.javaBasic;

public class HasBad {
	public static void main(String[] args) {
		String str = "xbd";
		if (str.length() <= 2) {
			System.out.println("No bad");
		}

		for (int i = 0; i < 2; i++) {
			Character charObject = str.charAt(i);
			Character charObj = new Character('b');
			
			if (charObject.equals(charObj)) {
				
				if (str.substring(i, (i + 3)).equals("bad")) {
					System.out.println("Has bad");

				}
			}
		}
		System.out.println("No bad");
	}

}
