package com.harshavardhan.interfaces;

// Interface
public interface Laptop {
	
	public void copy();  // interface method (does not have a body)
	
	public void paste(); // Defined or unimplemented methods are known as abstract methods
	
	public void cut();
	
	public void keyboard();
	
	//public void security(); // here all the classes which implements this Interface will be affected.
	
	default void security( ) { // to overcome the above situation, java provided implementation in interface itself using default and static keywords.
		System.out.println("please implement");  // No impact in classes which are implementing this Interface.// So interface is no longer an abstract method.
		audio();    // static methods can be used in non-static methods.
		commonCode();
	}
	
	static void audio() {     // without creating object we can use it
		System.out.println("Laptop audio code");
		//security();// non-static methods are not used in static methods//Cannot make a static reference to the non-static method security() from the type Laptop
		commonCode();
	}
	
	private static void commonCode() {
		System.out.println("CommonCode");
	}
}


// Interface is a blueprint of a class
// Interface - What to do(methods); Class - What and How to do.
// If interface is implemented then it is a class




//Interface is nothing but a business document, where it has certain guidelines and rules(methods) only What to do
//class implements Interfaces How to do.