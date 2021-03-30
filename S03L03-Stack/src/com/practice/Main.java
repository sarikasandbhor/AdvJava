package com.practice;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> intStack = new Stack<>();
		for(int i=1;i<=10;i++) {
			intStack.push(i);
		}
		System.out.println(intStack);
		
		System.out.println(intStack.peek());
		intStack.pop();
		System.out.println();
		System.out.println("After Pop stack");
		System.out.println(intStack);
		
		System.out.println();
		System.out.println("Is 7 present :"+intStack.search(7));
		
		intStack.add(11);
		System.out.println();
		System.out.println(intStack);
		intStack.remove(intStack.size()-3);
		System.out.println();
		System.out.println(intStack);
		
		System.out.println();
		System.out.println("Is stack empty :"+intStack.isEmpty());
		

	}

}
