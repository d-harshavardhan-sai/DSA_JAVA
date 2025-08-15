package com.harshavardhan.patterns;

public class numLeft {

	public static void main(String[] args) {
		//type1
//		1
//		12
//		123
//		1234
//		12345
		System.out.println("---type1");
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		//type2
//		1
//		22
//		333
//		4444
//		55555
		System.out.println("---type2");
		n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		//type3
//		 1 
//		 2  3 
//		 4  5  6 
//		 7  8  9 10 
//		11 12 13 14 15 
		System.out.println("---type3");
		n=5;
		int count=0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				count=count+1;
				if(count<10) {
				System.out.print(" "+count+" ");	
				}
				else {
					System.out.print(count+" ");
				}
			}
			System.out.println();
		}
		//type4
//		1 
//		2 1 
//		3 2 1 
//		4 3 2 1 
//		5 4 3 2 1 
		System.out.println("---type4");
		n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//type5
//		1 
//		2 1 
//		3 2 1 
//		4 3 2 1 
//		5 4 3 2 1 
		System.out.println("---type5");
		n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
