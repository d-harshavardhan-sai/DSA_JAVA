package javaPractise;

import java.util.Scanner;

public class switchWeek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day: ");
		String day = scanner.nextLine().toLowerCase();
		
		switch (day) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
		     System.out.println("Uhh, It's a weekday");
			break;
		case "sunday":
		case "saturday":
			 System.out.println("Yayy, It;s a weekend");
			 break;                                           // if we don't write break it will execute next comand line
		default:
			 System.out.println("Invalid Input");
			break;
		}
		scanner.close();
	}

}
