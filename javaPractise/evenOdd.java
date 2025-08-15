package javaPractise;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number: ");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.printf("number %d is Even", number);
		}
		else {
			System.out.printf("number %d is Odd", number);
		}
		scanner.close();
	
	}

}
