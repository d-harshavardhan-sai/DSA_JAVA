package com.harshavardhan.numbers;

public class numbers {

	public static void main(String[] args) {
		System.out.println("factors");
		//factors
		int n=8;
		for(int i=1; i<=n; i++) {
			if(n%i==0) System.out.println(i);
		}
		//prime number
		System.out.println("code-1");
		n=3;
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) count++;
		}
		if(count==2) System.out.println("prime");
		else System.out.println("Not a prime");
		//composite number
		System.out.println("code-2");
		n=-9;
	    count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) count++;
		}
		if(n>1 & count>2) System.out.println("composite");
		else System.out.println("Not composite");
		//perfect number - is equals to the sum of its divisors or factors except itself
		//abundant number - sum of its factors except itself is greater than the number itself
		//deficient number - sum of its factors  except itself is less than the number itself
		System.out.println("code-3");
		n=6; //n=6, n=21, n=12
		int sum=0;
		for(int i=1; i<n; i++) {
			if(n%i==0) sum=sum+i;
		}
		if(sum==n) System.out.println("perfect number");
		else if(sum>n) System.out.println("abundant number");
		else System.out.println("deficient number");
		//pronic number - is the product of two consecutive integers 
		System.out.println("code-4");
		int fact=0;
		n=56;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				if(i*(i+1)==n) fact=i;
			}
		}
		if(fact!=0) System.out.println("pronic number"+fact);
		else System.out.println("not pronic number");
	}

}
