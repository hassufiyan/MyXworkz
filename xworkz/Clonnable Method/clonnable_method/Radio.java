package com.xworkz.clonnable_method;

public class Radio implements Cloneable {//(must implement cloneable interface or else it will throw CloneNotSupportedException
	
	String brand;
	double price;
	Battery battery;
	
	Radio(String brand,double price,Battery battery){
	this.brand=brand;
	this.price=price;
	this.battery=battery;
	}

	@Override
	public Radio clone() throws CloneNotSupportedException {//(shallow copy only return super.clone)
	Radio	copy=(Radio) super.clone();
	copy.battery=new Battery("everyday");//Deep copy(providing our own implementation)(for deep copy we need has-a relationship)
	return copy;
	}

	@Override
	public String toString() {
		return "Radio [brand=" + brand + ", price=" + price + ", battery=" + battery + "]";
	}


	
	
	
	
	}

