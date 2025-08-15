package javaPractise;

public class construc {
	public int i;
	public static void main(String[] args) {
		construc obj = new construc(40);         // only this is given and no constructed is created then java creates default constructor while creating an object in the compile time and can be seen in .class file
		System.out.println(obj.i);
	}
	public construc() { // parameterless constructor
		i = 20;
	}
	public construc(int a) {  // Parameterized constructor
		i = a;
	}
}
