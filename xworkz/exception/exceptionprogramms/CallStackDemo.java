package com.xworkz.exception.exceptionprogramms;

public class CallStackDemo {
 int a;
  int b;
	static int divide(int a,int b) {
		return a/b;
	}
	static int computDivision(int a,int b) {
		int res=10; 
		try {
			res=divide(a, b);	
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught");
		}
		
	return res;
	}
	public static void main(String[] args) {
		try {
			System.out.println(computDivision(20,0));
		}
		catch(ArithmeticException nf) {
			System.out.println("caught NumberFormatException");
		nf.printStackTrace();
		}
	
		
		
	}
	
	}
