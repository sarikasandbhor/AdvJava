package com.practice;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread{
	public String name;

	public SomeThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Thread started :"+name);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread ended :"+name);
	}
	
}

public class Main {

	public static void main(String[] args) {
		ExecutorService exeService = Executors.newFixedThreadPool(3);  //Creating thread of 3 threads
		
		SomeThread thread1 = new SomeThread("Thread1");
		SomeThread thread2 = new SomeThread("Thread2");
		SomeThread thread3 = new SomeThread("Thread3");
		SomeThread thread4 = new SomeThread("Thread4");
		SomeThread thread5 = new SomeThread("Thread5");
		SomeThread thread6 = new SomeThread("Thread6");
		/*
		 * SomeThread thread7 = new SomeThread("Thread7"); SomeThread thread8 = new
		 * SomeThread("Thread8"); SomeThread thread9 = new SomeThread("Thread9");
		 * SomeThread thread10 = new SomeThread("Thread10");
		 */
		
		exeService.execute(thread1);
		exeService.execute(thread2);
		exeService.execute(thread3);
		exeService.execute(thread4);
		exeService.execute(thread5);
		exeService.execute(thread6);
		
		exeService.shutdown();				//When all threads from thread pool get executed then shutdown executionService

	}

}
