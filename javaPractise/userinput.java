package javaPractise;

import java.util.Scanner;  // this package is imported in order to use Scanner class

public class userinput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // system.in refers input stream
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.printf("Hey %s, How are you? \n", name);
		String status = scanner.nextLine();
		System.out.println("What is your age?");
		int age = scanner.nextInt();
		System.out.println("Thankyou for the information");
		scanner.close();  // in order to prevent source/memory leakage
	}

}
