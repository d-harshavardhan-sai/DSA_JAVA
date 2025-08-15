package com.harshavardhan.exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program1 {

	//Stack trace
	/*
	 * Exception name - java.lang.ArithmeticException
	 * Exception message - / by zero
	 * Which line number - 
	 * Methods info - 
	 */
	// we have to go from down to top method follows

	// throws keyword used at the method declaration place to instruct java to check certain exception in compile time itself instead of using try and catch block
	public static void main(String[] args) throws FileNotFoundException, IOException {// We can also java to check multiple exceptions at compile time
		System.out.println("Program Execution Start");
		int fNumber = 5;
		int sNumber = 0;
		int result = 0;

		// FileNotFoundException
		File file = new File("D:/resume.docx");
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis);

		try {

			result = fNumber/sNumber; //5/0 is an infinite or undefined impossible task. so we got exception

		} catch (ArithmeticException ae) { // write a logic to define log files
			System.out.println(ae.toString()); // or we can use (Arrays.toString(ae.getStrackTrace())); or (ae.getMessage()); or ae.printStrackTrace();

			// Again we throw the exception to java to terminate the program execution
			throw ae;

			// we cannot execute code further since java will terminate the execution when we throw the exception
			//System.out.println("output is: " + result);
		}

		finally {
			System.out.println("finally block");
		}


		System.out.println("output is: " + result);

		System.out.println("Program Execution End");

		/*we cannot execute the 'finally' without 'try'
		 * finally { System.out.println("Finally executed the code"); }
		 */
	}
}





// Exception is an event that occurs during the execution of the program that disrupts the normal flow of instructions
// Exception handling is the mechanism to handle runtime errors so that regular flow of the application can be preserved
// When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).
// Exception handling has to be done by user. If not by default java will terminate the execution of program.
//    checked exception(compile-time exception)
//    unchecked exception(runtime exception)
// try, catch , finally are blocks
// The try statement allows you to define a block of code to be tested for errors while it is being executed.
// The catch statement allows you to define a block of code to be executed, if an error occurs in the try block
// The finally statement lets you execute code, after try...catch, regardless of the result
//try {
//  Block of code to try
//}
//catch(Exception e) {
//  Block of code to handle errors
//}
//finally {
//  Block of code executed every time either we get error or we don't get any error.
//}

// try and catch are mandatory for exception handling
// finally is optional
// finally can't be executed without try block

// The throws keyword indicates what exception type may be thrown by a method.

/*
 * throw                                        throws 
 *                                  
 * Used to throw an exception for a method      Used to indicate what exception type may be thrown by a method     
 * 
 * Cannot throw multiple exceptions             Can declare multiple exceptions 
 * 
 * Syntax:                                      Syntax:
 * throw is followed by an object (new type)    throws is followed by a class 
 * used inside the method                       and used with the method signature
 * 
 */

// Hierarchy of exceptions in java
// @ Object
//    @ Throwable
//       @ Exception
//           @ Run-time exception
//             - IndexOutOfBoundsException
//             - NullPointerException
//             - ArithmeticException
//           @ IOException
//             - FileNotFoundException
//           @ SQLException

// checked exceptions are which not below the run-time exceptions

// Exception- is the Super class of all the exception
// Super class of Exception is Throwable - Exception is the child class of Throwable