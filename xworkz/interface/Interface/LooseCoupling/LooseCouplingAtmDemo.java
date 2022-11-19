package com.xworkz.Interface.LooseCoupling;

public class LooseCouplingAtmDemo {
	public static void main(String[] args) {
		Axis axis=new Axis();
		Hdfc hdfc=new Hdfc();
		Atm atm=new Atm();
		
		atm.print(hdfc);
		atm.print(axis);
		
	}

}
