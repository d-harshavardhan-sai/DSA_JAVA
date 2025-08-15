package com.harshavardhan.dsa.arrays;
import java.util.*;
public class ArrayLargestBruteForce {

	static int sort(int arr[]) {
		Arrays.sort(arr);            //TC - O(nlogn)  n is size of the array
		return arr[arr.length -1];   //SC - O(1)  
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter array elements: ");
		int[] Arr1 = new int[n];
		for(int i=0; i<n; i++) {
			Arr1[i] = sc.nextInt();
		}
		System.out.println("Largest Number in the array is: "+sort(Arr1));
	}

}
//space complexity is O(n)
