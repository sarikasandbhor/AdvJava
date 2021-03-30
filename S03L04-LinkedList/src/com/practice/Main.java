package com.practice;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		names.add("E");
		names.add("F");
		System.out.println("LinkedList");
		new Main().displayNames(names);
		System.out.println();
		
		System.out.println("After removing C");
		names.remove(2);
		new Main().displayNames(names);
		System.out.println();
		
		System.out.println("After adding at between D & E");
		names.add(3, "X");
		new Main().displayNames(names);
		System.out.println();
		
		System.out.println("Address of X");
		System.out.println(names.indexOf("X"));

	}
	void displayNames(LinkedList<String> names) {
		for(String name:names) {
			System.out.println(name);
		}
	}
}
