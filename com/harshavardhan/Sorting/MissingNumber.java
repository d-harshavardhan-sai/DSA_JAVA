package com.harshavardhan.Sorting;

import java.util.Arrays;

public class MissingNumber {

	//Amazon
	//given an array in distinct range of [0,n] like [4,2,0,1]
	//output is 3 which is missing in sequence
	
	
	public static void main(String[] args) {
		int[] arr1 = {4,0,2,1};
		System.out.println(cyclic(arr1));
	}

	 static int cyclic(int[] arr) {
		 int i=0;
		 while(i<arr.length) {
			 int correctIndex = arr[i];
			 if(arr[i]<arr.length && arr[i]!=arr[correctIndex]) {
				 swap(arr, i, correctIndex);
			 }else {
				 i++;
			 }
		 }
		 for(int index=0; index<arr.length; index++) {
			 if(arr[index]!=index) {
				 return index;
			 }
		 }
		 return arr.length;
	}
	 static void swap(int[] arr, int first, int second) {
			int temp=arr[first];
			arr[first]=arr[second];
			arr[second]=temp;
		}

}
