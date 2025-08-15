package javaPractise;

public class datatype {
	static Float i3;     //printing default values
	
	public static void main(String[] args) {
		System.out.println(Short.SIZE);  //take only wrapper classes(capital) gives values in bits
		System.out.println(Byte.MIN_VALUE); //minimum value
		System.out.println(Integer.MAX_VALUE);//maximum value
		System.out.println(Long.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		//System.out.println(Boolean.SIZE); size cannot be resolved or is not a field(and also no other templates formed)
		System.out.println(Character.SIZE);
		//byte b = 500;  Type mismatch: cannot convert from int to byte
		byte b = 50;
		short s = 200;
		int i = 90000;
		//long l = 2932931287978; The literal 2932931287978 of type int is out of range
		long l = 32525345; //or l = 32525345L  no mandatory for all types except float and double in f1 and d1
		float f = 192.168f;
		float f1 = 35e3f; //f is mandatory
		double d = 32147.1234412d; //d is mandatory
		double d1 = 12E4d;
		boolean b1 = true;
		boolean b2 = false;
		char r = '#';
		System.out.println(b1);
		System.out.println(r);
		System.out.println(f);
		System.out.println(b);
        System.out.println(d);
        System.out.println(f1);
        System.out.println(d1);
        
        System.out.println(i3);  //printing default values for char(space) for boolean(false) and all wrapper classes(null) rest all 0 is the default value
        
	}

}
