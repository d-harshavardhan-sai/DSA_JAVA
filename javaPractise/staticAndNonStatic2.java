package javaPractise;

public class staticAndNonStatic2 {

	public static void main(String[] args) {
		//For static variables and method, if I want to access a static variable which is in different class-staticAndNonStatic1, we can just use the class name without creating object
		System.out.println(staticAndNonStatic1.number1); // prints 0 but not random numbers, because in staticAndNonStatic2 class we haven't run main method of staticAndNonStatic1 class. Since number is integer type, its default value 0 is printed.
		// accessing static method
		staticAndNonStatic1.print(); // no object creation is required
		// accessing non-static method
		staticAndNonStatic1 t1 = new staticAndNonStatic1(); // object is created
		t1.print1();
		
	}

}
