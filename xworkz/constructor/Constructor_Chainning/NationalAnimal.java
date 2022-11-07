package Constructor.Constructor_Chainning;

public class NationalAnimal extends NationalSymbol {
	String name;
	String country;
	String species;
	
	NationalAnimal (){
		this(null,null,null);
		name="Tiger";
		country="india";		
		species="panthera tigris";
		System.out.println("Tiger is a national animal of india");
	
	}
	NationalAnimal (String name,String country,String species){
		super("Tiger","peacock","tricolor");
		this.name=name;
		this.country=country;
		this.species=species;
	}
}
	
