package javaPractise;

public class operators {

	public static void main(String[] args) {
		int i = 20;
		int j = 6;
		// Arithmetic operators
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j);
		// Comparison or Relational operators
		System.out.println(i==j);
		System.out.println(i!=j);
		System.out.println(i>j);
		System.out.println(i<j);
		System.out.println(i>=j);
		System.out.println(i<=j);
		// Assignment operators
		System.out.println(j=i); //right side operand value is to be stored in left side operand
		System.out.println(j);
		System.out.println(i);
		int a = 3;
		int b = 5;
		System.out.println(a+=3);// similar to a = a + 3    a = 3 + 3 = 6 // same as for -, *, /, %, &, |, ^, >>, <<
		// Logical/conditional operators
		int c = 7;
		int d = 9;
		System.out.println(c < d && d == c); // logical AND table - False is dominated
        System.out.println(c > d || d > c);  // logical OR table - True is dominated
        System.out.println(!(c > d || d > c)); // logical NOT negation statement
        // Unary operators
        int n1 = 20;
        int n2 = -n1;
        System.out.println(n2); // Unary minus
        System.out.println(!(n1 == n2)); // NOT operator
        int t = 20;  // pre and post increment and decrement
        System.out.println(t);   // 20
        System.out.println(++t); // 21 pre increment - value is incremented and then printed
        System.out.println(t++); // 21 post increment- value is printed and then incremented
        System.out.println(t);   // 22
        int bit = 5;     // in bits 0000 0101                // short cut formula  ~bit = -(bit+1)
        int compli = ~bit; // 1's compliment keep it in mind  1111 1010 = -128+64+32+16+8+2=-6
        System.out.println(compli);
        int bit1 = -5;     // in bits use 2's compliment of 5(1111 1011)  5=0000 0101  1's compli is 1111 1010 and plus 1 to get it
        int compli1 = ~bit1; // 1's compliment keep it in mind 0000 0100 = 4
        System.out.println(compli1);
        // Bitwise operators
        int l = 4;
        int k = 8;
        System.out.println(l | k); // bitwise OR 1 dominated
        System.out.println(l & k); // bitwise AND 0 dominated
        System.out.println(l ^ k); // bitwise XOR same 0 and diff 1
        int bitw = 5;     // in bits 0000 0101
        int compliw = ~bit; // 1's compliment keep it in mind  1111 1010 = -128+64+32+16+8+2=-6
        System.out.println(compliw);
        // Shift operators
        int a1 = 10;   // left shift  // bit form 0000 1010 
        int b1 = a1 << 1; // 1 times it is shifted left  0001 0100 = 20
        System.out.println(b1);  // formula for left shift for n time is a << n is a*(2^n)
        int a2 = -100;   // right shift   // bit form 0000 1010
        int b2 = a2 >> 2; // left side bit is written as it is and left is moved right 0000 0101 = 5
        System.out.println(b2); // formula for left shift for n time is a << n is a/(2^n)
        int a3 = -100;    // same as right shift but not for negative numbers
        int b3 = a3 >>> 2;
        System.out.println(b3);     // unsigned left shift is not present in eclipse or java
        
	}
}
