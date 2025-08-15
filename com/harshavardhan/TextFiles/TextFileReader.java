package com.harshavardhan.TextFiles;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileReader fr = new FileReader(file);
		int asciiCode;
		String text = new String();
		while((asciiCode = fr.read()) != -1) { 
			text += String.valueOf((char)asciiCode);
//			System.out.println((char)asciiCode);
		}
		System.out.println(text);
		fr.close();
		

	}

}
