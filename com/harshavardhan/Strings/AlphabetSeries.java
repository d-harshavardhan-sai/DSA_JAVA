package com.harshavardhan.Strings;

public class AlphabetSeries {

	public static void main(String[] args) {
		String series = "";
		for(int i=0; i<26; i++) {
			char ch = (char)('a'+i);
			series+=ch;
			System.out.println(ch);
		}
		System.out.println(series);
	}

}
//TC = O(n^2)  because it creates multiple objects
//It is done with only one object in StringBuilder
//String is immutable and
//StringBuilder is mutable