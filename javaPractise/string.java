package javaPractise;

import java.util.Arrays;

public class string {

	public static void main(String[] args) {
		String s1 = "harsha";     //String is a class(fn+f3)
		String s2 = new String("harshavardhan"); // object is created for the String
		System.out.println(s1+s2); //concatenation +
		System.out.println(new string()); // here hash code is printed but in the above for string when object is created it doesn't gives hash code. So it is unique behavior and called as literal
		String s3 = "harshasai";             // String pool memory
		String s4 = new String("harshasai"); // Heap memory
		String s5 = new String("harshasai");
		System.out.println(s3 == s4); // both are not equal. Since s3 is created in String pool but in case of s4 it is stored in separate object memory(heap memory)
		System.out.println(s4 == s5); // both s4 and s5 stored in heap memory, but in separated chunks- address of both s4 and s5 are different
		System.out.println(s3.equals(s4)); // here by using equals() method, data comparison happens but not address but in the above cases address are verified
		System.out.println(s3.equals(s5));
		String s6 = "naveen";
		String s7 = "NAVEEN";
		String s8 = "Naveen";
		String s9 = " harsha vardhan sai divvala naveen sai ";
		System.out.println(s6.equalsIgnoreCase(s8)); // compares data and ignores case
		System.out.println(s1.contains("l")); // whether text is there in the string or not- middle, start and end also // case sensitive
		System.out.println(s6.startsWith("Na")); // compares String starts with // it is false since n is cap
		System.out.println(s7.endsWith("EN")); // compares String starts with  // case sensitive
		System.out.println(s9.length()); // prints no of characters
		System.out.println(s9.trim());
		System.out.println(s9.trim().length());
		System.out.println(s9.length());
		System.out.println(s7.toLowerCase()); // converts string to complete lower case
		System.out.println(s8.toUpperCase()); // converts string to complete upper case
		System.out.println(s9.toCharArray()); //  string converted to character array debug it to show 
		char[] a = s9.toCharArray();  // debug it to show [ , h, a, r, s, h, a,  , v, a, r, d, h, a, n,  , s, a, i,  , d, i, v, v, a, l, a,  , n, a, v, e, e, n,  , s, a, i,  ]
		System.out.println(a[0]);  // space
		System.out.println(s9.indexOf("a")); // return first occurrence index of string starting with 0
		System.out.println(s9.indexOf(8)); // prints -1 if not present
		System.out.println(s9.lastIndexOf("a")); // prints last occurrence index of
		System.out.println(s9.lastIndexOf(8));  // prints -1 if not present
		System.out.println(s9.substring(2)); // starts from index 2 to last index
		System.out.println(s9.substring(2, 5)); // starts from index 2 to index 5
		System.out.println(Arrays.toString(s9.split(" "))); // firstly import java.util.Arrays; package
		String s10 = "harsha^vardhan^sai";
		System.out.println(Arrays.toString(s10.split("\\^"))); //for special characters use \\
		//System.out.println(s10.charAt(-2)); // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -2
		System.out.println(s10.charAt(10)); // prints character at specified index
		System.out.println(s10.replace("^"," ")); // replaces character "^" with " "
		System.out.println(s10.replace("har", "rah"));
		
	}

}
