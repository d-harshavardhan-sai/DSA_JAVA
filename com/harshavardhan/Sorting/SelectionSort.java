package com.harshavardhan.Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr1 = {3,4,2,5,1};
		selection(arr1);
		System.out.println(Arrays.toString(arr1));
	}
	static void selection(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int last = arr.length-i-1;
			int maxIndex = getMaxIndex(arr, 0, last);
			swap(arr, maxIndex, last);
		}
	}
	
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
	static int getMaxIndex(int[] arr, int start, int end) {
		int max = start;
		for(int i=start; i<end; i++) {
			if(arr[i]>arr[max]) {
				max = i;
			}
		}
		return max;
	}
}
