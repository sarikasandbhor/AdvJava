package com.practice.readFromFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingBufReader {

	public static void main(String[] args) {
		File file = new File("Practice\\Author\\Names.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){	//close br automatically
			String line;
			System.out.println("Reading from File");
			while((line = br.readLine())  != null) {
				System.out.println(line);
			}
			//br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
	}

}
