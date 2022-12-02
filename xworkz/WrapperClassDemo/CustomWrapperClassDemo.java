package com.xworkz.WrapperClassDemo;

public class CustomWrapperClassDemo {
	int n;
	
	
	CustomWrapperClassDemo(int n){
		this.n=n;
		
	}


	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}
	
	
	
	@Override
	public String toString() {
		return Integer.toString(n);//here we over ride tostring() and return the Integer explicitly...
	}


	public static void main(String[] args) {
		CustomWrapperClassDemo d1=new CustomWrapperClassDemo(12);
		
		System.out.println(d1);
	}

}
