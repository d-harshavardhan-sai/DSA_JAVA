package com.harshavardhan.dsa.arrays;
import java.util.*;
public class UnionSorted {
	static ArrayList<Integer> unionHM(int[] arr1, int[] arr2) {
		ArrayList<Integer> uni = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int ele:arr1) {
			hm.put(ele,hm.getOrDefault(ele,0)+1);
		}
		for(int ele:arr2) {
			hm.put(ele,hm.getOrDefault(ele,0)+1);
		}
		for(int ele:hm.keySet()) {
			uni.add(ele);
		}
		return uni;
	}
	static ArrayList<Integer> unionHS(int[] arr1, int[] arr2) {
		ArrayList<Integer> uni = new ArrayList<>();
		HashSet<Integer> hs = new HashSet<>();
		for(int ele:arr1) {
			hs.add(ele);
		}
		for(int ele:arr2) {
			hs.add(ele);
		}
		for(int ele:hs) {
			uni.add(ele);
		}
		return uni;
	}
	//Union for sorted Arrays only
	static ArrayList<Integer> union(int[] arr1, int[] arr2) {
		ArrayList<Integer> uni = new ArrayList<>();
		int i=0;
		int j=0;
		int n=arr1.length;
		int m=arr2.length;
		while(i<n && j<m) {
			if(arr1[i]<=arr2[j]) {
				if(uni.size()==0 || uni.get(uni.size()-1)!=arr1[i]) uni.add(arr1[i]);
				i++;
			} else {
				if(uni.size()==0 || uni.get(uni.size()-1)!=arr2[j]) uni.add(arr2[j]);
				j++;
			}
		}
		while(i<n) {
			if(uni.size() == 0 || uni.get(uni.size()-1) != arr1[i]) {
				uni.add(arr1[i]);
			}
			i++;
		}
		while(j<m) {
			if(uni.size() == 0 || uni.get(uni.size()-1) != arr2[j]) {
				uni.add(arr2[j]);
			}
			j++;
		}
		return uni;
	}
	public static void main(String[] args) {  //TC->O(m+n) SC->O(1)
		int[] arr1 = {1, 2, 2, 3, 5};
		int[] arr2 = {2, 3, 4, 5, 6};
		System.out.println(unionHM(arr1,arr2));
		System.out.println(unionHS(arr1,arr2));
		System.out.println(union(arr1,arr2));

	}
}
