package com.test.springboot.javaBasic.javaBasic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadWriteFile {
	public static void main(String[] args) {

		// The name of the file to open.
		String fileName = "DemoFile.txt";

		// This will reference one line at a time
		String line = null;

		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int counter =1;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.print(counter+" ");
				System.out.println(line);
				counter++;
				
			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			
		}
	}
}
