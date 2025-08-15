package com.harshavardhan.dsa.arrays;
import java.util.*;                                               //TC - O(n)
public class ArrayRecursiveLargest {                              //SC - O(n)
	
	static int largestNumber(int arr[],int n) {
		int largest = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]>largest) largest=arr[i];
		}
		return largest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array: ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Enter the values in the array: ");
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Largest Number in the array is: "+largestNumber(arr1,n));
	}

}
