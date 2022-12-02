package com.xworkz.exception.exceptionprogramms.Custom_exceptions;

public class AtmMachine {
	  void withDraw(int amount) throws AtmException {
		if(amount%100!=0 || amount >50000) {
			AtmException atm=new AtmException();
		
		throw atm;
	  
	}
	 else {
		 System.out.println("Collect cash..");
	 }
}
}