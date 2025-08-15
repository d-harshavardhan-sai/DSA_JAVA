package com.harshavardhan.questions;

public class reverseString2 {
	//with builtin function
	public static void main(String[] args) {
		String input = "harshavardhan";
		StringBuilder rev = new StringBuilder();
		rev.append(input);
		rev.reverse();
		System.out.println(rev);
	
	}

}
