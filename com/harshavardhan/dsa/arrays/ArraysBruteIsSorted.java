package com.harshavardhan.dsa.arrays;
import java.util.*;

public class ArraysBruteIsSorted {



	static boolean isSorted(int arr[], int n){
		for(int i=1; i<n; i++){
			if(arr[i]<arr[i-1]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the values in the array: ");
		int[] arr1 = new int[n];
		for(int i=0; i<n; i++){
			arr1[i]=sc.nextInt();
		}

		System.out.println("The array sorted is: "+isSorted(arr1,n));
	}
}

