package com.harshavardhan.Sorting;

import java.util.Arrays;

public class BubbleSort {
	static void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			boolean flag = false;
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(!flag) return;
			System.out.println(Arrays.toString(arr));
		}
	}
	static void bubbleSortRev(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			boolean flag = false;
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(!flag) return;
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void main(String[] harsha) {
		int[] arr = {-30,20,-5,6,1,40,0,0,-2};
		System.out.println(Arrays.toString(arr));
		System.out.println();
//		bubbleSort(arr);
		bubbleSortRev(arr);
		System.out.println(Arrays.toString(arr));
	}
}

/*Bubble sort algorithm 
 * ->For small size Lists
 * ->Comparision based
 * ->Compares adjacent elements and swaps
 * ->one nested loop, outer loop i and inner loop j
 * ->for every outer ith pass, i no of elements with be in their sorted position
 * ->for 1st outer ith pass, largest element will be bubbled up to last position, then second pass-second largest will be bubbled up
 * ->Optimised using boolean flag variable --- Adoptive
 * ->inplace
 * ->stable
 * 
 * Disadvantages
 * ->Inefficient for large sized Lists
 * ->Poor performance than other soting algos like quick and merge..
 * 
 * Time Complexity
 * ->O(N^2) worst case(reverse sorted array)
 * ->Ω(N^2) average case(normal array)
 * ->Θ(N) best case(sorted array)
 * 
 * Space Complexity --- O(1) inplace algorithm, No extra space needed
 * 
 * 
 * ->total no of comparisions -> n(n-1)/2
 * ->total no of swaps -> n(n-1)/2
 * ->The maximum number of swaps occurs when the array is strictly decreasing in nature.
 * */
