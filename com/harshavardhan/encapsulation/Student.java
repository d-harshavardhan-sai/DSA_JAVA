package com.harshavardhan.encapsulation;

// Encapsulation(to secure our data using methods.)(to get control on the data.)
public class Student {
	private int rollNo;
	private String name;
	private boolean isAttended;

	public Student(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setStudentAttendance(boolean flag) {
		if(!isAttended)
			isAttended = flag;
		isAttended = flag;
		System.out.println("teacher assigned attendance to sudent");
	}
	public boolean getStudentAttendance() {
		System.out.println("teacher accessed student attendance");
		return isAttended;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}



// Encapsulation is a mechanism of wrapping the data(variables) and code acting on the data(methods) together as a single unit.
// Encapsulation describes the ability of an object to hide its data and methods from the rest of the world.
// We are trying to hide the data from the rest of the world by providing the methods to access the data.
// So that is why Encapsulation is called data-hiding.
// class- is a container in which we will have the data and the code(encapsulation example)(an also object as an example of encapsulation).

// how can we hide the data and code which is in the class from the rest of the world. For that we need to specify some access modifiers on them. We can provide private visibility.
// java allows us to access the data from class. But accessing data directly from the class(V and M)  get and set is not a good practise.