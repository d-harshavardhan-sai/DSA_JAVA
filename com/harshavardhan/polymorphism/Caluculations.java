package com.harshavardhan.polymorphism;

// Method overloading
//   method overloading in Java to create different methods with the same name but different signatures
//   number or type or order of parameters are changed
// example - Method overloading concept is used in system.out.println() method , ln, f and so on

public class Caluculations {
	// methods are unique in a class in java to avoid duplication
	public void add(int a, int b) {
		//add method code
	}


	/*            // not allowed
	 * public void add(int b, int a) { 
	 * //add method code
	 *  }
	 */

	/*            // not allowed
	 * public void add(int x, int y) { 
	 * //add method code
	 *  }
	 */

	public void add(int a, int b, int c) {
		//add method code
	}

	public void add(double a, double b) {
		//add method code
	}

	public void add(int a, String b) {
		System.out.println(a+b);
	}

	public void add(String a, int b) {
		//add method code
	}

	/*              // not allowed 
	 * public void add(String x, int y) { 
	 *   //add method code
	 *  }
	 */
	
	public static void main(String[] args) {
		Caluculations c = new Caluculations();
		c.add(3, "harsha");
		
		
	}

}



//polymorphism - multiple form
//Polymorphism - is the ability of an object to take on many forms.

//  Compile-time polymorphism(is a type of polymorphism which can be achieved at java compilation time)
//        - It is also referred as static polymorphism or early binding.
//        - It can be achieved using method overloading concept in java.

//  Run-time polymorphism(is a type of polymorphism which can be achieved at java runtime or execution time)
//        - It is also referred as dynamic polymorphism or dynamic method dispatch.
//        - It can be achieved using method overriding concept in java.


// method overriding - allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its superclasses or parent classes.
//      in com.harshavardhan.abstractClass 
//      in AHp.java copy method.
//      created ExtendedAHp.java in com.harshavardhan.abstractClass