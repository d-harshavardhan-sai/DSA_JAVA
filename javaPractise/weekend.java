package javaPractise;

import java.util.Scanner;

public class weekend {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the day of the week: ");   // day.equalsIgnoreCase() method is a string method
    String day = scanner.nextLine();

    if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday") || day.equalsIgnoreCase("friday")) {
      System.out.println("Uff, It's a weekday");
    } else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
      System.out.println("Yayy, It's a weekend");
    } else {
      System.out.println("Invalid day of the week");
    }
    scanner.close();
  }
}

