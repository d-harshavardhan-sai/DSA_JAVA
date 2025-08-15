package com.harshavardhan.dsa.arrays;

public class MaxEle {

	public static void main(String[] args) {
		int[] arr = {2,1,4,5,5,0,-1,2};
	    int n = arr.length;
	   // Arrays.sort(arr);            TC-> O(nlogn) SC->O(1)
	   // System.out.println(arr[n-1]);
	   int max = Integer.MIN_VALUE;
	   for(int i=0; i<n; i++) if(arr[i]>max) max=arr[i];   //TC-> O(n) SC->O(1)
	   System.out.println(max);

	}

}
