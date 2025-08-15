package com.harshavardhan.BinarySearch;
import java.util.*;
public class FindTargetAscending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//take only sorted array and of order ascending
		int[] arr1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int find = sc.nextInt();
		System.out.println(binarySearch(arr1, find));
		sc.close();
	}
	
	static int binarySearch(int[] arr, int target) {
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
			else if(arr[mid]>target) e=mid-1;
			else return mid;
		}
		return -1;
	}

}
