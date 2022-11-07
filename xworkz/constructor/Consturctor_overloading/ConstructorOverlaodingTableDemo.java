package Constructor.Consturctor_overloading;

public class ConstructorOverlaodingTableDemo {
public static void main(String[] args) {
	Table t1=new Table("Steel",2500.00,"Blue");
	System.out.println(t1.type);
	System.out.println(t1.price);
	System.out.println(t1.color);
	
	Table t2=new Table();
	System.out.println(t2.type);
	System.out.println(t2.color);
	System.out.println(t2.price);
	

	
	
}
}
