package com.xworkz.exception.exceptionprogramms;

public class RuntimeExceptionDemo {

	// here compiler doesnot show any exception before execution...
	int a;
	int b;

	int divide(int a, int b) {
		return a / b; // as we are dividing a number zero,its showing an "Airthmetic
						// exception,i,e;runtime exception...
	}

	public static void main(String[] args) {

		RuntimeExceptionDemo d1 = new RuntimeExceptionDemo();
		try {
		System.out.println(d1.divide(20, 0)); // exception occured here...
		}
		
		catch(NullPointerException e){//here if the exception is not caught by catch block becoz of different execption object,
			//JVM catches it with default EXCEPTION handler...
		
		System.out.println(e);		
		}
		System.out.println("main method ended");
	}
}
