package com.practice;


class MyCounter extends Thread{
	private int threadCount = 0;

	public MyCounter(int threadCount) {
		this.threadCount = threadCount;
	}
	
	@Override
	public void run() {
		countThread();
	}
	public void countThread() {
		for(int i=0;i<=9;i++)
		{
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value of i :"+i+" whose thread count is: "+threadCount);
			
		}	
	}
}

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MyCounter counter1 = new  MyCounter(1);
		MyCounter counter2 = new  MyCounter(2);
		long startTime = System.currentTimeMillis();
		counter1.start(); //Run method called by JVM
		System.out.println("******************************");
		counter2.start(); //Run method called by JVM
		Thread.sleep(4550);
		long endTime = System.currentTimeMillis();
		System.out.println("Total time required for completion of thread: "+(endTime-startTime));

	}

}
