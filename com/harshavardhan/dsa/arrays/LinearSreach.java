package com.harshavardhan.dsa.arrays;

public class LinearSreach {

	static int LS(int[] arr, int tar) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==tar) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {2,3,1,23,4,4,5,50,6,6,6,0,0,9};
		int tar = 4;
		System.out.println(LS(arr,tar));
	}

}
