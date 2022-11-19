package com.xworkz.arrays.multi_dimensional_array;

public class Multi_DimesionArray_StudentDemo {
public static void main(String[] args) {
	Student jack=new Student("Jack",15, "civil", "RIT");
	Student roy=new Student("Roy",18, "CSE", "RIT");
	Student sam=new Student("Sam",25, "EEE", "RIT");
	Student jason=new Student("Jason",56, "EC", "MRT");
	
	Student[] students= {jack,roy,sam,jason};
	boolean x=false;
	for(int i=0;i<students.length;i++) {
		if(students[i].college.equals("SIT")||(students[i].college.equals("MRT"))) {
			System.out.println("Students studying in "+students[i].college+" are... "+students[i].name);
			//x=true;
		}
	
		if(x=false) {
			System.out.println("no record found of students studying in RIT... ");
	
	}
		
		}
}
}