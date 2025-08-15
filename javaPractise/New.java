package javaPractise;
import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Number: ");
        int value = In.nextInt();
        int onesDigit;
        int tensDigit;
        int hundredsDigit;

        String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        while (value != -1) {
            if (value < 20) {
                // Handle numbers from 0 to 19
                System.out.println("Result: " + ones[value]);
            } else if (value >= 20 && value < 100) {
                // Handle numbers from 20 to 99
                tensDigit = value / 10;
                onesDigit = value % 10;
                System.out.println("Result: " + tens[tensDigit] + (onesDigit != 0 ? " " + ones[onesDigit] : ""));
            } else if (value >= 100 && value < 1000) {
                // Handle numbers from 100 to 999
                hundredsDigit = value / 100;
                int remainder = value % 100;

                if (remainder < 20) {
                    System.out.println("Result: " + ones[hundredsDigit] + " hundred" + (remainder != 0 ? " and " + ones[remainder] : ""));
                } else {
                    tensDigit = remainder / 10;
                    onesDigit = remainder % 10;
                    System.out.println("Result: " + ones[hundredsDigit] + " hundred" + 
                        (remainder != 0 ? " and " + tens[tensDigit] + (onesDigit != 0 ? " " + ones[onesDigit] : "") : ""));
                }
            }
            // Prompt for the next input
            System.out.print("Number: ");
            value = In.nextInt();
        }
    }
}
