package com.harshavardhan.dsa.arrays;

import java.util.Arrays;

public class Arrayss {

	public static void main(String[] args) {
		int[] arr1 = {4,2,7,8,9};
		int[] arr2 = {4,2,7,8,9};  
		
		int[] arr3 = arr1.clone(); //Clone arr1 to arr2 to keep the arrays identical
		Arrays.parallelSort(arr1);  //FOR LARGER ARRAYS IT IS FASTER
		Arrays.sort(arr2);          //FOR SMALLER ARRAYS IT IS FASTER
		System.out.println(arr1);
		System.out.println(arr2);
	}

}
