package com.harshavardhan.LinearSearch;

public class NoOfEvenDigitsNumbers {

	public static void main(String[] args) {
		int[] arr1 = {123, 34, 567, 35, 67};
		int ans = findNumbers(arr1);
		System.out.println(ans);
		System.out.println(countDigits1(0));
	}
	
	static int countDigits1(int num) {
		if(num<0) {
			num=num*-1;
		}
		if(num==0) {
			return 1;
		}
		return (int)(Math.log10(num))+1;
	}
	static int findNumbers(int[] arr) {
		int count=0;
		for(int num : arr) {
			if(even(num)) count++;
		}
		return count;
	}

	static boolean even(int num) {
		int numberOfDigits=countDigits(num);
//		if(numberOfDigits%2==0) {
//			return true;
//		}
//		return false;
		return numberOfDigits%2==0;
	}
	static int countDigits(int num) {
		if(num<0) {
			num=num*-1;
		}
		if(num==0) {
			return 1;
		}
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}
}
