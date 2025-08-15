package javaPractise;

import java.util.Scanner;

public class arithmeticOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value for oprnd1: ");
		double oprnd1 = scanner.nextDouble();
		System.out.println("Enter value for oprnd2: ");
		double oprnd2 = scanner.nextDouble();
		System.out.println("operator used opt(+, -, *, /): ");
		char opt = scanner.next().charAt(0);
		double result;
		if (opt == '+') {
			result = oprnd1 + oprnd2;
		}
		else if (opt == '-') {
			result = oprnd1 - oprnd2;
		}
		else if (opt == '*') {
			result = oprnd1 * oprnd2;
		}
		else if (opt == '/') {
			if (oprnd2 == 0) {
				System.err.println("Error, Division by zero");
				return;
			}
			result = oprnd1 / oprnd2;
		}
		else {
			System.out.println("Invalid Input operator");
			return;
		}
		scanner.close(); // If it is removed then no yellow line warning under return statement
	    System.out.printf("Result is %.2f", result); // Format output to 2 decimal places
	}

}
