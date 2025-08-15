package com.harshavardhan.dsa.arrays;

public class IsSorted {
	static boolean isSortBrute(int[] arr, int n){  //TC-> O(n^2) SC->O(1)
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[i]) return false;
            }
        }
        return true;
    }
    static boolean isSortOptimal(int[] arr, int n){ //TC-> O(n) SC->O(1)
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
	public static void main(String[] args) {
	    int[] arr = {2,1,4,5,5,0,-1,2};
	   //int[] arr = {-1,0,1,2,3,4};
	    int n = arr.length;
	   // System.out.println(isSortBrute(arr,n));
	   System.out.println(isSortOptimal(arr, n));
	   
	}
}
