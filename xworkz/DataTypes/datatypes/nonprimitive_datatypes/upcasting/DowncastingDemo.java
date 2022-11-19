package com.xworkz.datatypes.nonprimitive_datatypes.upcasting;

public class DowncastingDemo {
	public static void main(String[] args) {
    
		Tree tree=new Mango();
		Mango mango=(Mango) tree;
		
		mango.producesOxygen();
		mango.producesMangoFruits();
		
		
		
		
	}

}
