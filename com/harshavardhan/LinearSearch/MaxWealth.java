package com.harshavardhan.LinearSearch;

//Input is a 2d arrays containing wealths of each bank account
// output is who is richest
public class MaxWealth {

	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3},{3,4,5},{2,1,5}};
		System.out.println(maxSumWealth(arr1));
	}

	 static int maxSumWealth(int[][] arr) {
		 int MaxSum=Integer.MIN_VALUE;
		 for(int person=0; person<arr.length; person++) {
			 int personSum=0;
			 for(int account=0; account<arr[person].length; account++) {
				 personSum+=arr[person][account];
			 }
			 if(personSum>MaxSum) MaxSum=personSum;
		 }
		return MaxSum;
	}

}
