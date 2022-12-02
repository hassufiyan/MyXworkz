package com.xworkz.WrapperClassDemo;

public class WrapperClass_BoxingDemo1 {
	public static void main(String[] args) {
		//here primiy=tive valuse is converted into object type,it is boxing..
		int n=10;
		Integer num=n;//implicit/automatic conversion..
		System.out.println(num);
		System.out.println(num.MAX_VALUE);
		
		byte b=2;
		Byte b1=b;//implicit conversion
		//System.out.println(b1);
		System.out.println(b1.byteValue());
		
		char ch='a';
		Character ch1=new Character(ch);//explicit/manual conversion...
		
		System.out.println(ch1.SIZE);
		System.out.println(ch1);
		
	}

}
