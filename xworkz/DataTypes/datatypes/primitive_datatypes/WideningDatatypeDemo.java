package com.xworkz.datatypes.primitive_datatypes;

public class WideningDatatypeDemo {
	public static void main(String[] args) {
		
	
	byte a=10;
	System.out.println("Before conversion: "+a);
	double b= a;//this is widening casting,here the compliler converts one datatype to another automatically.

	System.out.println("after conversion: "+b);
}
}