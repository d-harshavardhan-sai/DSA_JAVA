package com.harshavardhan.PojoJavaBean;

public class Program1 {
	
	public static void main(String[] args) {
//		Employee e = new Employee();
//		e.setID(101);
//		e.name = "harsha";
//		e.salary = 7777.7;
//		
//		System.out.println(e.getID());
//		System.out.println(e.name);
//		System.out.println(e.salary);
		
		Employee e1 = new Employee();
		e1.setID(101);
		e1.name = "harsha";
		e1.salary = 7777.7;
		
		Employee e2 = new Employee();
		e2.setID(102);
		e2.name = "naveen";
		e2.salary = 999999.7;
		
		Employee e3 = new Employee();
		e3.setID(103);
		e3.name = "sai";
		e3.salary = 9999888.7;
		
		Employee[] employees = new Employee[] {e1, e2, e3};
		
		
		
	}
}
