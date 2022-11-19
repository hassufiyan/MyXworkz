package com.xowrkz.access_modifiers.PrivateAccessModifier;


public class A {

static private	int a1=10;//access only with in a class
protected	int b1=20;//access only with in a package,if there is Inheritance then can be accessed outside the package

public static void main(String[] args) {
	System.out.println(A.a1);//here it is private access modifier hence it can be accessed.
} 
}
