package javaPractise;

// For initializing value for the variables, specifying data type is mandatory.
// If I don't want to use data types, we can use the var key word instead it is called Type inference.
// Type Inference is a concept in which the compiler infers the type of the variable using the value provided.
// This is introduced in java 10 version




public class typeInferenceVar {

	// This Type Inference is restricted to local variables only
	//var j = 20; //var' is not allowed here
	
	public static void main(String[] args) {
		
		//var can't be used for declaration purpose instead, it should be used along with initializer.
		//Because we need to specify before execution
		//var i; // Cannot use 'var' on variable without initializer
		//i = 10;
		
		var i = 200000;
		var s1 = "harshavardhan";
		var b1 = true;
		System.out.println(i);
		System.out.println(s1);
		System.out.println(b1);
		var v = new Bank(); // var can also be used with class, but it should be inside the block, local.
		var var = 10;       // The var reserved type name (not a Java keyword) was introduced in Java 10.
		var = var + var;    //Type inference is used in var keyword in which it detects automatically the datatype of a variable based on the surrounding context
		System.out.println(var); // so it can also be used as variable name.
		
		// some restrictions when used with array
		// When used with arrays, should not use the [] brackets
		// var can't be used in In-Line array initialization, but specifying the data type
		
		var arr = new int[5];
		arr[0] = 1;
		//var arr = {1,2,3}; // error-Array initializer needs an explicit target-type
		var arr1 = new int[] {1,2,3,4};
		arr1[0] = 1;
		
	}
	
	// In parameters also var cannot be used.
	// Because, compiler don't know what type of value is passed in it.
	// in parameters, there is not concept of declaration, along with initialization.
	/*
	 * public void add(var i, var j) { // 'var' is not allowed here
	 * System.out.println(i+j); }
	 */

}
