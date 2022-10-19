package com.xworkz.hasarelationship.Association.library.student;

public class AssociationDemo {

	public static void main(String[] args) {
		Library l1=new Library();
		 
		l1.name="Tagore";
		l1.noOfBooks=200;
		l1.location="BTM Layout";
		l1.getStudentDetails();
		
System.out.println("name of library is :"+l1.name);
System.out.println("name of library is :"+l1.noOfBooks);
System.out.println("name of library is :"+l1.location);

System.out.println("name of library is :"+l1.student.name);
System.out.println("name of library is :"+l1.student.id);
System.out.println("name of library is :"+l1.student.college);

	}

}
