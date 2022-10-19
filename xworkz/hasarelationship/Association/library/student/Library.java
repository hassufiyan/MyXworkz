package com.xworkz.hasarelationship.Association.library.student;

public class Library {
    String name;
    int noOfBooks;
    String location;
    Student student;
    
    Student getStudentDetails() {
    	student=new Student();
    	
    	return student;
    }
}
