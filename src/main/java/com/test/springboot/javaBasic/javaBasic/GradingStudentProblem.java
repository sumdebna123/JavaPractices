package com.test.springboot.javaBasic.javaBasic;

import java.util.ArrayList;
import java.util.List;

/*
 * https://www.hackerrank.com/challenges/grading/problem
 */

public class GradingStudentProblem {
	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		
		input.add(4);
		input.add(73);
		input.add(67);
		input.add(38);
		input.add(33);
		
		List<Integer> result =  gradingStudents(input);
		for (Integer i : result) {
			System.out.println(i);
		}
		

		

	}
	
			

	public static List<Integer> gradingStudents(List<Integer> grades) {
		// Write your code here
		List<Integer> resultArray = new ArrayList<Integer>();

		for (Integer i : grades) {
			if (i <= 37) {
				resultArray.add(i);
			} else {
				if (i%5==2) {
					resultArray.add(i);
				} else if (i%5==1) {
					resultArray.add(i-i%5);
				} else if (i%5==3 || i%5==4) {
					int addition = 5-(i%5);
					resultArray.add(i+addition);
				} else {
					resultArray.add(i);
				}

			}
		}
		return resultArray;

	}

}
