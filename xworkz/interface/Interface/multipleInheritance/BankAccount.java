package com.xworkz.Interface.multipleInheritance;

public class BankAccount implements AxisBank,IdfcBank {

	
	public void salaryAccount() {
		System.out.println("My official salary account is in Idfc first bank...");
		
	}

	
	public void savingsAccount() {
		System.out.println("My personal savings account is in Axis Bank...");
		
	}

	
}
