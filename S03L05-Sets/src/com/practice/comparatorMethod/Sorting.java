package com.practice.comparatorMethod;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<K,V>{
	private int key;
	private String value;
	public Data(int key, String value) {
		this.key = key;
		this.value = value;
	}
	public int getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
}

public class Sorting {

	public static void main(String[] args) {
		Comparator<Data<Integer,String>> COMPARE_KEY = new Comparator<Data<Integer,String>>() {

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if(obj1.getKey() == obj2.getKey()) {
					return 0;
				}else if(obj1.getKey()<obj2.getKey()) {
					return -1;
				}
				else {
					return 0;
				}
			}
		};
		
		Comparator<Data<Integer,String>> COMPARE_BY_LENGTH = new Comparator<Data<Integer,String>>() {

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if(obj1.getValue().length() == obj2.getValue().length()) {
					return 0;
				}else if(obj1.getValue().length()<obj2.getValue().length()) {
					return -1;
				}
				else {
					return 0;
				}
			}
		};
		
		Set<Data<Integer,String>> set = new TreeSet<>(COMPARE_BY_LENGTH);
		//Set<Data<Integer,String>> set = new TreeSet<>();
		//Set<Data<Integer,String>> set = new LinkedHashSet<>();
		set.add(new Data<Integer,String>(1,"A"));
		set.add(new Data<Integer,String>(2,"AC"));
		set.add(new Data<Integer,String>(3,"AAX"));
		set.add(new Data<Integer,String>(4,"AAAAY"));
		set.add(new Data<Integer,String>(6,"AAAZ"));
		set.add(new Data<Integer,String>(8,"AAAAAU"));
		set.add(new Data<Integer,String>(2,"AAAAAAAAC"));
		
		System.out.println("Elemenets are:");
		for(Data<Integer,String> element:set) {
			System.out.println(element);
		}
		

	}

}
