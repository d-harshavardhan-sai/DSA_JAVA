package com.harshavardhan.dsa.arrays;
import java.util.*;

public class MoveAllZerosToEnd {
	static void moveAllZerosToEnd(int[] arr, int n){  //TC->O(N) + O(X) + O(N-X) ~ O(2*N) SC->O(N)
        ArrayList<Integer> nonZeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                nonZeros.add(arr[i]);
            }
        }

        for (int i = 0; i < nonZeros.size(); i++) {
            arr[i] = nonZeros.get(i);
        }

        for (int i = nonZeros.size(); i < n; i++) {
            arr[i] = 0;
        }
    }
    
    static void moveAllZerosToEndOptimal(int[] arr, int n){
        int nonZeroIdx = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIdx] = arr[i];
                nonZeroIdx++;
            }
        }

        for (int i = nonZeroIdx; i < n; i++) {
            arr[i] = 0;
        }
    }
	public static void main(String[] args) {
	    int[] arr = {1,0,2,3,2,0,0,4,5,1};
	    int n = arr.length;
	    moveAllZerosToEnd(arr, n);
	   //moveAllZerosToEndOptimal(arr,n);
	    System.out.println(Arrays.toString(arr));
	}
}
