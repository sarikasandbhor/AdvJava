package com.practice.iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class IteratorExample {

	public static void main(String[] args) {
		List<String> names = new LinkedList<>();		//Recommended way to define List
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		names.add("E");
		names.add("F");
		System.out.println("LinkedList using Iterator");
		new IteratorExample().displayList(names);
		System.out.println();

	}
	void displayList(List<String> list) {
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
