package com.xworkz.WrapperClassDemo;

public class UnBoxingDemo {
	public static void main(String[] args) {
		//here object type is converted into primitive type,is it called as unboxing..
		//implicit conversion
		Integer n=100;
		int num=n;
		System.out.println(num);
		
		Byte b1=11;
		byte b2=b1;
		System.out.println(b2);
		
		Short s1=19;
		short s2=s1;
		System.out.println(s2);
		
		Long l1=1000L;
		long l2=l1;
		System.out.println(l2);
		
		Float f1=123.345345f;
		float f2=f1;
		System.out.println(f2);
		
		Double d1=4444.567;
		double d2=d1;
		System.out.println(d2);
		
		
		Character c1='f';
		char c2=c1;
		System.out.println(c2);
		
		
		
	//explicit conversion
		Boolean v1=false;
		boolean v2=Boolean.valueOf(v1);//here explicit conversion from object type to primitive is done and valueof() is used....
		
		char c3=Character.valueOf(c2);
		System.out.println(c3);
		
		System.out.println(v1.booleanValue());
		//System.out.println(v2);
		System.out.println(v1.compareTo(v1));
		System.out.println(v1.TRUE);
		
	}
	

}
