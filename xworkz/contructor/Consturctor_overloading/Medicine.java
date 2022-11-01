package Constructor.Consturctor_overloading;

public class Medicine {
String name;
double price;
String dose;

Medicine(){
	name="zifi200";
	dose="19mg";
	price=100;
	
System.out.println("iam default constructor");


}

Medicine(String name,double price,String dose){
	this.name=name;
	this.price=price;
	this.dose=dose;
System.out.println("iam parametirized consturctor");


}

}

