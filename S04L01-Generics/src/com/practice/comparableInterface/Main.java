package com.practice.comparableInterface;

class Data<T extends Comparable<T>> implements Comparable<T>{
	private T var;

	public Data(T var) {
		super();
		this.var = var;
	}

	public T getVar() {
		return var;
	}

	@Override
	public String toString() {
		return "Data [var=" + var + "]";
	}

	@Override
	public int compareTo(T obj) {
		return getVar().compareTo(obj);
	}
	
}

public class Main {

	public static void main(String[] args) {
		Data<Integer> data = new Data<Integer>(1);		//Part1
		System.out.println(data.compareTo(2));			//Part2
		System.out.println(data.compareTo(1));
		System.out.println(data.compareTo(-1));
		

	}

}
