package com.xworkz.string_class;

public class StringBuffer_Mehods {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Bicycle");
		StringBuffer s2=new StringBuffer(" cycle");
		
		System.out.println(s1.capacity());//16+7=23,16 is the default capacity of string buffer..

		System.out.println(s2.substring(0, 3));
		System.out.println(s1.append(s2));//here s1="bicycle cycle"object,
		System.out.println(s1.append('s'));//hence the s1 will be "bicycle cycles"..
		System.out.println(s1.delete(0, 5));
	
	}

}
