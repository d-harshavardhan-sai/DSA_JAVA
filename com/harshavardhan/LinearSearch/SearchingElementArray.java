package com.harshavardhan.LinearSearch;

import java.util.Iterator;

public class SearchingElementArray {

	public static void main(String[] args) {
		int[] arr1 = {12,34,45,56,78,89,90,1};
	    int ans = linearSearch(arr1, 100);
	    int ans1 = linearSearch1(arr1, 100);
	    boolean ans2 = linearSearch2(arr1, 100);
	    System.out.println(ans);
	    System.out.println(ans1);
	    System.out.println(ans2);
	}
	static int linearSearch(int[] arr, int target) {
		//array size is 0
		if(arr.length==0) {
			return -1;
		}
		
		//search if exists or not
		for(int index=0; index<arr.length; index++) {
			int element = arr[index];
			if(element==target) {
				return index;
			}
		}
		
		//this line is returned when none of the above statements are executed
		//hence the target not found
		return Integer.MAX_VALUE;
	}
	
	static int linearSearch1(int[] arr, int target) {
		
		if(arr.length==0) {
			return -1;
		}
		
		for(int element : arr) {
			if(element==target) {
				return element;
			}
		}
		
		return Integer.MAX_VALUE;
	}
	
	static boolean linearSearch2(int[] arr, int target) {
		
		if(arr.length==0) {
			return false;
		}
		
		for(int element : arr) {
			if(element==target) {
				return true;
			}
		}
		
		return false;
	}

}
