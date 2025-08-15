package javaPractise;

import java.util.Random; // for using Random() method

public class staticAndNonStatic1 {

	int number;  // non-static variable**
	static int number1;  // static variable**
	public static void main(String[] args) {
		//3 objects created and data is assigned to the variable number and data is printed,
		// At three places value generation is different, therefore three different numbers are printed
		// variable number is non-static. so 3 different numbers are printed.
		// Because, here class loader allocates memory in heap memory where each object has separate block

		staticAndNonStatic1 t1 = new staticAndNonStatic1();
		t1.number = new Random().nextInt(); // generates random values

		staticAndNonStatic1 t2 = new staticAndNonStatic1();
		t2.number = new Random().nextInt();

		staticAndNonStatic1 t3 = new staticAndNonStatic1();
		t3.number = new Random().nextInt();

		System.out.println(t1.number);
		System.out.println(t2.number);
		System.out.println(t3.number);

		//3 objects created and data is assigned to the variable number and data is printed,
		// At three places value generation is same, same number is printed
		// variable number is static. same number is printed.
		// Because, here class loader identifies that is created static field and stores it in Method area where memory allocation of all static variables and methods is of same class which they are created.
		// So only one copy of memory is created and shared to each object(shared memory-memory sharing).

        //The static field staticAndNonStatic1.number1 should be accessed in a static way
		staticAndNonStatic1 t4 = new staticAndNonStatic1(); t4.number1 = new
				Random().nextInt(); // generates random values

		staticAndNonStatic1 t5 = new staticAndNonStatic1(); t5.number1 = new
				Random().nextInt();

		staticAndNonStatic1 t6 = new staticAndNonStatic1(); t6.number1 = new
				Random().nextInt();

		System.out.println(t4.number1);
		System.out.println(t5.number1);
		System.out.println(t6.number1);

		staticAndNonStatic1.number1 = new Random().nextInt();   // no need to create object for static
		staticAndNonStatic1.number1 = new Random().nextInt();   // we directly access using class
		staticAndNonStatic1.number1 = new Random().nextInt();

		System.out.println(staticAndNonStatic1.number1);
		System.out.println(staticAndNonStatic1.number1);
		System.out.println(staticAndNonStatic1.number1);

	}

	// Static method-no object creation is required and directly we can access it using class name
	public static void print() {
		System.out.println("Static method");
	}
	
	//Non-Static method - object creation using this class is mandatory in order to access it in another class
	public void print1() {
		System.out.println("Non-Staic method");
	}
}
