package com.practice;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

	static int counter = 0;
	static Lock lock = new ReentrantLock();
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try{
					lock.lock();
					for(int i=1;i<=1000;i++) {
						Main.counter++;
					}
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					lock.unlock();		//In finally block bcz to prevent locking infinitely in case of exception occurs
				}
			}
		});
		
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					lock.lock();
					for(int i=1;i<=1000;i++) {
						Main.counter++;
					}
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
			}
		});
		
		thread1.start();
		thread2.start();
		
		thread1.join();		//To wait until thread1 gets completed
		thread2.join();		//To wait until thread2 gets completed
		System.out.println("Counter value is:"+Main.counter);

	}

}
