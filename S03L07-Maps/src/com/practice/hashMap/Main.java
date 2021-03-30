package com.practice.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");
		map.put(1, "G");					//Last element will display if key is same
		
		/**First way to print Map elements*/
		System.out.println("Using entrySet()");
		for(Map.Entry<Integer, String> element:map.entrySet()) {
			System.out.println("Key :"+element.getKey()+", Value :"+element.getValue());
		}
		System.out.println();
		
		/**Second way to print Map elements*/
		System.out.println("Using keySet()");
		for(Integer key:map.keySet()) {
			System.out.println("Key :"+key+", Value :"+map.get(key));
		}
		System.out.println();
		
		/**Second way to print Map elements*/
		System.out.println("Using Entry Iterator");
		Iterator<Entry<Integer,String>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			System.out.println("Key :"+iterator.next().getKey()+", Value :"+iterator.next().getValue());
		}
	}	

}
