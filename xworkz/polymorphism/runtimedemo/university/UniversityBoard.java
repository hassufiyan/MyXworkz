package com.xworkz.polymorphism.runtimedemo.university;

public class UniversityBoard {

	public static void main(String[] args) {
		VTU_University uni=new VTU_University();
		College1 c1=new College1();
		College2 c2=new College2();
		
		System.out.println(uni.cutOffPercentage(85.20));
		System.out.println(c1.cutOffPercentage(83.20));
		System.out.println(c2.cutOffPercentage(76.20));
		
		
	}

}
