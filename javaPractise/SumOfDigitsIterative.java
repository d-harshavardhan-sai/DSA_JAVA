package javaPractise;

public class SumOfDigitsIterative {
	public static int sumOfDigitsIterative(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Iterative Sum of Digits: " + sumOfDigitsIterative(1234));
    }
}
