package com.practice.deque;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedBlockingDeque<>();
		for(int i=1;i<=6;i++){
			deque.add(i);
		}
		deque.addFirst(0);
		deque.addLast(7);
		new Main().display(deque);
		System.out.println();
		System.out.println(deque.getFirst());
		
		/**All methods are same like Queues extra are addFirst(),addLast(),
		 * removeFirst(),removeLast(),offerFirst(),offerLast(),
		 * pollFirst(),pollLast(),peekFirst(),peekLast(),getFirst(),getLast()*/

	}
	void display(Deque<Integer> deque) {
		for(Integer element:deque) {
			System.out.println(element);
		}
	}
}
