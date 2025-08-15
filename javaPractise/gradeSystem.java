package javaPractise;

import java.util.Scanner;

public class gradeSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = scanner.nextInt();
		if (marks == 35) {
			System.out.println("Student is pass");
		}
		else if (marks > 35 && marks < 70) {
			System.out.println("Student secured third class");
		}
		else if (marks > 70 && marks < 85) {
			System.out.println("Student secured second class");
		}
		else if (marks > 85) {
			System.out.println("Student secured first class");
		}
		else {
			System.out.println("Student is fail");
		}
		scanner.close();
	}

}
