package com.practice.treeMap;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	public String sectionNo;
	public String lectorNo;
	public Code(String sectionNo, String lectorNo) {
		this.sectionNo = sectionNo;
		this.lectorNo = lectorNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectorNo() {
		return lectorNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectorNo=" + lectorNo + "]";
	}
	@Override
	public int compareTo(Code obj) {
		String code1 = sectionNo+lectorNo;
		String code2 = obj.sectionNo+obj.lectorNo;
		return code1.compareTo(code2);
	}
	
	/**Override hashcode and equals method*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lectorNo == null) ? 0 : lectorNo.hashCode());
		result = prime * result + ((sectionNo == null) ? 0 : sectionNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		if (lectorNo == null) {
			if (other.lectorNo != null)
				return false;
		} else if (!lectorNo.equals(other.lectorNo))
			return false;
		if (sectionNo == null) {
			if (other.sectionNo != null)
				return false;
		} else if (!sectionNo.equals(other.sectionNo))
			return false;
		return true;
	}
	
}
public class Main {

	
	public static void main(String[] args) {
		Map<Code,String> map = new TreeMap<>();		//It will not return duplicate values
		map.put(new Code("S01", "L01"), "OOP");
		map.put(new Code("S01", "L03"), "Generics");
		map.put(new Code("S01", "L05"), "Collections");
		map.put(new Code("S01", "L02"), "Core Java");
		map.put(new Code("S02", "L01"), "Multi threading");
		map.put(new Code("S04", "L03"), "Classes Objects");
		map.put(new Code("S01", "L03"), "Exception Handling");
		
		System.out.println("Search with key");
		System.out.println(map.get(new Code("S01", "L03")));
		System.out.println();
		
		for(Map.Entry<Code, String> element:map.entrySet()) {
			if(element.getValue().equals("OOP")) {
				System.out.println("Code of OOP is"+element.getKey());
				System.out.println();
			}
			System.out.println("Key :"+element.getKey()+", Value :"+element.getValue());
		}
		
		System.out.println();
		Code code1 = new Code("S01", "L03");
		Code code2 = new Code("S01", "L03");
		System.out.println("Hashcode of code1 :"+code1.hashCode()+" Hashcode of code2 :"+code2.hashCode());
		System.out.println();
		System.out.println("Compare code1 & code2 :"+code1.equals(code2));
	}

}
