package com.practice.listUsingGeneric;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class GenericData<T>{
	private T obj;

	public GenericData(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "GenericData [obj=" + obj + "]";
	}
}

public class Main {

	public static void main(String[] args) {
		List<GenericData<Object>> list = new LinkedList<GenericData<Object>>();
		list.add(new GenericData<Object>("Some String"));
		list.add(new GenericData<Object>(1));
		list.add(new GenericData<Object>(1.0f));
		list.add(new GenericData<Object>(2.0));
		list.add(new GenericData<Object>('@'));
		
		new Main().displayList(list);
	}
	void displayList(List<GenericData<Object>> list) {
		ListIterator<GenericData<Object>> entry = list.listIterator();
		while(entry.hasNext()) {
			System.out.println("Element :"+entry.next().getObj());
		}
	}
}
