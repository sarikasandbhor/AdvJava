package com.practice.compareTo;

import java.util.LinkedList;
import java.util.List;

public class CompareTo {

	public static void main(String[] args) {
		int result1,result2,result3;
		List<String> names = new LinkedList<>();		//Recommended way to define List
		names.add("AG");
		names.add("AT");
		names.add("AR");
		names.add("AA");
		names.add("AD");
		names.add("AC");
		result1 = names.get(0).compareTo("AA");
		System.out.println("CompareTo of AA & AG :"+result1);
		result2 = names.get(3).compareTo("AA");
		System.out.println("CompareTo of AA & AA :"+result2);
		result3 = names.get(0).compareTo("AR");
		System.out.println("CompareTo of AG & AR :"+result3);

	}

}
