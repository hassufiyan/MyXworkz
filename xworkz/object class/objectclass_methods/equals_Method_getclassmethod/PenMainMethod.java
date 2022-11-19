package com.xworkz.objectclass_methods.equals_Method_getclassmethod;

public class PenMainMethod {
public static void main(String[] args) {
	

	Pen cello=new Pen("Cello",10.00,"Ball Pen");
	Pen brite=new Pen("Brite",20.0,"Gel Pen");
	Pen cello1=new Pen("Cello",10.00,"Ball Pen");

	
	System.out.println(cello.equals(cello1));
	System.out.println(cello.equals(brite));

	//System.out.println(cello.getClass().getSimpleName());
	

 String	nameOfClass=cello.getClass().getSimpleName();
System.out.println(nameOfClass);	
	
}	

}
