package com.harsha;

import com.harshavardhan.accessModifiers.Student;

// Inheritance SubClass
public class SubClass extends Student {

	public void test() {
		System.out.println(rollNo);
		printRollNumber();
	}
	public static void main(String[] args) {
			
		new SubClass().test();
	}

}
