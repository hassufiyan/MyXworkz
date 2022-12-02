package com.xworkz.exception.exceptionprogramms.Custom_exceptions.compiletimeexception;

public class SuprDailyConsumer {
	public static void main(String[] args) {
		
		SuprDailyOnlineStore sdo=new SuprDailyOnlineStore();
	try {	
	sdo.search(new Product("Bowl",100.00));
	}
	catch( SuprDailyException se) {
	System.out.println(se);
	}
		
		
	}

}
