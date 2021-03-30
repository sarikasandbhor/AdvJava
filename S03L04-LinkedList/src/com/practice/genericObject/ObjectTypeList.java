package com.practice.genericObject;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ObjectTypeList {

	public static void main(String[] args) {
		List<Object> names = new LinkedList<>();		//Recommended way to define List
		names.add("G");
		names.add("T");
		names.add("R");
		names.add(9);
		names.add("A");
		names.add("D");
		names.add(90.0f);
		names.add(70.0);
		names.add("C");
		System.out.println("List of Items");
		new ObjectTypeList().displayList(names);
		
	}
	void displayList(List<Object> list) {
		Iterator<Object> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
