package com.practice.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle(2, "car");
		Vehicle bike = new Vehicle(3, "bike");
		
		
		try(FileOutputStream FIO = new FileOutputStream(new File("SrcTestFile.txt"))) {
			try(ObjectOutputStream os = new ObjectOutputStream(FIO)) {
				os.writeObject(car);
				os.writeObject(bike);
				System.out.println("Write successfully");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
