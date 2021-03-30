package com.practice.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) {
		try (FileInputStream FIO = new FileInputStream(new File("SrcTestFile.txt"))){
			try(ObjectInputStream os = new ObjectInputStream(FIO)) {
				Vehicle car = (Vehicle) os.readObject();
				Vehicle bike = (Vehicle) os.readObject();
				System.out.println("Car :"+car+" Bike :"+bike);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
