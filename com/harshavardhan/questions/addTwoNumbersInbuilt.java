package com.harshavardhan.questions;
import java.util.*;
public class addTwoNumbersInbuilt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		//Inbuilt
		int sum = Integer.sum(a, b);
		System.out.println("sum of a and b is: "+sum);
	}

}
