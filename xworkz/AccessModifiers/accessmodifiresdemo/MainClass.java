package com.xworkz.accessmodifiresdemo;

import com.xowrkz.access_modifiers.PrivateAccessModifier.*;

public class MainClass {
	public static void main(String[] args) {
		X x=new X();
		B b=new B();
		System.out.println(x.y2);
		//System.out.println(x.y2);
		
		System.out.println(b.d1);
		
		
	}

}
