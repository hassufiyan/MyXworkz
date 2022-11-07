package Constructor.Constructor_Chainning;

public class ConstructorChainningDemo3 {
	public static void main(String[] args) {
		Student s1=new Student("Rahul", "Java",1234 );
	System.out.println("name: "+s1.name);
	System.out.println("Course "+s1.course);
	System.out.println("RollNo "+s1.rollNo);
	
	Student s2=new Student("raj","python",4567,20000f);
	System.out.println("name: "+s2.name);
	System.out.println("Course "+s2.course);
	System.out.println("RollNo "+s2.rollNo);
	System.out.println("fees is: "+s2.fees);
	
	
	
	
	}

}
