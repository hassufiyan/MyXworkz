package com.xworkz.string_class;

public class String_concatDemo {
	public static void main(String[] args) {
		
		String str="Thank";
		String str1="you";
		 str1=str;
		
		str=str.concat(" god");//here string object is immutable but its reference variables are not...new object is created with "str" reference variable
		
		System.out.println(str);
		//System.out.println(str1);
		//System.out.println(str.concat(str1));
		
	}

}
