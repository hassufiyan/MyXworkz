package com.xworkz.collection;

import java.util.ArrayList;

public class ArrayListDemoStudents {
	public static void main(String[] args) {
		
		ArrayList<Trainers> std=new ArrayList<Trainers>();
		Trainers asha=new Trainers("Asha", "Core Java",new Students("Roy", "Civil", "Xworkz_BTM"));
		Trainers omkar=new Trainers("Omkar", "Core Java",new Students("Raj", "Mech.", "Xworkz_rajajinagar"));
		Trainers asha1=new Trainers("Asha", "Core Java",new Students("Sameer", "CS", "Xworkz_BTM"));
		Trainers Rajshekar=new Trainers("Rajshekar", "Programming apptitude",new Students("Yash", "Civil", "Xworkz_BTM"));
		std.add(asha);
		std.add(omkar);
		std.add(asha1);
		std.add(Rajshekar);
		
		for(Trainers t:std) {
			if(t.name.equals("Asha")) {
				System.out.println(t);
			}
			
		}
		
	}

}
