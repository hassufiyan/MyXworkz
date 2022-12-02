package com.xworkz.collection;

public class Students {
	String name;
	String dept;
	String institue;
	
	
	
	Students(String name,String dept,String institue){
	this.name=name;
	this.dept=dept;
	this.institue=institue;
	
	}



	@Override
	public String toString() {
		return "Students [name=" + name + ", dept=" + dept + ", institue=" + institue + "]";
	}
	
}
