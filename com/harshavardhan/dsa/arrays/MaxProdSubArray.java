package com.harshavardhan.dsa.arrays;

public class MaxProdSubArray {

	public static void main(String[] args) {
		int[] arr = {2,1,-4,0,4,-2};
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		//O(n^3)
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				int prod=1;
//				for(int k=i; k<j; k++) {
//					prod*=arr[k];
//				}
//				max = Math.max(max,  prod);
//			}
//		}
		
		//O(n^2
//		for(int i=0; i<n; i++){
//		    int prod=1;
//		    for(int j=i; j<n; j++){
//		        prod*=arr[j];
//		        max = Math.max(prod,max);
//		    }
//		}
		
		//O(n)
		int pref=1;
		int suff=1;
		for(int i=0; i<n; i++) {
			if(pref==0) pref=1;
			if(suff==0) suff=1;
			pref*=arr[i];
			suff*=arr[n-i-1];
			max = Math.max(max, Math.max(pref,suff));
		}
		System.out.println(max);

	}

}
