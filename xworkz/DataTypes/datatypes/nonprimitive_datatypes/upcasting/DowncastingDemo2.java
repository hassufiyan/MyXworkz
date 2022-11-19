package com.xworkz.datatypes.nonprimitive_datatypes.upcasting;

public class DowncastingDemo2 {
public static void main(String[] args) {
	Building building=new Elevator();
	Elevator otis=(Elevator) building;
	otis.highFloors();
	otis.goingUp();
}
}
