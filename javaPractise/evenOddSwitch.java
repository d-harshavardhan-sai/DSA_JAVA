package javaPractise;

import java.util.Scanner;

public class evenOddSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scanner.nextInt();
		switch (num % 2) {
		case 0:
			System.out.printf("number %d is Even", num);
			break;
		case 1:
			System.out.printf("number %d is Odd", num);
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		scanner.close();

	}

}
