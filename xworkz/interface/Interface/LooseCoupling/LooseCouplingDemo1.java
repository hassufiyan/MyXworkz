package com.xworkz.Interface.LooseCoupling;

public class LooseCouplingDemo1 {
	public static void main(String[] args) {
		Sony sony=new Sony();
		Epson epson=new Epson();
		Computer computer=new Computer();
		
		computer.slot(sony);
		computer.slot(epson);
		
	}

}
