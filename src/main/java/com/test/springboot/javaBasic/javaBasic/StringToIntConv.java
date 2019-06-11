package com.test.springboot.javaBasic.javaBasic;

public class StringToIntConv {
	public static void main(String[] args) {
		StringToIntConv obj = new StringToIntConv();
		System.out.println("Result :"+obj.myAtoi("4193 with words"));

	}

	public int myAtoi(String str) {
		String s="";
			try {
				return Integer.parseInt(str);
			}catch (Exception e) {
				//get the first value : 
				char fCh =str.charAt(0);
				int value =fCh;
				if (value<47 && value>57) {
					return 0;
				} else {
					char[] charArray = str.toCharArray();
					for (char c: charArray) {
						int i = c;
						System.out.println(i);
						if (value>47 && value<57) {
							s=s+c;
							
							System.out.println(s);
						} else {
							return Integer.parseInt(s);
						}
					}
				}
			}
			return Integer.parseInt(s);
	}

}
