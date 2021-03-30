package com.practice.comparableInterface;

import java.util.LinkedList;
import java.util.List;
class Names implements Comparable<Names>{

	String name;
	
	public Names(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Names obj) {
		if(name.length() == obj.name.length())
			return 0;
		else if(name.length() < obj.name.length())
			return -1;
		else
			return 1;
	}
	
}

public class ComparableInterface {

	public static void main(String[] args) {
		int result1,result2,result3;
		List<Names> names = new LinkedList<>();		//Recommended way to define List
		names.add(new Names("AG"));
		names.add(new Names("AT"));
		names.add(new Names("AR"));
		names.add(new Names("AA"));
		names.add(new Names("AD"));
		names.add(new Names("AC"));
		result1 = names.get(0).compareTo(new Names("AAG"));
		System.out.println("CompareTo of AA & AG :"+result1);
		result2 = names.get(3).compareTo(new Names("AA"));
		System.out.println("CompareTo of AA & AA :"+result2);
		result3 = names.get(0).compareTo(new Names("A"));
		System.out.println("CompareTo of AG & AR :"+result3);
	}

}
