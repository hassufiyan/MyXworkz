package com.xworkz.objectclass_methods.to_string_method;

public class Bottle {
	
	String type;
	double price;
	String brand;
	
	{
		type="Steel Bottle";
		price=250.0;
		brand="milton";
	}

	@Override
	public String toString() {
		return "Bottle [type=" + type + ", price=" + price + ", brand=" + brand + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
