package com.xworkz.exception.exceptionprogramms.Custom_exceptions;

public class Jason {
	public static void main(String[] args) {
		int amount=10;
		AtmMachine a1=new AtmMachine();
		try {
			a1.withDraw(amount);
		} catch (AtmException e) {
			if(amount%100!=0) {
				System.out.println(e);
			}
			else {
				System.out.println(e.getMessage());
			}
			
		//	e.printStackTrace();
		}
		
		
	}

}
