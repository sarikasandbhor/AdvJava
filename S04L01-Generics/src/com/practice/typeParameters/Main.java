package com.practice.typeParameters;

/**
*<T> -> Some Type
*<E> -> Element
*<K> -> Key
*<V> -> Value
*<N> -> Number
**/
class Data<K,V>{
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
	
	
}
public class Main {

	public static void main(String[] args) {
		Data<Integer,String> data = new Data<Integer,String>(1, "A");			//Key Value data
		System.out.println("Key :"+data.getKey()+" Value :"+data.getValue());
		
		System.out.println();
		new Main().display("A", "B");
		
	}
	public<E,N> void display(E element,N number){						//Generic method which will return any type of data
		System.out.println("Element :"+element+" Number :"+number);
	}

}
