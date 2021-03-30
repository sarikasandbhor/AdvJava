package com.practice.predicate;

import java.util.function.IntPredicate;

public class Main {

	public static void main(String[] args) {
		IntPredicate lessThan18 = i->i<18;						//Lambda expression instead of IntPredicate anonymous class
		System.out.println("Less than 18 :"+lessThan18.test(10));
		
		IntPredicate moreThan10 = i->i>10;
		System.out.println("More than 10 :"+moreThan10.test(14));
		
		System.out.println("Less than 18 and More than 10 :"+lessThan18.and(moreThan10).test(25));
		System.out.println();
		
		new Main().demo(19, lessThan18, moreThan10);

	}
	void demo(int x,IntPredicate lessThan18,IntPredicate moreThan10) {
		if(lessThan18.and(moreThan10).test(x)) {
			System.out.println("Less than 18 and More than 10");
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
