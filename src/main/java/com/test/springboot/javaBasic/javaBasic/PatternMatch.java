package com.test.springboot.javaBasic.javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
	public static void main(String[] args) {
		getPattern("<a><t>test</t></a><x>This is demo</x>");

	}

	public static void getPattern(String str) {
		Matcher match = Pattern.compile("<a>").matcher(str);

		List<String> matches = new ArrayList<String>();
		while (match.find()) {
			matches.add(match.group(0));
		}
		
		for (String s : matches)  {
			System.out.println(s);
		}
	}

}
