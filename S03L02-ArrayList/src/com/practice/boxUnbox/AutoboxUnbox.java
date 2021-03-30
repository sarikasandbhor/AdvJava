package com.practice.boxUnbox;

import java.util.ArrayList;

class intWrapper{
	int intValue;

	public intWrapper(int intValue) {
		this.intValue = intValue;
	}
	public int getIntValue() {
		return intValue;
	}
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
}
public class AutoboxUnbox {

	public static void main(String[] args) {
		/**In java autoboxing and unboxing done by itself if we use wrapper class of primitive datatypes*/
		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(10);							//autoboxing
		System.out.println(intArray.get(0));		//unboxing

		/**Customize boxing and unboxing by creating integer wrapper class*/
		ArrayList<intWrapper> intWrapArray = new ArrayList<>();
		intWrapArray.add(new intWrapper(20));		//boxing -- Converting primitive datatype into an object 
		System.out.println(intWrapArray.get(0).getIntValue());	//unboxing -- Converting an object to primitive datatype
		
		/**Java do internal boxing and unboxing like follow*/
		ArrayList<Float> floatArray = new ArrayList<>();
		floatArray.add(Float.valueOf(10.0f));		//Internal boxing
		System.out.println(floatArray.get(0).floatValue());   //Internal unboxing
	}

}
