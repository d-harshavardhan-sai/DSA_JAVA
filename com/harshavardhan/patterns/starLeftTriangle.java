package com.harshavardhan.patterns;

public class starLeftTriangle {

	public static void main(String[] args) {


		//square
		System.out.println("Square");
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("increasing triangle");
		//increasing triangle
		n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("decreasing triangle");
		//decreasing triangle
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("right side triangle1");
		//right side triangle1
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
		System.out.println("right side triangle2");
		//right side triangle2
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Hill pattern");
		//Hill pattern
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<i; j++) {
				System.out.print("* ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("reverse hill");
		//reverse triangle
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<n; j++) {
				System.out.print("* ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("diamond pattern");
		//diamond pattern
		n=5;
		for(int i=1; i<n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<i; j++) {
				System.out.print("* ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<n; j++) {
				System.out.print("* ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("pyramid");
		//pyramid
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("reverse pyramid");
		//reverse pyramid
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Sand glass");
		//sand glass
		n=5;
		for(int i=1; i<n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("diamond pyramid");
		//diamond pyramid
		n=5;
		for(int i=1; i<n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("double hill");
		//double hill
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			for(int j=i; j<n; j++) {
				System.out.print("  ");  //add extra space of double hill
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("left pascals triangle");
		//left pascals's triangle
		n=5;
		for(int i=1; i<n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("right pascal's triangle");
		//right pascal's triangle
		n=5;
		for(int i=1; i<n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Hallow Square");
		//Hallow Square
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==n || j==n || i==1 || j==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("Hallow Rectangle");
		//Hallow Rectangle
		n=5;
		int m=6;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(i==1 || j==1 || i==n || j==m) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("Hallow Triangle");
		//Hallow Triangle
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==n || j==1 || i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1 || j==1 || i==n || j==n || i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if((i==1 && j==3) || (i==2 && j==2) || (i==3 && j==1) || (i==4 && j==2) || (i==5 && j==3) || (i==4 && j==4) || (i==3 && j==5) || (i==2 && j==4)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//
		n=7;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if((i==1 && j==4) || (i==2 && j==3) || (i==2 && j==5) || (i==3 && j==2) || (i==3 && j==6) || (i==4 && j==1) || (i==4 && j==7) || (i==5 && j==2) || (i==5 && j==6) || (i==6 && j==3) || (i==6 && j==5) || (i==7 && j==4)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1 || j==1 || i==n || j==n || i==j || (i==2 && j==4) || (i==4 && j==2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j==1 || (i==1 && j==2) || (i==1 && j==3) || (i==3 && j==2) || (i==3 && j==3) || (i==2 && j==3)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//
		n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j==3 || j==5 || i==3 || (i==1 && j==1) || (i==1 && j==2) || (i==2 && j==1) || (i==2 && j==4) || (i==5 && j==1) || (i==5 && j==4) || (i==4 && j==2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//
		n=4;
		m=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(j==1 || j==2 || i==4 || (i==1 && j==3) || (i==3 && j==3) || (i==3 && j==4)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		n=7;
		m=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(j==1 || (i==3 && j==2) || (i==5 && j==2) || (i==2 && j==3) || (i==6 && j==3) || (i==1 && j==4) || (i==7 && j==4)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
