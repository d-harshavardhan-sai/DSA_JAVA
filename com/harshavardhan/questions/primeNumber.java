package com.harshavardhan.questions;
import java.util.*;
public class primeNumber {
	//Brute force method
	static boolean isPrime(int n) {
		if(n<=1)  return false;
		for(int i = 2; i<n; i++) {  //for improved code n to =n/2   // for optimized method code n to =Math.sqrt(n)
			if(n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be checked prime: ");
		int num = sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println("Entered number is a prime");
		}
		else {
			System.out.println("Entered number is not a prime");
		}
	}
		 

}
