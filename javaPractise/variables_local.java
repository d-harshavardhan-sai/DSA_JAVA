package javaPractise;

public class variables_local {

	public static void main(String[] args) {
		String local = "vizag"; // can be accessed in same method, which it is created. By default it is a non-static variable. there is no conceptof discussing about statuc and non-static keyword in local variables
		System.out.println(local);
		test1();
	}
    public static void test1() {
    	//System.out.println(local); //It cannot access the local variable
    }
}
