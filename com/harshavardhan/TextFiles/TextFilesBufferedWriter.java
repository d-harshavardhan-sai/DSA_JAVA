package com.harshavardhan.TextFiles;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

public class TextFilesBufferedWriter {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(file.exists()) {
			file.delete();
		}
		file.createNewFile();
		
		
		String s = "helloworld buffer";
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		
		    bw.write(s);
			
			
			bw.flush();
			bw.close();
	}

}


