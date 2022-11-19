 package com.xworkz.Interface.multipleInheritance;

public class TaxCaluclator implements StateTax,CentralTax{

	@Override
	public void incomeTax() {
		System.out.println("Income tax is Rs.100..");
		
	}

	@Override
	public void electricityTax() {
		System.out.println("Electricity Tax is Rs.50");
		
	}
	

}
