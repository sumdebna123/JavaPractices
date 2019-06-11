package com.test.springboot.javaBasic.javaBasic;

import java.util.ArrayList;
import java.util.List;

public class First {
	public static void main(String[] args) {
		String[] myArr= {"abc","test1","test3"};
		for (String s: myArr) {
			if (s.startsWith("test")) {
				System.out.println("The value start with test:"+s);
			}
		}
		String a="abbbbbbbjajaajjajajajxjjjjjjjjj";
		System.out.println(a.indexOf("x"));
		List<String> firstList = new ArrayList<String>();
		firstList.add("test1");
		firstList.add("test2");
		firstList.add("test3");
		firstList.add("test4");
		firstList.add("test5");
		firstList.add("test6");
		System.out.println("The first List :"+firstList);
		
		List<String> secondList = new ArrayList<String>();
		secondList.add("test1");
		secondList.add("test7");
		secondList.add("test8");
		secondList.add("test9");
		
		System.out.println("The second List :"+secondList);

		for (int i=0; i<firstList.size();i++) {
			for (int j=0;j<secondList.size();j++) {
				if (firstList.get(i).equals(secondList.get(j))){
					firstList.remove(i);
				}
			}
		}
		
		System.out.println("The list is :"+firstList);
		
	}

}
