package com.harshavardhan.abstractClass;

public interface ALaptop {
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
}

// Here, I don't want to create implementation for all these methods
// Only for copy() and paste() - it is not possible in the class but can be done by abstract class

// we cannot implement abstract class like interface.
// we cannot extends multiple abstract classes into a single class
// non-abstract methods can be put in abstract class
// we can't create an instance for abstract class
// used for partial implementation of interfaces
// abstract is a non-accesible modifier
// Abstract Class is a class which can contain the abstract methods and is defined with the keyword abstract.
// Abstract methods - Defined or unimplemented methods are known as abstract methods.
// Before java 8, there is no methods such as default and static, in order to implement abstract methods in interface itself.
// So before java 8, abstract class is introduced in order to implement abstract methods not in only one class all
// For suppose, in a business, there will be vendors and 3rd party vendor.
// these 3rd party vendor do not implement all the methods instead they implement some of the methods of Interface.
