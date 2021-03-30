package com.practice.writeIntoFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("Practice\\Author\\Names.txt");
		file.createNewFile();
		System.out.println("File Created");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true)))
		{
			bw.write("XYZ");bw.newLine();
			bw.write("ABC");bw.newLine();
			bw.write("LMN");bw.newLine();
			bw.write("PQR");bw.newLine();
			bw.write("GIF");bw.newLine();
			bw.close();
		}catch (IOException e) {
			System.out.println("Unable to write onto file");
		}
		
	}

}
