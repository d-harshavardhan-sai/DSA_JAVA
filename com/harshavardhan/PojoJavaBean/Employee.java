package com.harshavardhan.PojoJavaBean;
// All rules mentioned are following by this class
public class Employee {
	
	private int id;
	public String name;
	protected double salary;
	
	public Employee() {
		System.out.println("no arg constructor is called");
	}
	public void setID(int id) {
		this.id = id;
	}
	public int getID() {
		return id;
	}
}

//POJO class
//Plain Old Java Object
//It is a simple java object, which is not bound by any special restriction

//Rules for class to be called as pojo class
//1)It must be public
//2)It is recommended to make the properties(instance variables) as private for improved security.
//3)It can have Getters and Setters in order to access the properities
//4)It shouldn't implement any interfaces.
//5)It shouldn't extend any classes
//6)It shouldn't have any annotations(like @override) specified.
//
//  2), 3) are not mandatory. if 2 is used then 3 must also used

// it is recommended not to add main method for pojo class

// to store multiple information at a time