package javaPractise;

/**
 * @apiNote print the prime numbers between 50 to 150
 */
public class loop4 {
    public static void main(String[] args) {
        int number = 50; // Start from 50

        System.out.println("Prime numbers between 50 and 150:");

        // Use a while loop to iterate from 50 to 150
        while (number <= 150) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
