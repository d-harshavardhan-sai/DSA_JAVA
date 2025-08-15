package com.harshavardhan.questions;
import java.util.*;
public class addNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		
		for(int i = 0; i<n; i++) {
			System.out.println("Enter " +"number"+(i+1)+": ");
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("sum of "+n+" numbers is:"+sum);
		
		System.out.println("Enter the value of p: ");
		int p = sc.nextInt();
		int sm = 0;
		
		for(int i=0; i<p; i++) {
			System.out.println("Enter number"+(i+1)+": ");
			int num = sc.nextInt();
			sm+=num;
		}
		System.out.println("sum of "+p+" numbers is: "+sm);

	}

}
