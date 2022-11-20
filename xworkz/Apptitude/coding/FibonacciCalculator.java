package com.xworkz.coding;

public class FibonacciCalculator {//with recurssion;
	public static int fibonacci(int number) {
		if(number==1 ||number==2) {
			return 1;
		}
	int fib01=1;
	int fib02=1;
	int fibonacci=1;
	
	for(int i=3 ;i<=number;i++) {
		fibonacci=fib01+fib02;
		fib01=fib02;
		fib02=fibonacci;
	}
	return fibonacci;
}

public static void main(String[] args) {
	int number =12;
	System.out.println("fibonacci number of "+number+" numbers is: ");
	for (int i=1;i<=number;i++) {
		int fib=fibonacci(i);
		System.out.print(fib+" ");
		
		
	}	
	}
}