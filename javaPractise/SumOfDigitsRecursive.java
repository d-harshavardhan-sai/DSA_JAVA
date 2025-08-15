package javaPractise;

public class SumOfDigitsRecursive {
	public static int sumOfDigitsRecursive(int n) {
        if (n == 0) return 0;
        return n % 10 + sumOfDigitsRecursive(n / 10);
    }
    public static void main(String[] args) {
        System.out.println("Recursive Sum of Digits: " + sumOfDigitsRecursive(1234)); 
    }
}
