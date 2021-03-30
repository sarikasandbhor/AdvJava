package com.practice.handleDeadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				boolean flagLock1 = false;
				boolean flagLock2 = false;
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;
				while(true) {
					try {
						if(!flagLock1) {
							flagLock1 = lock1.tryLock();
						}
						if(!flagLock2) {
							flagLock2 = lock2.tryLock();
						}
					} finally {
						if(flagLock1 && !doneFlag1) {
							System.out.println("Inside Thread 1 Lock 1");
							doneFlag1 = true;
							lock1.unlock();
						}
						if(flagLock2 && !doneFlag2) {
							System.out.println("Inside Thread 1 Lock 2");
							doneFlag2 = true;
							lock2.unlock();
						}
						if(flagLock1 && flagLock2) {
							break;
						}
					}
				}
				
			}
		});
		
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				boolean flagLock1 = false;
				boolean flagLock2 = false;
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;
				while(true) {
					try {
						if(!flagLock1) {
							flagLock1 = lock1.tryLock();
						}
						if(!flagLock2) {
							flagLock2 = lock2.tryLock();
						}
					} finally {
						if(flagLock1 && !doneFlag1) {
							System.out.println("Inside Thread 2 Lock 1");
							doneFlag1 = true;
							lock1.unlock();
						}
						if(flagLock2 && !doneFlag2) {
							System.out.println("Inside Thread 2 Lock 2");
							doneFlag2 = true;
							lock2.unlock();
						}
						if(flagLock1 && flagLock2) {
							break;
						}
					}
				}
				
			}
		});
		
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
		System.out.println("Inside Main method");
	}

}
