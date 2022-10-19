package com.xworkz.hasarelationship.Association.vehicle;

public class HasARelationshipDemo {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		 
		v1.name="Bajaj Pulsar";
		v1.ccOfVehicle=150;
		v1.color="blue";
		v1.fuel=new Fuel();
		
		System.out.println("name of vehicle : "+v1.name);
		System.out.println("Engine of Vehicle is : "+v1.ccOfVehicle);
		System.out.println("color of Vehicle is : "+v1.color);		
		
		
System.out.println("fuel type is : "+v1.fuel.fuelType);
System.out.println("fuel price is : "+v1.fuel.fuelPrice);
System.out.println("location of bunk is : "+v1.fuel.location);

	
	}
	

}
