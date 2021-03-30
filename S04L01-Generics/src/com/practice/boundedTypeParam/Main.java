package com.practice.boundedTypeParam;

class Data<K,V extends Main>{					//Bounded V as Object of Main class
	private K key;
	private V value;
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	public<E,N extends Number> void displayData(E element,N number) {			//Bounded N as Number so we are restricting value of input as Number only not any String
		System.out.println("Element :"+element+" Number :"+number);
	}
}
public class Main {

	public static void main(String[] args) {
		Data<Integer,Main> data = new Data<Integer,Main>(1,new Main());
		System.out.println("Key :"+data.getKey());
		
		data.displayData("A", 1);
		
		data.getValue().test();					//Using getValue() calling test method
		

	}
	void test() {
		System.out.println("Test");
	}

}
