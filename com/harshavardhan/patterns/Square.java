package com.harshavardhan.patterns;
import java.util.*;
public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=n; j++) {
//				if((i*j)<10) System.out.print("0");
				System.out.print((i+j)-1 + " "); //(i*j)
			}
			System.out.println();
		}

	}

}
