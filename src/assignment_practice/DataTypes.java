package assignment_practice;

public class DataTypes {
	public static void main(String[] args) {
		
		byte b1 = -128;
		byte b2 = 127;
		System.out.println(b1);
		System.out.println(b2);
		
		//type casting
		short s1 = 127;
		byte b3 = (byte)s1;
		System.out.println(b3);
		//cyclic nature
		short s2 = 300;
		byte b4 = (byte)s2;
		System.out.println(b4);
		
		//octal number system
		
		int k1 = 0100;
		System.out.println(k1);
		
		//Hexadecimal
		
		int k2 = 0X40;
		System.out.println(k2);
		
		//binary number system
		
		int k3 = 0b1110;
		System.out.println(k3);
		
		//Floating values
		
		float f1 = 12.2F;
		double d1 = 12.44D;
		System.out.println(f1);
		System.out.println(d1);
		
		//Boolean Data Types
		
		boolean o1 = false;
		boolean o2 = true;
		System.out.println(o1);
		System.out.println(o2);
		
		//char data types
		//1. ASCII CODE
		 
		char c1 = '&';
		System.out.println(c1);
		
		// char to int
		
		char c2 = 'J';
		int i1 = (int)c2;
		System.out.println(i1);
		
		// int to char
		
		int i2 = 36;
		char c3 = (char)i2;
		System.out.println(c3);
		
		//1. UNICODE 
		
		char c4 = '\u0935';
		char c5 = '\u093F';
		char c6 = '\u0928';
		char c7 = '\u093E';
		char c8 = '\u092F';
		char c9 = '\u0915';
		System.out.println(c4+""+c5+""+c6+""+c7+""+c8+""+c9);
		
		
	}

}
