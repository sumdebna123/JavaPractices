package com.test.springboot.javaBasic.javaBasic;

public class StringProgram {
	public static void main(String[] args) {
		System.out.println(getvalue("[[]]", "Yay"));
	}
	
	public static String getvalue(String out, String word) {
		int length=out.length();
		System.out.println("length :"+length);
		System.out.println("length 1:"+ (length/2+1));
		System.out.println("Sub1 :"+out.substring(0, length/2));
		System.out.println("Sub2 :"+out.substring((length/2),(length)));
		
		String test="agagagagagagalkjsljsdaj";
		System.out.println("This is length :"+test.length());
		float t=test.length()/2;
		System.out.println("Half length :"+t);

		System.out.println();
		return out.substring(0, length/2)+word+out.substring(length/2,length);
	}
	
	public static String cpyString(String str) {
		String returnStr=null;
	
		for (int i=0; i<3;i++) 
			returnStr=returnStr+str.substring(str.length()-2, str.length());
		
		return returnStr;
	}
		
		
}
