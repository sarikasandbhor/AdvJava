package com.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		/**HashSet*/
		Set<String> hashSet = new HashSet<>();	//Frequently use set is HashSet
		System.out.println("HashSet Values");	//Sequence is not same
		for(int i=30;i>0;i--) {
			hashSet.add("A"+i);
		}
		new Sets().display(hashSet);
		System.out.println();
		
		/**LinkedHashSet*/
		Set<String> linkedHashSet = new LinkedHashSet<>();
		System.out.println("LinkedHashSet Values");		//Sequence is same
		for(int i=30;i>0;i--) {
			linkedHashSet.add("A"+i);
		}
		new Sets().display(linkedHashSet);
		System.out.println();
		
		/**TreeSet*/
		Set<String> treeSet = new TreeSet<>();
		System.out.println("TreeSet Values");			//Sequence is depend on compare method output
		for(int i=30;i>0;i--) {
			treeSet.add("A"+i);
		}
		new Sets().display(treeSet);
		
	}
	void display(Set<String> set) {
		for(String name:set) {
			System.out.println(name);
		}
	}
}
