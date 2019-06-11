package com.test.springboot.javaBasic.javaBasic;

import java.util.Scanner;

public class Challange4 {
	 public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String[] strArray = new String[3];
         int[] intArray = new int[3];
         for(int i=0;i<3;i++)
         {
             String s1=sc.next();
             int x=sc.nextInt();
             strArray[i]=s1;
             intArray[i]=x;
             //Complete this line
         }
         
         System.out.println("================================");

         for (int i=0;i<3;i++) {
        	 System.out.print(strArray[i]);
        	 int gap = 15 -strArray[i].length();
        	 System.out.format("%"+gap+"s%", "");
        	 if (intArray[i]<100)
        		 System.out.println(intArray[i]);
        	 else 
        		 System.out.println(intArray[i]);
         }
         System.out.println("================================");

 }

}
