package com.xworkz.polymorphism.runtimedemo.bank;

public class BankDemo {
public static void main(String [] args) {
	SBI sbi=new SBI();
	HDFC hdfc=new HDFC();
	RBI rbi=new RBI();
	System.out.println(sbi.getInterestRate());
	System.out.println(hdfc.getInterestRate());
	System.out.println(rbi.getInterestRate());

}
}
