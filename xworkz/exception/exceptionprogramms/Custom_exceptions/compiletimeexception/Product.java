package com.xworkz.exception.exceptionprogramms.Custom_exceptions.compiletimeexception;

public class Product {
	
	String name;
	double price;

	Product(String name,double price){
		this.name=name;
		this.price=price;
	}
	//here we need to override equals() and hashcode() coz equals() method directs the address of object n object class...to get the content we need to override...

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
	
	
}
