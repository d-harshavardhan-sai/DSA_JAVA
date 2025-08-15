package com.harshavardhan.questions;

public class swap2 {
	//without using extra variable
	public static void swapTwoNumbers(int a, int b) {
		a = a-b;
		b = a+b;
		a = b-a;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		swapTwoNumbers(3,4);
	}

}
