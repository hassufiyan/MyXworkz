package Constructor.Parameterized_Constructor;

public class Building {
	String type;
	double price;
	
	Building(String t1,double p1){
		System.out.println("Parameterized Constructor");
		type=t1;
		price=p1;
	}

}
