package com.xworkz.exception.exceptionprogramms.Custom_exceptions.runtime_exceptions;

public class Doctors {
	
String nameOfDoctor;
String specialist;
double fees;

Doctors(String nameOfDoctor,String specialist,double fees){
	this.nameOfDoctor=nameOfDoctor;
	this.specialist=specialist;
	this.fees=fees;
	
	
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(fees);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((nameOfDoctor == null) ? 0 : nameOfDoctor.hashCode());
	result = prime * result + ((specialist == null) ? 0 : specialist.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Doctors other = (Doctors) obj;
	if (Double.doubleToLongBits(fees) != Double.doubleToLongBits(other.fees))
		return false;
	if (nameOfDoctor == null) {
		if (other.nameOfDoctor != null)
			return false;
	} else if (!nameOfDoctor.equals(other.nameOfDoctor))
		return false;
	if (specialist == null) {
		if (other.specialist != null)
			return false;
	} else if (!specialist.equals(other.specialist))
		return false;
	return true;
}

@Override
public String toString() {
	return "Doctors [nameOfDoctor=" + nameOfDoctor + ", specialist=" + specialist + ", fees=" + fees + "]";
}


}
