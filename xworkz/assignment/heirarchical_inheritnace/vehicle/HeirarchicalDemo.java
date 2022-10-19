package com.xworkz.assignment.heirarchical_inheritnace.vehicle;

public class HeirarchicalDemo {
	public static void main(String[] args) {
		Bike pulsar=new Bike();
		Car baleno=new Car();
		
		pulsar.speed();
		pulsar.capacity();
		pulsar.ridingcapacity();
		baleno.capacity();
		baleno.comfortCapacity();
		baleno.speed();
	}

}
