package com.harshavardhan.Recursion;

public class Number {

	public static void main(String[] args) {
//		System.out.println(1);
		print(1);

	}
	static void print(int n) {
		if(n==5) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		print(n+1);
	}

}
