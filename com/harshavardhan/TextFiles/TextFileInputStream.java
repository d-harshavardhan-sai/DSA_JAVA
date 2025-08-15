package com.harshavardhan.TextFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TextFileInputStream {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
//		file.delete();
		
		FileInputStream fis = new FileInputStream(file);
		
//		System.out.println((char)fis.read()); // if char not used 104 ASCII code is h
		
		// using while loop
//		int asciiCode;
//		while((asciiCode = fis.read()) != -1) { // -1 is the end of the file when all character are read.
//			
//			System.out.print((char)asciiCode);
//			
//		}
//		
//		fis.close();  // to stop data leakage
		
		int asciiCode;
		String text = new String();
		while((asciiCode = fis.read()) != -1) { 
			
			text += String.valueOf((char)asciiCode);
//			System.out.print((char)asciiCode);
		}
		System.out.println(text);
		fis.close();
	}

}

// Different way for reading the data from text file in java
//    - FileInputStream(FileInputStream to read data from files in bytes.)
//    - Scanner
//    - FileReader
//    - BufferedReader
