package com.practice;

public class Main {
	volatile public static int count = 0;							//volatile keyword used for no caching by thread
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					if(count==0)
					{
						System.out.println("Thread is running");	
					}else {
						break;
					}
				}
				
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Main.count=1;
				System.out.println("Count value is updated");
			}
		}).start();

	}

}
