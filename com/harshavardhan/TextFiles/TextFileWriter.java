package com.harshavardhan.TextFiles;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(file.exists()) {
			file.delete();
		}
		file.createNewFile();
		
		
		String s = "helloworld";
		FileWriter fw = new FileWriter(file);
		
		
		    fw.write(s);//fw.write(s.toCharArray());
			
			
			fw.flush();
			fw.close();
	}

}

