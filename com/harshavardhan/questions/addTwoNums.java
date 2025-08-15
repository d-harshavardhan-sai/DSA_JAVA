package com.harshavardhan.questions;

public class addTwoNums {

	public int sum1(int a, int b) {
		return a+b;
	}
	
	public static int sum2(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		addTwoNums obj = new addTwoNums();
		int result1 = obj.sum1(12, 15);
		System.out.println(result1);
		
		//no need of object creation for static methods. since it allocates memory while declaring as static
		int result2 = sum2(12, 13);
		System.out.println(result2);
		
		
	}

}
