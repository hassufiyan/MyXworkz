package Constructor.Constructor_Chainning;

public class TV {
	String name;
	double price;
	String color;
	
	TV(){
		this( "LG", 35000.00);
		name="Sony";
		price=23000.00;		
		color="Grey";
		System.out.println("iam default constructor");
		
	}
	TV(String name,double price){
		System.out.println("iam parameterized Constructor");
		this.name=name;
		this.price=price;
	}
	TV(String name,double price,String color){
		this(name, price);
		this.color=color;
		System.out.println("iam a 3 parameterized Constructor");
	}
	
}
