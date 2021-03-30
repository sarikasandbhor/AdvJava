package com.practice.createFile;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File directory = new File("PracticeNew");
		directory.mkdir();
		System.out.println("Directory is created");
		
		directory = new File("Practice\\Author");
		directory.mkdirs();								//Multiple directories
		System.out.println("Directories are created");
		
		File file = new File("Practice\\Author\\TestFile.txt");		//Take relative path to create file
		file.createNewFile();
		System.out.println("File is created");
		
		file = new File("src\\SrcTestFile");
		file.createNewFile();
		System.out.println("File is created in Src Folder");
		
		file = new File("C:\\Users\\darkhorse\\Desktop\\Sarika Docs\\TestFile.java");
		file.createNewFile();
		System.out.println("File is created at given Path");
		
		
	}

}
