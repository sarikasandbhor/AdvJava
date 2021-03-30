package com.practice;

import java.util.ArrayList;

public class Main {
	static ArrayList<String> listNames = new ArrayList<>();
	
	public static void main(String[] args) {
		listNames.add("A");
		listNames.add("B");
		listNames.add("C");
		listNames.add("D");
		listNames.add("E");
		listNames.add("F");
		listNames.add("G");
		listNames.add("H");
		
		Main m = new Main();
		System.out.println("*****Display Names*****");
		m.displayNames(listNames);
		System.out.println();
		
		System.out.println("*****Remove by Position*****");
		m.removeNameByPosition(3);
		m.displayNames(listNames);
		System.out.println();
		
		System.out.println("*****Remove by Name*****");
		m.removeNameByString("A");
		m.displayNames(listNames);
		System.out.println();
		
		System.out.println("*****Get index element*****");
		System.out.println(listNames.get(0));
		System.out.println();
		
		System.out.println("*****Modify name*****");
		m.modifyNameByPosition(2,"Z");
		m.displayNames(listNames);
		System.out.println();
		
		System.out.println("*****IndexOf*****");
		System.out.println(m.search("f"));
		if(m.search("f") >=0)
			System.out.println("String is present");
		else
			System.out.println("String is not present");
		System.out.println();
	}
	void displayNames(ArrayList<String> names) {
		for(String name:names) {
			System.out.println(name);
		}
	}
	void removeNameByPosition(int position) {
		listNames.remove(position);
	}
	void removeNameByString(String name) {
		listNames.remove(name);
	}
	void modifyNameByPosition(int position,String name) {
		listNames.set(position, name);
	}
	int search(String name) {
		return listNames.indexOf(name);
	}
}
