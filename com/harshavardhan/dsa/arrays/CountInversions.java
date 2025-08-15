package com.harshavardhan.dsa.arrays;
import java.util.*;

public class CountInversions {
	static int mergeSort(int[] arr, int l, int r) {
	    int inversions=0;
		if(l<r) {
			int mid = l+(r-l)/2;
			inversions+=mergeSort(arr,l,mid);
			inversions+=mergeSort(arr,mid+1,r);
			inversions+=merge(arr,l,mid,r);
		}
		return inversions;
	}
	
	static int merge(int[] arr, int l, int mid, int r) {
	    int inversions=0;
		int n1=mid-l+1;
		int n2=r-mid;

		int[] left = new int[n1];
		int[] right = new int[n2];

		int i,j,k;
		for(i=0; i<n1; i++) left[i]=arr[l+i];
		for(j=0; j<n2; j++) right[j]=arr[mid+1+j];

		i=0;
		j=0;
		k=l;

		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) arr[k++]=left[i++];
			else{
			    arr[k++]=right[j++];
			    inversions+=(n1-i);
			    for(int x=i; x<n1; x++) System.out.println(left[x]+","+right[j-1]);
			}
		}

		while(i<n1) arr[k++]=left[i++];
		while(j<n2) arr[k++]=right[j++];
		return inversions;
	}
	public static void main(String[] args) {
		int[] a = {5,3,2,4,1};
		int[] arr = Arrays.copyOf(a,a.length);
		int n = arr.length;
		System.out.println(mergeSort(arr,0,n-1));
		System.out.println(Arrays.toString(a));
		// int c=0;
		// for(int i=0; i<n; i++){
		//     for(int j=i; j<n; j++){
		//         if(arr[i]>arr[j]){
		//             c++;
		//             System.out.println(arr[i]+","+arr[j]);
		//         }
		//     }
		// }
		// System.out.println(c);
		
		

	}

}
