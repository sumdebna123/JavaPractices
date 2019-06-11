package com.test.springboot.javaBasic.javaBasic;

import java.util.ArrayList;
import java.util.List;

public class Amazon1 {

	public static void main(String[] args) {
		int[] state = { 1, 0, 0, 0, 0, 1, 0, 0 };

		System.out.println("The cell ::" + cellCompete(state, 1));
	}

	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public static List<Integer> cellCompete(int[] states, int days) {
		// WRITE YOUR CODE HERE
		List<Integer> returnList = new ArrayList<Integer>();
		for (int k = 0; k < days; k++) {
			if (k==(days-1)){
				for (int i = 0; i < states.length; i++) {
					if (i == 0 && states[i + 1] == 0) {
						returnList.add(0);
					} else if (i == (states.length - 1) && states[states.length - 2] == 0) {
						returnList.add(0);
					} else if ((states[i - 1] == 0 && states[i + 1] == 0)
							|| (states[i - 1] == 1 && states[i + 1] == 1)) {
						returnList.add(0);
					} else {
						returnList.add(1);
					}
				}
			} else {
				for (int i = 0; i < states.length; i++) {
					if (i == 0 && states[i + 1] == 0) {
						states[i]=0;
					} else if (i == (states.length - 1) && states[states.length - 2] == 0) {
						states[i]=0;
					} else if ((states[i - 1] == 0 && states[i + 1] == 0)
							|| (states[i - 1] == 1 && states[i + 1] == 1)) {
						states[i]=0;
					} else {
						states[i]=1;
					}
				}
			}
		}

		return returnList;
	}
	// METHOD SIGNATURE ENDS
}
