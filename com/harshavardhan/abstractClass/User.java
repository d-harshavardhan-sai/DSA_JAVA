package com.harshavardhan.abstractClass;

public class User {
	public static void main(String[] args) {
		
		// we can create instance for complete class like AHp
		AHp ahp = new AHp();
		ahp.copy(); 
		ahp.cut();
		ahp.keyboard();
		ahp.paste();
		
		// but we cannot create an instance for abstract class
		//SampleAC sac = new SampleAC();//Cannot instantiate the type SampleAC
		
		// Abstraction
		ahp.copy(); // if we open this functionality, it will show implementation part
		// it is not abstraction
		// so we need to hide
		// so instead of AHp, we put ALaptop. because AHp is implementing ALaptop.
		// object ahp can be ALaptop type also
		ALaptop ahp1 = new AHp();
		ahp1.copy();  // if we open this functionality, now we cannot see this implementation part.
		ahp1.cut();
		ahp1.keyboard();
		ahp1.paste();
		
		ExtendedAHp eh = new ExtendedAHp();
		eh.copy();  // points ExtendedAHp.java copy() method since it overrides it.
		
	}
}


//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//Security
//Simplicity
//to achieve we use interfaces and abstract class 
// before java 8 abstraction is 100% possible using interfaces(because in interfaces there will be no implemented method)
// from java 8, we can provide implementation of methods in interface it-self using default and static key words.
// so percentage of abstraction decreases. because there is implementation.