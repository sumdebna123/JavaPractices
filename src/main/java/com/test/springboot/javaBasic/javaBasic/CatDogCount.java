package com.test.springboot.javaBasic.javaBasic;

public class CatDogCount {
	public static void main(String[] args) {
		System.out.println(checkCatDog("ca"));

	}

	public static boolean checkCatDog(String str) {
		int countCat = 0;
		int countDog = 0;
		if (str.length() > 2) {
			for (int i = 0; i < str.length() - 2; i++) {
				System.out.println("the val CAT:" + str.substring(i, i + 3));
				if (str.substring(i, i + 3).equals("cat")) {
					countCat++;
				}
			}

			for (int i = 0; i < str.length() - 2; i++) {
				System.out.println("the val DOG:" + str.substring(i, i + 3));
				if (str.substring(i, i + 3).equals("dog")) {
					countDog++;
				}
			}
			System.out.println("CAT count :" + countCat);
			System.out.println("DOG count :" + countDog);
			if (countCat != 0 && countCat == countDog) {
				return true;
			} else {
				return false;
			}
		}
		else return false;
	}

}
