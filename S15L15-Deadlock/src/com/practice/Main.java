package com.practice;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * Here Lock 1 is acquired by Thread 1 and Lock 2 is aquired by Thread 2
		 * So Thread 1 is waiting for Lock 2 to be release and Thread 2 is waiting for 
		 * Lock 1 to be release, So intersection will occur and Deadlock happens
		 * */
		String lock1 = "lock1";
		String lock2 = "lock2";
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (lock1) {
					System.out.println("Inside Thread 1 Lock 1");
					synchronized (lock2) {
						System.out.println("Inside Thread 1 Lock 2");
					}
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (lock2) {
					System.out.println("Inside Thread 2 Lock 1");
					synchronized (lock1) {
						System.out.println("Inside Thread 2 Lock 2");
					}
				}
			}
		});
		
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();

		System.out.println("Inside main method");
	}

}
