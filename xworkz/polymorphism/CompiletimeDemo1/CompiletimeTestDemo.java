package com.xworkz.polymorphism.CompiletimeDemo1;

public class CompiletimeTestDemo {
public static void main(String [] args) {
	Addition a1=new Addition();
	a1.add(2,4);
	a1.add(2.2f,3.4f);
	a1.add(3,4,5);
	a1.add(12,34,56,78);
	a1.add(12f,23f,45f);
	System.out.println("the value of integer a and b is :"+a1.add(2,4));
	System.out.println("the value of float a and b is :"+a1.add(2.2f,3.4f));
	System.out.println("the value of integer a,b and c is :"+a1.add(3,4,5));
	System.out.println("the value of integer a,b,c and d is :"+a1.add(12,34,56,78));
	System.out.println("the value of float a,b and c is :"+a1.add(12f,23f,45f));
	
}

}
