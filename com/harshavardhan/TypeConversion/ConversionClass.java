package com.harshavardhan.TypeConversion;

public class ConversionClass {

	public static void main(String[] args) {
		byte b = 100;   //-128 to 127  = 256
		short s = 500;  //-32768 to 32767
		int i = 300;
		float f = 25.1f;
		long l = 7895463;
		double d = 52.55;

		char ch ='A';
		boolean bo = true;

		//Implicit - java automatically can store smaller values in a bigger type variables
		//		s=b;
		//		System.out.println(s);
		// check for below lines also
		//		i=b;
		//		f=b;
		//		l=b;
		//		d=b;
		//		ch=b; error. Have to add casting type
		//Explicit - User should externally do some operation in order to store bigger values in a smaller type variables
		//		ch=(char) b; //ascii value of 100 is d
		//		b=ch; error. Have to add casting type
		//boolean is an incompatible type. Because we cannot convert boolean to any of the rest data types and vice versa.
		//		bo=b; Error. It is not possible to convert. We need to change bo type to byte initially.
		//		b=(byte) i; // prints 44 instead of 300. Because it counts from its range -127 to 128 = 256 numbers and gives 300-256=44 integer
		//also check for i = 128 initially and understand below flow condition.
		//and also counting goes like 0,1,2,3.......127,-128,-127,-126,-125,.....,-3,-2,-1,0,1,2,3,......127, repeat,0,1,2....and so on so forth.
		//same for next data types.
		//		System.out.println(b);
		//		byte b2 = b+b; error. since Java automatically converted a smaller data type to a larger one integer
		//check for
		//		byte b2 = b+s;
		//		byte b2 = s+s;
		//		int i = b+s; //no error in this case
		//		int i1 = b+i+l;// error. In these three variables l is higher data type. So type have to be converted to l
		//		System.out.println('a'+'b');//here char promoted to integer a=65, b=66. return 65+66=131.
		//automatic type promotion-a process in Java that automatically converts a smaller data type to a larger one to prevent data loss.
		//when we perform any operation on byte, sort, char mix, java promotes type to integer.

	}

}

//Implicit Conversion/Automatic/Widening/Upcasting
//Explicit Conversion/Manual/Narrowing/Downcasting