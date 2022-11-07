package Constructor.Constructor_Chainning;

public class NationalSymbol {

	String animal;
	String bird;
	String flag;
	
	NationalSymbol(){
		System.out.println("India has 3 national symbols.");
	}
	NationalSymbol(String animal,String bird,String flag){
		this();
		this.animal=animal;
		this.bird=bird;
		this.flag=flag;
	}
}
