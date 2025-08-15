package com.harshavardhan.dsa.arrays;
import java.util.*;                                         //TC = O(nlogn)
public class ArraysBruteSecondLargest {                     //SC = O(n)
	
	static int SecondSmallest(int arr[], int n) {
		int code = -1;
		if(n<2) return code;
		Arrays.sort(arr);
		int smallest = arr[0];
		int secSmallest = -1;
		for(int i=0; i<n; i++) {
			if(arr[i]!=smallest) {
				secSmallest=arr[i];
				break;
			}
		}
		return secSmallest;
	}

	static int SecondLargest(int arr[], int n) {
		int code = -1;
		if(n<2) return code;
		Arrays.sort(arr);
		int largest = arr[arr.length-1];
		int secLargest = -1;
		for(int i=n-1; i>=0; i--) {
			if(arr[i]!=largest) {
				secLargest=arr[i];
				break;
			}
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
		int result1 = SecondLargest(arr1,n);
		if(result1 == -1) System.out.println("No second largest number present");
		else System.out.println("Second largest number is: "+result1);
		int result2 = SecondSmallest(arr1,n);
		if(result2 == -1) System.out.println("No second smallest number present");
		else System.out.println("Second smallest number is: "+result2);
		int code = SecondLargest(arr1,n);
		int code1 = SecondSmallest(arr1,n);
		if(code == -1) System.out.println("Not enough elements for caluculating second largest");
		if(code1 == -1) System.out.println("Not enough elements for caluculating second smallest");

	}

}
