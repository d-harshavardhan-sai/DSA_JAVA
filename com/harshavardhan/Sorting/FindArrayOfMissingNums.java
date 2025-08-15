package com.harshavardhan.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindArrayOfMissingNums {

	public static void main(String[] args) {
		int[] arr1 = {4,3,2,7,8,2,3,1};
		System.out.println(cyclic(arr1));
	}
	static List<Integer> cyclic(int[] arr){
		int i=0;
		while(i<arr.length) {
			int correctIndex = arr[i]-1;
			if(arr[i]!=arr[correctIndex]) {
				swap(arr, i, correctIndex);
			}
			else {
				i++;
			}
		}
		
		List<Integer> ans = new ArrayList<>();
		for(int index=0; index<arr.length; index++) {
			if(arr[index]!=index+1) {
				ans.add(index+1);
			}
		}
		return ans;
	}
	static void swap(int[] arr, int first, int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}
