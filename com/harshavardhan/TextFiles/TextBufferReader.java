package com.harshavardhan.TextFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextBufferReader {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		// we can also do, since both are readers
		
		FileReader fr = new FileReader(file);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(fr);
		
		//character by character
//		int asciiCode;
//		String text = new String();
//		while((asciiCode = br.read()) != -1) { 
//			text += String.valueOf((char)asciiCode);
////			System.out.println((char)asciiCode);
//		}
//		System.out.println(text);
//		fr.close();
//		br.close();
//		fis.close();
//		isr.close();
		
		// line by line
		String text = new String();
		String line = new String();
		while (((line = br.readLine()) != null)) {
			text +=line + "\n";
		}
		System.out.println(text);
		fr.close();
		br.close();
		fis.close();
		isr.close();
		
		

	}

}
