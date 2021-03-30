package com.practice.genericClass;

class CollectionObject{
	private Object obj;

	public CollectionObject(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "CollectionObject [obj=" + obj + "]";
	}
}

class GenericClass<T>{
	private T obj1;

	public GenericClass(T obj1) {
		this.obj1 = obj1;
	}

	public T getObj1() {
		return obj1;
	}

	@Override
	public String toString() {
		return "GenericClass [obj1=" + obj1 + "]";
	}
	
}
public class Main {

	public static void main(String[] args) {
		CollectionObject obj = new CollectionObject("Any String");
		String tempStr = (String) obj.getObj();		 //type casting is required so performance gets reduced
		System.out.println("Using Collection Object");
		System.out.println("String is :"+tempStr);
		System.out.println();
		
		GenericClass<String> obj1 = new GenericClass<String>("Some String");
		String tempStr1 = (String) obj1.getObj1();		 //type casting is not required so performance will not reduced
		System.out.println("Using Generic Type<T>");
		System.out.println("String is :"+tempStr1);
	}

}
