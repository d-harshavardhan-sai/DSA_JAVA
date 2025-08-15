package com.harshavardhan.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr2 = {
				{23,34,54},
				{45,5,26},
				{76,87,98}
                		};
		int[] ans = search(arr2,26);
		System.out.println(Arrays.toString(ans));
		int min1 = min(arr2);
		System.out.println(min1);
	}
	
	static int[] search(int[][] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==target) {
					return new int[]{i, j};
				}
			}
		}
		return new int[]{-1, -1};
		
	}
	
	static int min(int[][] arr) {
		int mini = Integer.MAX_VALUE;
		for(int[] a : arr) {
			for(int element : a) {
				if(element<mini) {
					mini=element;
				}
			}
		}
		return mini;
	}

}
