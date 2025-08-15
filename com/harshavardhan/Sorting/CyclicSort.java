package com.harshavardhan.Sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		int[] arr1 = {5,3,4,1,2};
		cyclic(arr1);
		System.out.println(Arrays.toString(arr1));
	}
	static void cyclic(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correctIndex = arr[i]-1;
			if(arr[i]!=arr[correctIndex]) {
				swap(arr, i, correctIndex);
			}
			else {
				i++;
			}
		}
	}
	static void swap(int[] arr, int first, int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}
