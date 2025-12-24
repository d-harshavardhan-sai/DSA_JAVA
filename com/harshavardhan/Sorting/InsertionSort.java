package com.harshavardhan.Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5,-1,8,0,0,6};
//		insertionSort(arr);
		insertionSortRev(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	static void insertionSortRev(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
}

/*
 * Insertion Sort
 * ->Comparision based 
 * ->Divides array into 2 parts, sorted and unsorted.
 * ->Similar to playing cards. You split the cards into sorted group and unsorted group,and picks the card from unsorted group and put it in the right place in the sorted group.
 * ->Simple and easy to implement.
 * ->Stable sorting algorithm.
 * ->Efficient for small lists and nearly sorted lists.
 * ->the number of inversions is directly proportional to number of swaps. For example, no swapping happens for a sorted array and it takes O(n) time only. --- Adoptive
 * ->inplace
 * ->stable
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
 * ->Insertion Sort has maximum comparisons and shifts in the worst case, when the array is reverse sorted.
 * ->It is better than Bubble Sort in most practical cases but worse than Selection Sort in terms of number of swaps.
 * */

