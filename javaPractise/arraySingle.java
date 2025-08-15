package javaPractise;

public class arraySingle {

	public static void main(String[] args) {
		int i[] = {5,6,3,4,8};  //here java internally creates object for storing values with relative size
		int b[] = new int[] {3,4,5,6,7}; // also we can define
		int c[];
		c = new int[] {1,2,3,4,5};
		//c = {1,2,3,4,5}; we can't do like this, when we declare first and initialize next inn the next line
		int[] j;  // Preferred declaration
		Bank[] B; // for class also we can create array. Bank array. We are storing instances of Bank class into B variable. [] for multiple variables
		int[] k = new int[5]; // for specification of size of the array, object creation is mandatory
		// debug and mouse point out for seeing default values 0 for primitive, null for wrapper classes, false for boolean
		//array k size is 5. if array size is n, then index of last element = n -1
		System.out.println(k); // prints hash code address because its and object
		System.out.println(k[0]); // 0
		System.out.println(b.length);
		//insert values    // Accessing is done by using indexes only - slicing
		k[0] = 3;
		k[1] = 6;
		k[2] = 8;
		k[3] = 9;
		k[4] = 2;
		System.out.println(k[0]+k[1]+k[2]+k[3]+k[4]);
		/*
		 * System.out.println(k[5]); Exception in thread "main"
		 * java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		 * at javaPractise/javaPractise.arraySingle.main(arraySingle.java:26)
		 */

		// for retrieving all values at a time
		for (int a = 0; a < k.length; a++) {
			System.out.println(k[a]);
		}
		int a = 0;
		while (a < k.length) {
			System.out.println(k[a]);
			a++;
		}
	}

}
