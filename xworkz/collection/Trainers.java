package com.xworkz.collection;

public class Trainers {
String name;
String sub;
Students student;


	
Trainers(String name,String sub,Students student){
	this.name=name;
	this.sub=sub;
	this.student=student;
	

}



@Override
public String toString() {
	return "Trainers [name=" + name + ", sub=" + sub + ", student=" + student + "]";
}






}