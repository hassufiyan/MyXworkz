package Constructor.Constructor_Chainning;

public class ConstructorChainningDemo2 {
	public static void main(String[] args) {
		NationalAnimal  tiger=new NationalAnimal ();
		System.out.println("name of national Animal is "+tiger.name);
		System.out.println("name of the country is "+tiger.country);
		System.out.println("Species of national animal is "+tiger.species);
		
		NationalAnimal  an=new NationalAnimal ("Tiger","India","panthera");
		
		System.out.println(an.animal);
		System.out.println(an.bird);
		System.out.println(an.flag);
		
		
	}

}
