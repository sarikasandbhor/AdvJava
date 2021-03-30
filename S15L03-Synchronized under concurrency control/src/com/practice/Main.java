package com.practice;

public class Main {

	public static int threadCounter = 0;		//If multiple threads are working on common data then there may be inconsistency of data -> Solution is 'Synchronization'
	public static void main(String[] args) throws InterruptedException{
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=1000;i++)
				{
					Main.threadCounter++;
					
				}
				System.out.println("The loop of thread1 is over");
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=1000;i++)
				{
					Main.threadCounter++;
					
				}
				System.out.println("The loop of thread2 is over");
			}
		});
		thread1.start();
		thread2.start();
		Thread.sleep(1000);
		System.out.println("The value of thread counter is:"+threadCounter);
	}

}
