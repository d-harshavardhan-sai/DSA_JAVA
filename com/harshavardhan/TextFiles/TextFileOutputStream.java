package com.harshavardhan.TextFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextFileOutputStream {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(file.exists()) {
			file.delete();
		}
		file.createNewFile();
		
		// FileOutputStream - with single inputs as asciis
		
//		FileOutputStream fos = new FileOutputStream(file);
//		fos.write(72); // input is ascii codes and written as character in the file
//		fos.write(69);
//		fos.write(76);
//		fos.write(76);
//		fos.write(79);
//		
//		fos.flush();
		
		// FileOutputStream - as a string input
		
		String s = "hello";
		FileOutputStream fos = new FileOutputStream(file);
		
		for(char ch : s.toCharArray()) {
			fos.write((int)ch);
			
			
			fos.flush(); 
			fos.close(); // close must not be placed before flush
		}
	}

}


// Different ways of writing the data into text files in java
//   - FileOutputStream
//   - FileWriter
//   - BufferedWritter

// common method in these three is flush(); as like close(); we can use them both at a time
// If we forgot to use flush method close method indirectly calls the flush method

// Scanner is missing in this case, because scanner only read the data, not suppose to write.