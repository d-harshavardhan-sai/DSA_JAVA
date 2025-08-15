package javaPractise;

public class variables_parameter {

	public static void main(String[] args) {
		test1(70);
	}
	public static void test1(int height) { //paramters can be declared with in the method creation. It cannot be assigned values to it directly.public static void test1(int height=10) throws error
		System.out.println(height);
	}
}
