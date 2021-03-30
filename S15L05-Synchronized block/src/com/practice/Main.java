package com.practice;

class Brackets{
	 private Object lock = "lock";					//Lock the thread and make instance level data to safe
	 public void generateBrackets() {
		synchronized (lock) {						//Synchronized block
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i<=5)
			{
				System.out.print("[");
			}else {
				System.out.print("]");
			}
		}
		System.out.println();
		}
		 
		for(int i=0;i<=5;i++)
		{
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
/**
 * @author darkhorse
 * Time required to execute threads when put it in synchronized method : 6390
 * 
 * Time required to execute threads when put it in synchronized block : 4430
 */
public class Main {
	public static void main(String[] args) {
		Brackets bracket1 = new Brackets();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i=0;i<5;i++)
				{
					bracket1.generateBrackets();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required for thread 1 to over: "+(endTime-startTime));
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i=0;i<5;i++)
				{
					bracket1.generateBrackets();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required for thread 1 to over: "+(endTime-startTime));
			}
		}).start();


	}

}
