package com.harshavardhan.Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr1 = {3,1,4,2,5};
		bubble(arr1);
		System.out.println(Arrays.toString(arr1));
	}
	static void bubble(int[] arr) {
		boolean swapped;                             //for 1,2,3,4,5 no swapping used. so I used boolean to check swapping criteria
		for(int i=0; i<arr.length; i++) {
			swapped = false;
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}
}
