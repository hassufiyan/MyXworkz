package com.xworkz.exception.exceptionprogramms.Custom_exceptions.runtime_exceptions;

public class Hospital {

	Doctors[] doctors = { new Doctors("Dr.Arvind", "Pediatrician", 500.00),
			new Doctors("Dr.Mohammed Qadir", "Cardiologist", 1000.00), new Doctors("Dr.Ray", "Neurologist", 800.00),
			new Doctors("Dr.Geeta", "Gynacologist", 1500.00), new Doctors("Dr.Sarita", "dietitian", 500.00) };

	void appointmentBooking(Doctors doctor) {

		int count = 0;
		for (int i = 0; i < doctors.length; i++) {
			if (doctors[i].equals(doctor)) {
				System.out.println("Details of doctor is " + doctors[i]);
				count++;

			}
		}	

		if (count == 1) {
			System.out.println("Doctor available ");

		} else {
			throw new HospitalException();
		}
	}
	
}
