package javaPractise;

public class variables_static {
	String name = "harsha"; //instance variable
	static int s = 20;  //static/class variable is also created in class, not in method. I can be directly accessed with/without creating any instance.
	public static void main(String[] args) {
		System.out.println(new variables_static().name); //another method for creating an instance and accessing.
		System.out.println(s);
		test1();
	}
	public static void test1() {
		System.out.println(s);
	}
}
