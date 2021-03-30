package com.practice.genericMethod;

import java.util.LinkedList;
import java.util.List;


class Data{
	public<E> void displayList(List<E> list){
		for(E element:list) {
			System.out.println(element);
		}
	}
	public<E> void displayArray(E[] array) {
		for(E element:array) {
			System.out.println(element);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Data data = new Data();
		List<String> strList = new LinkedList<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		System.out.println("***********String List***********");
		data.displayList(strList);
		System.out.println();
		
		List<Integer> intList = new LinkedList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		System.out.println("***********Integer List***********");
		data.displayList(intList);
		System.out.println();
		
		String[] strArray = {"X","Y","Z"};
		System.out.println("***********String Array***********");
		data.displayArray(strArray);
		System.out.println();
		
		Integer[] intArray = {1,2,3};
		System.out.println("***********Integer Array***********");
		data.displayArray(intArray);
		System.out.println();
	}

}
