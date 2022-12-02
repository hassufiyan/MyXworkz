package com.xworkz.ParsingClassDemo.ParsingDemo;

public class ParsingDemo1 {//parsing reads the string values and converts it into another type..
	public static void main(String[] args) {
		String s1="10";
		String s2="20";
		
		String b1="100";
		Byte b11=Byte.parseByte(b1);
		byte b12=b11;
		System.out.println(b12);//conversion from object type to primitive type...
		System.out.println(b11);
		

		
		System.out.println(s1+s2);//here concatination takes places,no addition..
		
Integer s3=Integer.parseInt(s1)	;
Integer s4=Integer.parseInt(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s3+s4);//after the string vlaue has been converted to Integer value,both vaues gets added..

System.out.println(s3.MAX_VALUE);
System.out.println(s4.MAX_VALUE);//to check
System.out.println(s3.compare(s4, s3));//here compares the 2 int values..



		
		
		
		
		
	}

}
