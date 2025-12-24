package com.harshavardhan.Sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {5, -1, 8, 0, 0, 6};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	static void quickSort(int[] arr, int l, int r) {
		if(l<r) {
			int pi = partition(arr,l,r);
			quickSort(arr,l,pi-1);
			quickSort(arr,pi+1,r);
		}
	}
	static int partition(int[] arr, int l, int r) {
		int randomIdx = l+(int)Math.random()*(l-r+1);
		int temp = arr[randomIdx];
		arr[randomIdx]=arr[r];
		arr[r]=temp;
		int pivot = arr[r];
		int i=l-1;
		for(int j=l; j<r; j++) {
			if(arr[j]<pivot) {
				i++;
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		temp = arr[i+1];
		arr[i+1]=arr[r];
		arr[r]=temp;
		return i+1;
	}

}

/*
 * Quick Sort Algorithm
 * Divide and Conquer
 * Working of Quick Sort:
 * -Choose a pivot element.
 * -Partition the array such that:
 * -Elements < pivot are on the left
 * -Elements > pivot are on the right
 * -Recursively apply the above steps to sub-arrays on both sides of the pivot.
 * In-place sorting → Does not require extra arrays
 * Stable Sort? No (relative order of equal elements may not be preserved)
 * 
 * Advantages:
 * Faster in practice than Merge Sort for small and medium arrays
 * In-place sorting (no extra space required)
 * Cache-friendly due to sequential memory access
 * Suitable for large datasets in RAM
 * 
 * Disadvantages:
 * Not stable (unless modified)
 * Worst-case time complexity is O(n²)
 * Not ideal for linked lists due to poor random access
 *
 * 
 * 
 * Time Complexity
 * ->O(n log(n)) worst case(reverse sorted array)
 * ->Ω(n log(n)) average case(normal array)
 * ->Θ(n log(n)) best case(sorted array)
 * 
 * Space Complexity --- O(n logn) auxiliary stack space due to recursion
 * 
 * Recurrence Relation:
 * -Worst-case: T(n) = T(n-1) + T(0) + Θ(n) = T(n-1) + n → O(n²)
 * -Best/Avg:   T(n) = 2T(n/2) + Θ(n) = O(n log n)
 * */