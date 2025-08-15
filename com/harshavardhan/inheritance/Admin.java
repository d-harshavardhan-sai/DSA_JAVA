package com.harshavardhan.inheritance;

//public class Admin extends Developer, Guest {} is Multiple Inheritance

// In java multiple inheritance is not applicable at class level
// In Java, a class cannot extend more than one class
// However, a class can implement one or more interfaces, which has helped Java get rid of the impossibility of multiple inheritances.
// The reason behind this is to prevent ambiguity.
// Consider a case where class B extends class A and Class C and both class A and C have the same method display().
// Now java compiler cannot decide, which display method it should inherit. To prevent such situation, multiple inheritances is not allowed in java

public class Admin extends Developer {

	// Developer added to this code so no need to put read and write as well
	/*
	 * public void read() { System.out.println("Read Code"); }
	 * 
	 * public void write() { System.out.println("Write Code"); }
	 */
	
	//Adding or deleting the products/application
	public void manage() {
		super.read();  // it points read method in the parent class not in  the current class
		read();  // it points read method in current class and if it is not present in the current class then it will point to the super class if exists
		write(); // no need to create object. Because it is extended by the child class.
		System.out.println("Manage Code");
	}
	public void read() {
		System.out.println("read admin code");
	}

}
