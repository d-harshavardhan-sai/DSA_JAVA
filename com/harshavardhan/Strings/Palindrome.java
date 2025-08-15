package com.harshavardhan.Strings;

public class Palindrome {

	public static void main(String[] args) {
		String str1 = "amma";
		System.out.println(pal(str1));
	}
	static boolean pal(String str) {
		str = str.toLowerCase();
		if(str==null || str.length()==0) {
			return true;
		}
		for(int i=0; i<=str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
