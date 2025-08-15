package com.harshavardhan.dsa.arrays;
                                                               //TC - O(n)
import java.util.Scanner;                                      //SC - O(n)

public class ArraysBetterSecondLargest {
	
	static int secondLargest(int arr[], int n) {
		int largest = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i]>largest) largest = arr[i];
		}
		int secLargest = Integer.MIN_VALUE;                    //If any negative numbers are present in the array
		for(int i=0; i<n; i++) {
			if(arr[i]!=largest&& arr[i]>secLargest) secLargest = arr[i];
		}
		return secLargest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Enter the values in the array: ");
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		int result = secondLargest(arr1,n);
		if(result == -1) System.out.println("No second largest number present");
		else System.out.println("Second largest number is: "+result);

	}

}
