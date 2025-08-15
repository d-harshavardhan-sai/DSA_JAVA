package com.harshavardhan.abstractClass;

public class AHp extends SampleAC { // not implements
	// The type AHp must implement the inherited abstract method SampleAC.keyboard()
	// 	the SampleAc.java abstract class has some un-implemented abstract methods
	// and here we are creating class, and class must have fully implementation
	// so we must need to provide implementation for the methods which we are inheriting here
	// only 2 methods came. because java knows that I provided implementation for other two methods.
	// advantage - code re-usability - for the classes which is visible as common code,we are keeping that common code in the abstract class SampleAc.java
	// so that we can use that code multiple time using extends key word(by inheriting)


	@Override
	public void cut() {
		System.out.println("hp cut code");

	}

	@Override
	public void keyboard() {
		System.out.println("hp keyboard code");

	}  
	
	public void copy() {
		System.out.println("hp updated copy code");
	}
	
	public static void main(String[] args) {
		AHp hp = new AHp();
		hp.copy(); // points to code() method which is in this method - overrides copy() in SampleAC abstract class
		}

}
