package com.harshavardhan.questions;

public class Swap1 {
	//using extra variable temp
	public static void swapTwoNumbers(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		swapTwoNumbers(1, 2);
		
		
	}

}
