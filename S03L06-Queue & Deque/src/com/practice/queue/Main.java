package com.practice.queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

	public static void main(String[] args) {
		/**add(),remove(),element() methods throws an exceptions*/
		/**ArrayBlocking Queue*/
		Queue<Integer> arrayQueue = new ArrayBlockingQueue<>(6);//size is constant
		for(int i=1;i<=6;i++){
			arrayQueue.add(i);
		}
		System.out.println("ArrayBlocking Queue");
		new Main().display(arrayQueue);
		System.out.println();
		
		System.out.println("After adding element than size");
		try {
			arrayQueue.add(7);
			new Main().display(arrayQueue);
		} catch (IllegalStateException e) {
			System.out.println("Queue is full");
		}
		
		arrayQueue.removeAll(arrayQueue);
		System.out.println();
		
		System.out.println("After removing element which not present");
		try {
			arrayQueue.remove();
			new Main().display(arrayQueue);
		} catch (NoSuchElementException e) {
			System.out.println("Element is not there");
		}
		System.out.println();
		
		System.out.println("Element method");
		try {
			arrayQueue.element();			//retrieves head of the queue & if queue is empty throws an exception
		} catch (Exception e) {
			System.out.println("Queue is empty");
		}			
		System.out.println();
		
		/**offer(),poll(),peek() -> returns some values if exception occurs*/
		for(int i=1;i<=6;i++){
			arrayQueue.add(i);
		
		System.out.println("offer() method if added element > size");
		arrayQueue.offer(7);
		arrayQueue.offer(8);
		new Main().display(arrayQueue);
		System.out.println();
		
		System.out.println("poll() method if queue is empty");
		arrayQueue.removeAll(arrayQueue);		
		arrayQueue.poll();						//removes head of queue
		new Main().display(arrayQueue);
		System.out.println();
		
		System.out.println("peek() method if queue is empty");
		arrayQueue.poll();							//retrieves head of queue
		new Main().display(arrayQueue);
		System.out.println();
		}

	}
	void display(Queue<Integer> queue)
	{
		for(Integer element:queue) {
			System.out.println(element);
		}
	}
}
