package com.harshavardhan.questions;
import java.util.*;
public class primeNumber1 {
	
	static boolean isPrime(int n) {
		if(n<=1) return false;
		if(n==2||n==3) return true;
		if(n%2==0||n%3==0) return false;
		for(int i = 5; i<=Math.sqrt(n); i++) 
			if(n%i==0||n%(i+2)==0) return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n to be checked as prime: ");
		int num = sc.nextInt();
		if(isPrime(num)) {
			System.out.println("given num is a prime");
		}
		else {
			System.out.println("given num is not a prime");
		}
	}

}
