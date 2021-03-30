package com.practice.listInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		//LinkedList<String> names = new LinkedList<>();
		List<String> names = new LinkedList<>();		//Recommended way to define List
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		names.add("E");
		names.add("F");
		System.out.println("LinkedList");
		new ListInterface().displayList(names);
		System.out.println();
		
		
		//ArrayList<String> numbers = new ArrayList<>();
		List<String> numbers = new ArrayList<>();		//Recommended way to define List
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		numbers.add("4");
		numbers.add("5");
		numbers.add("6");
		System.out.println("ArrayList");
		new ListInterface().displayList(numbers);
		System.out.println();
		
	}
	void displayList(List<String> list) {
		for(String item:list) {
			System.out.println(item);
		}
	}

}
