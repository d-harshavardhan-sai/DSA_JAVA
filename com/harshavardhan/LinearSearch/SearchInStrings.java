package com.harshavardhan.LinearSearch;

import java.util.Arrays;

public class SearchInStrings {

	public static void main(String[] args) {
		String str1 = "harsha";
//		System.out.println(Arrays.toString(str1.toCharArray()));
		char find = 'o';
		boolean ans = linearSearch(str1, find);
		System.out.println(ans);
		boolean ans1 = linearSearch1(str1, find);
		System.out.println(ans1);
	}
	
	static boolean linearSearch(String str, char target) {
		if(str.length()==0) {
			return false;
		}
		for(int index=0; index<str.length(); index++) { //making string to charArray like [h, a, r, s, h, a]
			if(target==str.charAt(index)) {
				return true;
			}
		}
		return false;
	}
	
	static boolean linearSearch1(String str, char target) {
		if(str.length()==0) {
			return false;
		}
		for(char ch : str.toCharArray()) {  
			if(ch==target) {
				return true;
			}
		}
		return false;
	}
	

}
