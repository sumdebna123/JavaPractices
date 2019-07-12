package com.test.springboot.javaBasic.javaBasic;

public class SingleTonDesignPattern {
	private static SingleTonDesignPattern singleTonDesignPatternEgear;

	private SingleTonDesignPattern() {
		System.out.println("This is a demo Singleton Call");
	}
	
	public static SingleTonDesignPattern getSingleTonDesignPattern() {
		if(singleTonDesignPatternEgear==null) {
			singleTonDesignPatternEgear= new SingleTonDesignPattern();
		} 
		return singleTonDesignPatternEgear;
	}
	

}
