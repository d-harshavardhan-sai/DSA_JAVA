package com.harshavardhan.DP;

import java.util.Arrays;

public class Fibonacci {
	//recursion TC=O(2^n) and SC=O(n) (recursion stack)
	static int fib(int n) {
		if(n<=1) return 1;
		return fib(n-1)+fib(n-2);
	}
	
	//memorization(Top-Down) dp array recursion TC=O(n) and SC=O(n)+O(n) (recursion stack + array space)
	static int fibM(int n, int[] dp) {
		if(n<=1) return dp[n]=1;
		if(dp[n]!=-1) return dp[n];
		return dp[n]=fibM(n-1,dp)+fibM(n-2,dp);
	}
	
	//tabulation(Bottom-up) do array iterative TC=O(n) and SC=O(n) (array space only)
	static int[] fibT(int n) {
		int[] dpT = new int[n+2];
		dpT[0]=1;
		dpT[1]=1;
		for(int i=2; i<=n; i++) {
			dpT[i]=dpT[i-1]+dpT[i-2];
		}
		return dpT;
	}
	
	//Space Optimized only using 3 variables current, prev1, prev2 TC=O(n) and SC=O(1) (variables current, prev1, prev2)
	static int fibSO(int n) {
		if(n<=1) return 1;
		int current=0, prev1=1, prev2=1;
		for(int i=2; i<=n; i++) {
			current = prev1+prev2;
			prev2=prev1;
			prev1=current;
		}
		return current;
	}
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println(fib(n));
		
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(fibM(n,dp));
		System.out.println(Arrays.toString(dp));
		
		System.out.println(Arrays.toString(fibT(n)));
		
		System.out.println(fibSO(n));
	}

}
