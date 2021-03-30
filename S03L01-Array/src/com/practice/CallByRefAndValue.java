package com.practice;

public class CallByRefAndValue {

	public static void main(String[] args) {
		/**Call by value*/
		System.out.println("*********Call by Value*********");
		int value =10;
		CallByRefAndValue A = new CallByRefAndValue();
		A.displayValue(value);
		System.out.println("After modified value from method :"+value); //No change of value
		System.out.println();
		
		/**Call by reference*/
		System.out.println("*********Call by Reference*********");
		String[] strNames = {"A","B","C","D","E","F"};
		A.displayRefNames(strNames);
		
		System.out.println();
		System.out.println("Names at index 0 :"+strNames[0]);   //value got changed
		
		
	}
	
	public void displayValue(int value)
	{
		System.out.println("Value passed from method :"+value);
		value = 20;					//it will store to local memory location and when method ends that memory location gets released 
		System.out.println("Modified value :"+value);
	}
	
	public void displayRefNames(String[] names)
	{
		names[0] = "Z";					//it will change the value and never release memory location
		for(String name:names)
		{
			System.out.println(name);
		}
		
	}
	

}
