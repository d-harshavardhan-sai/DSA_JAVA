package com.harshavardhan.BinarySearch;
public class SmallLetterFlooringWrap {

	public static void main(String[] args) {
		char[] arr1 = {'h','j','k','l'};
		System.out.println(ceiling(arr1, 'i'));
	}

	static char ceiling(char[] arr, int target) {
		
		//start
		int s=0;
		//end
		int e=arr.length-1;
		while(s<=e) {
			//mid
			int mid=s+(e-s)/2;
			//right search;
			if(arr[mid]<target) s=mid+1;
			//left search
			else e=mid-1;
		}
	
	return arr[s%arr.length];   //wrap arround letter
}
}
