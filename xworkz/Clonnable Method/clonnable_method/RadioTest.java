package com.xworkz.clonnable_method;

public class RadioTest  {
	public static void main(String[] args)  {
		
	

Radio sony=new Radio("Sony", 10000.00, new Battery("everyday"));



try {
	Radio copyOfSony= (Radio) sony.clone();//shallow copy
	sony.price=30000.00;
	System.out.println("details of sony; "+sony);
	System.out.println("details of copyOfSony; "+copyOfSony);
	copyOfSony.price=20000.00;
	
	System.out.println("After a change...");
	
	System.out.println("price of sony; "+sony);
	System.out.println("price of copyOfSony; "+copyOfSony);
	
} catch (CloneNotSupportedException e) {
	e.printStackTrace();
}
}
}