package Constructor.Consturctor_overloading;

public class ConstructorOverloading {
public static void main(String[] args) {
	Medicine m1=new Medicine();
	System.out.println(m1.price);
	System.out.println(m1.name);
	System.out.println(m1.dose);
	
	Medicine dolo=new Medicine("paracetamol",120,"10mg");
	System.out.println(dolo.name);
	System.out.println(dolo.price);
}
}
