package javaPractise;

import java.util.Scanner;

public class ControlStatements1 {                // If and else

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = scanner.nextInt();
		if (age > 18) {
			System.out.println("You are major");
		}
		else {
			System.out.println("You are minor");
		}
        scanner.close();
	}

}
