package com.harshavardhan.Sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {5, -1, 8, 0, 0, 6};
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	static void mergeSort(int[] arr, int l, int r) {
		if(l>=r) return;
		int mid = l+(r-l)/2;
		mergeSort(arr,l,mid);
		mergeSort(arr,mid+1,r);
		merge(arr,l,mid,r);
	}
	static void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid-l+1;
		int n2 = r-mid;
		int[] left = new int[n1];
		int[] right = new int[n2];
		int i,j,k;
		for(i=0; i<n1; i++) left[i]=arr[i+l];
		for(j=0; j<n2; j++) right[j]=arr[j+mid+1];
		i=0;
		j=0;
		k=l;
		while(i<n1 && j<n2) {
			if(left[i]<right[j]) arr[k++]=left[i++];
			else arr[k++]=right[j++];
		}
		while(i<n1) arr[k++]=left[i++];
		while(j<n2) arr[k++]=right[j++];
	}
}

/*
 * Merge Sort Algorithm
 * ->Divide and Conquer
 * ->It works by recursively dividing the input array into two halves,
 * ->recursively sorting the two halves and finally merging them back together to obtain the sorted array.
 * ->Stable
 * Stable Sort: Maintains the relative order of equal elements.Useful when sorting records with multiple fields (e.g., name, then age).
 * Consistent Time Complexity: Always runs in O(n log n) time, regardless of input data order.No worst-case performance like Quick Sort's O(n²).
 * Efficient for Large Datasets: Particularly good for external sorting (e.g., sorting huge files stored on disk).
 * Well-suited for Linked Lists: Works efficiently without random access.Avoids the need for extra space as in arrays.
 * Divide and Conquer Approach: Easy to parallelize or use in multi-threaded systems.
 * It’s more efficient for linked lists than for arrays because insertion does not require shifting elements — just pointer updates.
 * Merge Sort is preferred for linked lists because it doesn’t require random access and can be implemented efficiently using pointer manipulation
 * 
 * Disadvantages
 * ->Not In-Place
 * ->Uses Extra space
 * ->Inefficient for smaller list
 * ->Unnecessary Merging Overhead: Even if the array is partially sorted, it still divides and merges all parts.
 * 
 * 
 * Time Complexity
 * ->O(n log(n)) worst case(reverse sorted array)
 * ->Ω(n log(n)) average case(normal array)
 * ->Θ(n log(n)) best case(sorted array)
 * 
 * Space Complexity --- O(N) Not an inplace Algorithm, requires additional memory(temporary arrays) for merging
 * 
 * Recurrance relation -> T(n) = 2T(n/2) + n
 * */