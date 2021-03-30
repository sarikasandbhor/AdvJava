package com.practice;

import java.util.concurrent.CountDownLatch;

class CountDown extends Thread{
	private CountDownLatch latch;

	public CountDown(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Thread is started."+Thread.currentThread().getName());
		System.out.println("Thread completed");
		System.out.println();
		latch.countDown();
	}
	
}
public class Main {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(4);			//4 are number of folds in lock
		CountDown thread1 = new CountDown(latch);
		CountDown thread2 = new CountDown(latch);
		CountDown thread3 = new CountDown(latch);
		CountDown thread4 = new CountDown(latch);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		try {
			latch.await();					//It will wait main thread until other thread's execution gets complete
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main method completed");

	}

}
