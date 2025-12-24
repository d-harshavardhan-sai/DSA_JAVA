package com.harshavardhan.Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5,-1,8,0,0,6};
		System.out.println(Arrays.toString(arr));
//		selectionSort(arr);
		selectionSortRev(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int minIdx=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[minIdx]) minIdx=j;
			}
			if(minIdx!=i) {
				int temp=arr[i];
				arr[i]=arr[minIdx];
				arr[minIdx]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	static void selectionSortRev(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int minIdx=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]>arr[minIdx]) minIdx=j;
			}
			if(minIdx!=i) {
				int temp = arr[i];
				arr[i]=arr[minIdx];
				arr[minIdx]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}


/*
 * Insertion Sort
 * ->Comparision based 
 * ->It divides the array into two parts: a sorted and an unsorted subarray.
 * ->It repeatedly selects the minimum (or maximum) element from the unsorted part and moves it to the end of the sorted part.
 * ->Simple and easy to implement.
 * ->Fewest number of swaps compared to bubble or insertion sort.
 * ->Efficient for small lists and nearly sorted lists.
 * ->Not adoptive->(Even if the array is already sorted, Selection Sort performs the same number of comparisons.) --- Adoptive
 * ->inplace
 * ->Not Stable Sorting Algorithm -> (it does'nt maintains the relative order of equal elements) Because equal elements may be swapped in a way that changes their original order.
 * 
 * Time Complexity
 * ->O(N^2) worst case(reverse sorted array)
 * ->Ω(N^2) average case(normal array)
 * ->Θ(N^2) best case(sorted array)
 * 
 * Space Complexity --- O(1) inplace algorithm, No extra space needed
 * 
 * 
 * ->total no of comparisions -> n(n-1)/2
 * ->total no of swaps -> n-1
 * ->The maximum number of swaps occurs when the array is strictly decreasing in nature.
 * ->Selection Sort minimizes the number of swaps (only n-1) even in the worst case, but makes maximum comparisons, same as bubble sort.
 * */

