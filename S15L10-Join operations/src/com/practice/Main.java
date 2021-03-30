package com.practice;
class App{
	public int counter = 0;
}

public class Main {

	public static void main(String[] args) {
		App app = new App();
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=1000;i++)
				{
					app.counter++;
				}
			}
		});
		
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					//Thread.sleep(5000);						//This statement will wait for 5 secs and not recommended bcz unnecessary waste time of some secs
					thread1.join();								//This will wait for thread1 to complete its excecution and then start thread2
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(int i=1;i<=1000;i++)
				{
					app.counter++;
				}
				
			}
		});
		thread1.start();
		
		thread2.start();
		try {
			thread2.join();									//main thread will wait until thread2 execution gets complete
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Counter value :"+app.counter);
	}

}
