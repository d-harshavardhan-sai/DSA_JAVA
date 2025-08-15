package javaPractise;

public class staticAndNonStatic4 {


		// constructor is not suitable for static fields. because static fields loads only once in the class while execution.
		// And every time when the object is created, object instruction in the construction are executed. so we put that object instruction in the static block in order to save space because static class is loaded only one time in the entire program execution
	    // we have n no of static blocks, no duplication and executed according to order
		
		static int number;
		
		static {
			System.out.println("static block");
			number = 10;
		}
		
		{
			System.out.println("non-static block");
		}
		
		public staticAndNonStatic4() {
			System.out.println("constructor");
		}
		
		public static void main(String[] args) {
			System.out.println("main method");
			staticAndNonStatic4 t1 = new staticAndNonStatic4();
			staticAndNonStatic4 t2 = new staticAndNonStatic4();
			staticAndNonStatic4 t3 = new staticAndNonStatic4();
			staticAndNonStatic4 t4 = new staticAndNonStatic4();
			staticAndNonStatic4 t5 = new staticAndNonStatic4();
	}

}
