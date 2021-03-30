package com.practice.deleteFile;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("Practice\\Author\\TestFile.txt");
		if(file.delete()) {
			System.out.println("Deletion successful");
		}
		else {
			System.out.println("Error while deletion");
		}

	}

}
