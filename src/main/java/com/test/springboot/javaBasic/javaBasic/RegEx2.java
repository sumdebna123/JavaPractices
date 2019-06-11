package com.test.springboot.javaBasic.javaBasic;

public class RegEx2 {
	public static void main(String[] args) {
		String input="He is a very very good boy, isn't he?";
		String input2="                a                    ";
		String[] terms = input2.split("[\\s@&.,'?$+-]+");
		System.out.println(terms.length);
		for (String s : terms) {
			System.out.println(s);
		}
	}

}
