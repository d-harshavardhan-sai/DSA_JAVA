package com.harshavardhan.interfaces;

public class User {

	public static void main(String[] args) {
		Lenovo lenovo = new Lenovo();
		lenovo.copy();
		lenovo.paste();
		lenovo.capture();
		lenovo.security();  // default method - can override and access by only certain classes which has implemented it.
		// no object creation since it is static
		Laptop.audio();  // static method - to access by anybody
		
		Hp hp = new Hp();
		hp.printing();
		hp.cut();
		hp.security();
		
		

		// Until java-1.7 (Interface - What to do(methods); Class - What and How to do.)
		// java-1.8(turn over of java structure-a huge change)
		//If I introduce any new abstract method in the Interface, then all the classes which implements that interface will be affected.
		//In order to overcome this situation, we can provide implementation in the interface itself using 2 keywords.
		// default and static keywords
		//In java 1.9 private methods also introduced.
		//we use private for any certain code, not to access it outside of the class.
		//If we provide a private method in Interfaces and try to implement it outside, we cannot use it. this private code is only within the interface, then what is the use of using it.
		//To introduce code re-uasability in interfaces and to eliminate duplication(happen when we write a common code)
	}

}

// for checking which version can be used
   // right click on javaPractise-properities-java compiler change and check 
