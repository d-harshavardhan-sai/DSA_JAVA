package javaPractise;

public class FactorialIterative {

	public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}

