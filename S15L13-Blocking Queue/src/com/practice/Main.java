package com.practice;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{
	private ArrayBlockingQueue<Integer> queue;

	public Producer(ArrayBlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				queue.put(Main.counter++);
				System.out.println("Counter value after adding :"+Main.counter);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
class Consumer implements Runnable{
	private ArrayBlockingQueue<Integer> queue;

	public Consumer(ArrayBlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(5000);
				queue.take();
				System.out.println("Counter value after removing :"+Main.counter);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
public class Main {
	static int counter=0;
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		Producer producer = new Producer(queue);
		Thread producerThread = new Thread(producer);
		producerThread.start();
		
		Consumer consumer = new Consumer(queue);
		Thread consumerThread = new Thread(consumer);
		consumerThread.start();

	}

}
