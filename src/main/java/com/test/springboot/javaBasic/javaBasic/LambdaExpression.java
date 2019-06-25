package com.test.springboot.javaBasic.javaBasic;

interface LambdaExprssion{
	//void show(int i);
	int sum(int i, int j);
//	int mul(int i, int j);
//	int div(int i, int j);
	
}

public class LambdaExpression {

	public static void main(String[] args) {
		LambdaExprssion lObj ;
//		lObj = (i) -> System.out.println("Hello"+i);
//		lObj.show(6);
		
		lObj = (i,j) -> {return (i+j);};
		System.out.println(lObj.sum(2, 3));
		
	}

}
