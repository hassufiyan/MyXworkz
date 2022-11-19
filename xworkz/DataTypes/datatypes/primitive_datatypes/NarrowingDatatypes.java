package com.xworkz.datatypes.primitive_datatypes;

public class NarrowingDatatypes {
	public static void main(String[] args) {
		long num=100000L;
		
		
		System.out.println("Before conversion: "+num);
		byte res=(byte) num;//narrowing datatype,here conversion should be done manually.
	System.out.println("After conversion: "+res);
	
	double d1=10.00;
	System.out.println("Before Conversion: "+d1);
	
	int d2=(int)d1;
	System.out.println("After conversion: "+d2);
	}

}
