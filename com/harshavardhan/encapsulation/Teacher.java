package com.harshavardhan.encapsulation;

public class Teacher {
	public static void main(String[] args) {
		Student s = new Student(101);
		//s.isAttended = true;          // here still I am accessing data on the object. Data should not exposed to rest of the world.
		s.setStudentAttendance(true);// so for this we are making variables as private in Student.java
		s.getStudentAttendance();
	}
}
