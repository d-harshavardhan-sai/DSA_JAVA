package javaPractise;

public class staticAndNonStatic5 {

	public static void main(String[] args) {
		new staticAndNonStatic5().print();

	}
	
	public void print() {
		main(null);  // static method in non-static method.
	}

}
// main method has static. therefore it has memory allocation
// but if any non-static method wants to call inside main method without creating object can throw error
// because main method memory allocation doesn't allow non-static methods because it has no memory allocated still
// so that is why we are creating instances for non-static methods
// so when we create object for non-static method and try to run it in main method it's memory is complete. 
// therefore it can run the program
// conclusion: non-static methods cannot called in static methods directly, but static methods can be called in non-static methods.
