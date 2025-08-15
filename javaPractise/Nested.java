package javaPractise;

import java.util.Scanner;

public class Nested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is you name?");
		String name = scanner.nextLine();
		System.out.println("What is your score in technical round?");
		int score = scanner.nextInt();
		if (score > 40) {
			System.out.println("Congratulations, You have qualified technical round.\n Wait for the GD round");
			System.out.println("What is your score in GD round?");
			int gdScore = scanner.nextInt();
			if (gdScore > 60) {
				System.out.println("Congratulations, You have qualified GD round.\n Wait for thr HR round");
				System.out.println("What is your score in HR round?");
				int hrScore = scanner.nextInt();
				if (hrScore > 80) {
					System.out.printf("Congratulations, You have passed the HR round.\n Congrats! %s You got job",  name);
				}
				else {
					System.out.println("Better luck next time");
				}
			}
			else {
				System.out.println("Better luck next time");
			}
		}
		else 
			System.out.println("You can go to home.\n Try again next time.\n All the very best"); // without curly bracket for single line statement is valid.
		System.out.println("hai"); //if we try to right more than one indentation moves front 
		
        scanner.close();
	}

}
