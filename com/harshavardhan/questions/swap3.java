package com.harshavardhan.questions;

public class swap3 {
	//xor approach
	public static void swapTwoNumbers(int a, int b) {
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		swapTwoNumbers(5,4);
	}

}
