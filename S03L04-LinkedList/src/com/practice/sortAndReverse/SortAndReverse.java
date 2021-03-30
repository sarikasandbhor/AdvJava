package com.practice.sortAndReverse;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class SortAndReverse {

	public static void main(String[] args) {
		List<String> names = new LinkedList<>();		//Recommended way to define List
		names.add("G");
		names.add("T");
		names.add("R");
		names.add("A");
		names.add("D");
		names.add("C");
		System.out.println("Original List");
		new SortAndReverse().displayList(names);
		System.out.println();
		
		
		System.out.println("Sorting List");
		names.sort(null);
		new SortAndReverse().displayList(names);
		System.out.println();
		
		System.out.println("Reversing List");
		Collections.reverse(names);
		new SortAndReverse().displayList(names);
		System.out.println();

	}
	void displayList(List<String> list) {
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
