package com.xworkz.objectclass_methods.hash_code_method;

public class RingMainDemo {
public static void main(String[] args) {
	Ring diamond=new Ring();
	
	SilverRing silver=new SilverRing();
	
	System.out.println(diamond.hashCode());

	System.out.println(silver.hashCode());
}
}
