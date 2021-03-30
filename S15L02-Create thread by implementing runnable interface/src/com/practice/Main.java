package com.practice;

import java.util.Random;

class MyCounter implements Runnable{
	private int threadCount = 0;

	public MyCounter(int threadCount) {
		this.threadCount = threadCount;
	}
	
	@Override
	public void run() {
		Random random = new Random();
		for(int i=0;i<=9;i++)
		{
			try {
				Thread.sleep(random.nextInt());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value of i :"+i+" whose thread count is: "+threadCount);
			
		}	
	}
	
	
}
public class Main{
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<=9;i++)
				{
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
					
				}
			}
		});
		thread1.start();
	}

}
