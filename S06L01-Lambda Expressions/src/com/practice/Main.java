package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Lambda{
	public void testLambda();
}

interface TypeCast{
	public int testTypeCast();
}

class Data{
	private String name;

	public Data(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
}

public class Main {

	public static void main(String[] args) {
		/**Without Lambda Expressions*/
		Lambda lambda = new Lambda() {					//To print a single statement we need to write these many lines of code
			
			@Override
			public void testLambda() {
				System.out.println("Statement 1");	
			}
		};
		lambda.testLambda();
		System.out.println();
		
		/**With Lambda Expressions*/
		Lambda lambda1 = ()->System.out.println("Statement 1");	// Using lambda expressions we can print using 2 statements	
		lambda1.testLambda();
		System.out.println();
		
		
		/**Thread is implementing Runnable interface & run method inside it is a
		 * functional interface as it having only one abstract method*/
		new Thread(()->
		{
			System.out.println("Thread 1 is getting started");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread 1 is completed");
		}).start();
		System.out.println();
		
		
		/**Using Lambda Expression in Comparable Interface*/
		List<Data> list = new ArrayList<>();
		list.add(new Data("ABCDEF"));
		list.add(new Data("A"));
		list.add(new Data("ABC"));
		list.add(new Data("ABCDEFG"));
		list.add(new Data("ABCD"));
		list.add(new Data("ABC"));
		
		Collections.sort(list, (Data obj1,Data obj2)->{								//As comparator interface is having abstract compareTo method we can use lambda expression
			if(obj1.getName().length()>obj2.getName().length())
				return -1;
			else if(obj1.getName().length()<obj2.getName().length())
				return 1;
			else
				return 0;
		});	
		
		
		System.out.println("After sorting list");
		for(Data name:list) {
			System.out.println(name.getName());
		}
		System.out.println();
		
		/**Implicit type casting using lambda expressions*/
		TypeCast test = ()->{
			
			System.out.println("Value of test method returns:");
			return ((10*25)/3);
			
		};
		System.out.println(test.testTypeCast());			//Type Casting is also done by lambda expression
		System.out.println();
		
		
		/**Using lambda expressions in forEach loop*/ 
		List<Data> names = new ArrayList<>();
		names.add(new Data("ABCDEF"));
		names.add(new Data("A"));
		names.add(new Data("ABC"));
		names.add(new Data("ABCDEFG"));
		names.add(new Data("ABCD"));
		names.add(new Data("ABC"));
		
		names.forEach(temp -> System.out.println(temp.getName()));
	}

}
