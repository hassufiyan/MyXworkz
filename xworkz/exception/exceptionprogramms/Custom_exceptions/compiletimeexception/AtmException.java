package com.xworkz.exception.exceptionprogramms.Custom_exceptions;

import java.lang.annotation.Target;

public class AtmException extends Exception {

	@Override
	public String toString() {
		return "Invalid Amount";
	}

	@Override
	public String getMessage() {
		return "Amount Exceeded";
	}
	
	
	
	
	
	
}