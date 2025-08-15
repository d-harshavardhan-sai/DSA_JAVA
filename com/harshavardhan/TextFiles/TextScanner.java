package com.harshavardhan.TextFiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextScanner {
	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		Scanner scanner = new Scanner(file);
//		System.out.println(scanner.hasNext()); // returns boolean
		//using while loop
		
//		while(scanner.hasNext()) { // or we can use hasNextLine() also
//			System.out.println(scanner.nextLine());
//		}

//		scanner.close();
		
		String text = new String();
		while(scanner.hasNext()) { 
			text += scanner.nextLine() + "\n";
			
		}
		System.out.println(text);
		scanner.close();
		
		// second method
		
//		FileInputStream fis = new FileInputStream(file);
//		Scanner scanner = new Scanner(fis); 
//		fis.close();
	}
	
//  next()  token
//	nextLine() - line
//	hasNext - token
//	hasNextLine() - line
	
	
}
