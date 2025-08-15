package javaPractise;
import java.util.*;
public class gcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		int n1 = sc.nextInt();
		System.out.println("enter the second number:");
		int n2 = sc.nextInt();
		int gcd = 1;
		for(int i = n1;i<=n2;i++) {
			if(n1%i==0&&n2%i==0) {
				gcd = Math.max(gcd,i);
			}
		}
		System.out.println("gcd of "+" "+n1+" "+"and"+" "+n2+" "+"is"+" "+gcd);
	}

}
