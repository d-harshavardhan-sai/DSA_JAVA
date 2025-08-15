package com.harshavardhan.Strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String name = "harsha vardhan sai divvala";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.toLowerCase());
		System.out.println(name);
		System.out.println(name.indexOf('a'));
		System.out.println("     harsha   ".strip());
		System.out.println(Arrays.toString(name.split(" ")));

	}

}
