package com.test.springboot.javaBasic.javaBasic;

public class ReverseInteger {
	public static void main(String[] args) {
		int num = 515011, reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            System.out.println("The new reversed value :"+reversed);

            num =num/ 10;
            System.out.println("The new num value :"+num);
        }

        System.out.println("Reversed Number: " + reversed);
	}

}
