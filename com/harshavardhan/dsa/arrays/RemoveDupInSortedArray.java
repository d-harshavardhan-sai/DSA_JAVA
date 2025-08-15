package com.harshavardhan.dsa.arrays;

public class RemoveDupInSortedArray {
	static int removeDupInSortedBrute(int[] arr, int n){  //TC-> O(n*1+n) SC->O(n)
        HashSet<Integer> hs = new HashSet<>();
        for(int ele:arr){
            hs.add(ele);   //TC->O(1)
        }
        int i=0;
        for(int ele:hs){
            arr[i]=ele;
            i++;
        }
        return i;
    }
    static int removeDupInSortedOptimal(int[] arr, int n){ //TC-> O(n) SC->O(1)
        int i=0;
        for(int j=1; j<n; j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
	public static void main(String[] args) {
	    int[] arr = {1,1,2,2,3,3};
	    int n = arr.length;
	   System.out.println(removeDupInSortedOptimal(arr,n));
	}
}
