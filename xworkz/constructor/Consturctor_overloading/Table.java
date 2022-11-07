package Constructor.Consturctor_overloading;

public class Table {
	String type;
	double price;
	String color;
	
	Table(String tab,double MRP,String col){
		type=tab;
		price=MRP;
		color=col;
		System.out.println("parameterize constructor");
	}
		
		Table(){
			System.out.println("Default constructor");
			type="plastic";
			price=2000;
			color="white";
			
		}
		
	}

