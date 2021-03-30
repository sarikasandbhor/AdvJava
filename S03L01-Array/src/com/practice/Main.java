package com.practice;

public class Main {

	public static void main(String[] args) {
		/**Array Initialization*/
		System.out.println("***************Array Initialization***************");
		int[] intArray = {1,2,3,4,5};
		System.out.println(intArray[2]);
		
		float[] floatArray = new float[5];
		for(int i=0;i<5;i++)
		{
			floatArray[i] = i;
		}
		System.out.println(floatArray[4]);
		System.out.println();

		/**Use of foreach loop*/
		System.out.println("***************ForEach Loop***************");
		String[] strArray = {"A","B","C","D","E","F"};
		
		for(String name:strArray)
		{
			System.out.println("Name :"+name);
		}
		
	}

}
