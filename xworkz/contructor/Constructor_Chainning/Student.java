package Constructor.Constructor_Chainning;

public class Student {
	String name,course;
	int rollNo;
	float fees;
	
	Student(String name,String course,int rollNo){
		this.name=name;
		this.course=course;
		this.rollNo=rollNo;
	}
	
	Student(String name,String course,int rollNo,float fees){
		this( name, course, rollNo);
		this.fees=fees;
	}

}
