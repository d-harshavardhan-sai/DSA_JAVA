package com.harshavardhan.BinarySearch;
import java.util.*;
public class Ceiling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int find = sc.nextInt();
		System.out.println(ceiling(arr1, find));
		sc.close();
	}

	static int ceiling(int[] arr, int target) {
		if(target>arr[arr.length-1]) {
			return -1;
		}
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
	
	return s;
}
}
