package com.practice.readFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadUsingScanner {

	public static void main(String[] args) {
		String fileName = "Practice\\Author\\Names.txt";
		try {
			Scanner sc = new Scanner(new File(fileName));
			String line;
			while(sc.hasNext()) {
				line = sc.next();
				System.out.println(line);
				
			}
			sc.close();
			System.out.println("File read completed");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

}
