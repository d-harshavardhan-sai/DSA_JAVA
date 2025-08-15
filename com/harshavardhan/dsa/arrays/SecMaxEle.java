package com.harshavardhan.dsa.arrays;

public class SecMaxEle {

	public static void main(String[] args) {
		int[] arr = {2,1,4,5,5,0,-1,2};
	    int n = arr.length;
	   // Arrays.sort(arr);              TC-> O(nlogn+n) SC->O(1)
	   // int max=arr[n-1];
	   // int smax=Integer.MIN_VALUE;
	   // for(int i=n-2; i>=0; i--){
	   //     if(arr[i]!=max){
	   //         smax=arr[i];
	   //         break;
	   //     }
	   // }
	   // System.out.println(smax);
	   
	   int max = Integer.MIN_VALUE;
	   int smax = Integer.MIN_VALUE;
	   //for(int i=0; i<n; i++){          TC-> O(2n) SC->O(1)
	   //    if(arr[i]>max) max=arr[i];
	   //}
	   //for(int i=0; i<n; i++){
	   //    if(arr[i]>smax && arr[i]!=max) smax=arr[i];
	   //}
	   //System.out.println(smax);
	   
	   
	   for(int i=0; i<n; i++){            //TC-> O(n) SC->O(1)
	       if(arr[i]>max){
	           smax=max;
	           max=arr[i];
	       }else if(arr[i]>smax && arr[i]!=max){
	           smax=arr[i];
	       }
	   }
	   System.out.println(smax);

	}

}
