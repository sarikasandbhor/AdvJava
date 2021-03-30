package com.practice;

class App{
	private int balance = 0;
	public void withdrawn(int amount) {
		synchronized (this) {
			if(balance<=0 || balance<amount)
			{
				try {
					System.out.println("Waiting for balance updation");
					wait();
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					System.out.println("Thread is interrupted");
				}
			}
			else {
				System.out.println("Balance is not zero");
			}
			balance = balance - amount;
			System.out.println("Amount withdrawn successfully and current balance is :"+balance);
		}
	}
	public void deposit(int amount) {
		synchronized (this) {
			balance = balance + amount;
		System.out.println("Amount deposited successfully");
		}
	}
	
}
public class Main {

	public static void main(String[] args) {
		App app = new App();
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				app.withdrawn(1000);
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				app.deposit(2000);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				thread1.interrupt();
			}
		});
		thread1.start();
		thread2.start();
	}

}
