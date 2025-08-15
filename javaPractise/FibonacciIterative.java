package javaPractise;

public class FibonacciIterative {
	public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println("Iterative Fibonacci: " + fibonacciIterative(10)); 
    }
}
