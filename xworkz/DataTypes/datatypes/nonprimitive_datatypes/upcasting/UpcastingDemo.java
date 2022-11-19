package com.xworkz.datatypes.nonprimitive_datatypes.upcasting;

public class UpcastingDemo {
	public static void main(String[] args) {
		//Mango m1=new Mango();
		//m1.producesOxygen();
		//m1.producesMangoFruits();
		
		Tree tree=new Mango();//parent refference holding child object.
		tree.producesOxygen();//here parent object cannot access the properties of child object.
		
		
	}

}
