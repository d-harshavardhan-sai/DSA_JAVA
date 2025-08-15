package javaPractise;

public class staticAndNonStatic3 {

	// Static and Non-Static blocks-used for variable initialization - same like constructor but
	// How it is different from constructor
    
	// entry point is main method but the out will be static block first and then main method
    // because static block is first executed and initialize memory internally 
	// static block is executed before the main method at the time of class loading in JVM.
	// static blocks of parent class execute first because the compiler loads parent class before child class.
	
	// for initializing static variables, we use static blocks
	// for initializing non-static blocks, we use constructors. But constructor creates non-static blocks internally while compiling the program execution

	int number;
	public staticAndNonStatic3() {           // constructor is non-static always
		System.out.println("constructor");   // constructor is not suitable for static fields. because static fields loads only once in the class while execution.
		number = 10;                         // And every time when the object is created, object instruction in the construction are executed. so we put that object instruction in the static block in order to save space
	}

	static {
		System.out.println("Static Block");
	}

	{
		System.out.println("Non-Static Block");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		staticAndNonStatic3 t1 = new staticAndNonStatic3();   // here firstly after creating object and running, firstly non-static block is called and then constructor. Because constructor creates non-static blocks internally while compiling the program execution
		System.out.println(t1.number);
	}
}
// So In this scenario, static block > main method > non-static block > constructor are executed
