package javaPractise;

import java.util.Scanner;

public class arithmeticOperatorSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter value for oprnd1: ");
		double operand1 = scanner.nextDouble();

		System.out.println("Enter value for oprnd2: ");
		double operand2 = scanner.nextDouble();

		System.out.println("operator used opt(+, -, *, /): ");
		char operator = scanner.next().charAt(0);

		double result;
		switch (operator) {
		case '+':
			result = operand1 + operand2;
			break;
		case '-':
			result = operand1 - operand2;
			break;
		case '*':
			result = operand1 * operand2;
			break;
		case '/':
			if (operand2 == 0) {
				System.err.println("Error, Division by zero");
				return;
			}
			result = operand1 / operand2;
			break;
		default:
			System.out.println("Invalid Input operator");
			return;
		}

		scanner.close();
		System.out.printf("Result is %.2f", result); // Format output to 2 decimal places
	}
}

