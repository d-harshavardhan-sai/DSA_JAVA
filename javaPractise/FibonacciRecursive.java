package javaPractise;

public class FibonacciRecursive {
	public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    public static void main(String[] args) {
        System.out.println("Recursive Fibonacci: " + fibonacciRecursive(10)); 
    }
}
