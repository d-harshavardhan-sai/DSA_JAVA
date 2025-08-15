package com.harshavardhan.inheritance;

//Inheritance(parent and child)
//A principle of OOPS for code re-usability
//Inheritance is a mechanism in which one class acquires all the properties and behaviors of another class with the specific relationship.
//Super class and Sub class(parent and child)
//Type of inheritance - Multiple inheritance(child inherits multiple parents), Multi-level(child inherits father, father inherits grand father) inheritance
// code re-usability, repeat decrease, size decreases, performance increases,   increases, maintainability
// sub class extends super class - child extends parent

// Multi-level inheritance
// Guest-parent
// Developer-child to Guest
// Admin- child to Developer

public class Guest {

	public void read() {
		System.out.println("Read Code");
	}

}
