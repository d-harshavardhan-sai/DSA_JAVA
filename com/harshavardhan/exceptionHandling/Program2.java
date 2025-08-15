package com.harshavardhan.exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Program2 {

	public static void main(String[] args) throws Throwable {// Throwable or IOException or FileNotFoundException or Exception

		File file = new File("./sample.txt");
		if(!file.exists()) {
			file.createNewFile();
		}	
		try (FileReader fr = new FileReader(file);
			 FileInputStream fis = new FileInputStream(file);
			 InputStreamReader isr = new InputStreamReader(fis);
			 BufferedReader br = new BufferedReader(fr);){

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
		int[] arr = {1,2};
		System.out.println(arr[1]/0);
		}
//		catch (Exception ex){ // handle through single exception
//			ex.printStackTrace();
//		}
		
		// multiple catch blocks
		
//		catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		}
//		catch (ArrayIndexOutOfBoundsException e2) {
//			e2.printStackTrace();
//		}
//		catch (ArithmeticException e3) {
//			e3.printStackTrace();
//		}
		
		// multiple exceptions in one catch block using pipe symbol
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException e2) {
			e2.printStackTrace();
			System.err.println("common output");
//			System.exit(0);
		}
		finally {
			System.out.println("finally");
		}
		
		// custom exception
		
//		try {
//			System.out.println(1/0);
//		} catch (ArithmeticException e) {
//			throw new ArithmeticException("stupid don't divide with 0");
//		}
		
		// custom exception by creating a class
		
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			throw new CustomException("stupid don't divide with 0"); // calling parameterized constructor
		}
	}
}

//Try with resources - for data leakage close() method
// try(resources) {//statements}
//automatically calls AutoClosable class, which prevents data lekage

//multiple catch blocks for handling exceptions differently.

// finally block not executes if  system.exit(0); after this line no code executes - terminates

// select + right click + surround with + type of catch clock specify

