package com.harshavardhan.questions;

public class reverseString {
	//without builtin
	public static void main(String[] args) {
		String str = "harsha";
		String temp = " ";
		char ch;
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			temp = ch + temp;
		}
		System.out.println(temp);
	}
}
