package com.harshavardhan.LinearSearch;

public class FindMinValue {

	public static void main(String[] args) {
		int[] arr1 = {23,345,11,234,55,34};
		int ans = min(arr1);
		System.out.println(ans);
	}
	
	static int min(int arr[]) {
		int min=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

}
