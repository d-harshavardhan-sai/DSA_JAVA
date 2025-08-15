package com.harshavardhan.dsa.arrays;
import java.util.*;

public class LeftRotateArray {
	static void leftRotateBy1Place(int[] arr, int n){  //TC-> O(n) SC->O(1)
        int temp=arr[0];
        for(int i=1; i<n; i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    static void leftRotateByDPlaces(int[] arr, int n, int d){ //TC-> O(n) SC->O(d)
        d=d%n;
        if (d == 0) return;
        int[] temp = new int[d];
        for(int i=0; i<d; i++) temp[i]=arr[i];
        for(int i=d; i<n; i++){
            arr[i-d]=arr[i];
        }
        int k=n-d;
        for(int i=0; i<d; i++) { 
            arr[k+i]=temp[i];
        }
    }
    static void reverse(int[] arr, int s, int e){
        while(s<e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    static void leftRotateByReverse(int[] arr, int n, int d){
        d = d % n; // Normalize d
        if (d == 0) return;
        reverse(arr, 0, d-1);
        reverse(arr,d,n-1);
        reverse(arr, 0, n-1);
    }
	public static void main(String[] args) {
	    int[] arr1 = {1,2,3,4,5};
	    int[] arr2 = {1,2,3,4,5};
	    int[] arr3 = {1,2,3,4,5,6,7,8,9};
	    int n1 = arr1.length;
	    int n2 = arr2.length;
	    int n3 = arr3.length;
	    leftRotateBy1Place(arr1,n1);
	    leftRotateByDPlaces(arr2,n2,3);
	    leftRotateByReverse(arr3,n3,4);
	    System.out.println(Arrays.toString(arr1));
	    System.out.println(Arrays.toString(arr2));
	    System.out.println(Arrays.toString(arr3));
	}
}
