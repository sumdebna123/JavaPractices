package com.test.springboot.javaBasic.javaBasic;

import java.util.ArrayList;
import java.util.List;

public class Assignment {
	public static void main(String[] args) {
		List<Integer> firstList = new ArrayList<Integer>();
		firstList.add(2);
		firstList.add(3);
		firstList.add(4);
		firstList.add(5);
		firstList.add(6);
		firstList.add(7);
		
		List<Integer> secondList = new ArrayList<Integer>();
		secondList.add(2);
		secondList.add(3);
		secondList.add(4);

		secondList.add(9);
		secondList.add(10);
		List<Integer> finalList = new ArrayList<Integer>();
		
		for (int i=0; i<firstList.size();i++) {
			for (int j=0; j<secondList.size();j++) {
				if (secondList.get(j)==finalList.get(i)) {
					finalList.add(secondList.get(j));
				}
			}
		}
		System.out.println("finalList :"+finalList);
		
		


		
	}

}
