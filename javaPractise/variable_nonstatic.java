package javaPractise;

public class variable_nonstatic {
	int ns=10; //non-static variable can be created only in class not in a method. No static keyword is used. Instance variable. It cannot be accessed directly. An instance/object/reference must be created to access the value of the variable in the main method 
	public static void main(String[] args) {
		variable_nonstatic obj = new variable_nonstatic();  //directly without creating an object, printing using System.out.println(ns); throws an error-Cannot make a static reference to the non-static field ns
		System.out.println(obj.ns);
	}
}
