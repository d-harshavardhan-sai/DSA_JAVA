package com.harshavardhan.PojoJavaBean;

import java.io.Serializable;

public class Student implements Serializable{
	int id;
	String name;
	double marks;

	public Student() {

	}

	public Student(int id, String name) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

}

//JavaBean class
//It is an extended version of pojo class
//It is also referred as serializable pojo class 
//Rules for class to be called as JavaBean class
//1.It should implement serializable interface
//2.It should have a no-args constructor
//3.All the properties(instance variables) should be private
//4.It should have Getters and Setters (public) in order to access the properties.

//Differences between pojo and javabean
//  pojo is non-serializable class but java bean implements serializable class interface implementation
//  pojo used every time we want. but java bean used only for network stream transfer
