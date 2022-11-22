package com.xworkz.enumclasses.enumclasses;

public class EnumSwitchDemo {
	enum Days {
		MONDAY, TUESDAY, WEDNESDAY,THURSDAY
	}

	public static void main(String[] args) {
		Days d = Days.THURSDAY;
		switch (d) {
		case MONDAY:
			System.out.println("Monday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("WEDNESDAY");
			break;
		default:
			System.out.println("other day");

		}

	}

}
