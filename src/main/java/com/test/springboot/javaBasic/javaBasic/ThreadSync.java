package com.test.springboot.javaBasic.javaBasic;

class PrintDemo {
	public void printCount() {
		try {
			for (int i=0;i<5;i++)
				System.out.println("Counter -----");
			
		}catch(Exception e) {
			System.out.println("The thread interrupted.");
		}
	}
}

class ThreadDemo extends Thread{
	private Thread t;
	private String threadName;
	PrintDemo pd;
	
	public ThreadDemo(String name,PrintDemo pd) {
		// TODO Auto-generated constructor stub
		this.threadName=name;
		this.pd=pd;
	}
	public void run() {
		pd.printCount();
		System.out.println("Thread :"+threadName);
	}
	public void start() {
		System.out.println("Starting :"+threadName);
		if (t==null) {
			t=new Thread(this.t, threadName);
			t.start();
		}
	}
}

public class ThreadSync{
	public static void main(String[] args) {
		PrintDemo pd = new PrintDemo();
		ThreadDemo T1 = new ThreadDemo("Thread -1", pd);
		ThreadDemo T2= new ThreadDemo("Thread - 2", pd);
		T1.start();
		T2.start();
		
		try {
			T1.join();
			T2.join();
		}catch(Exception e) {
			System.out.println("Interrupted.."+e);
		}
	}
} 
