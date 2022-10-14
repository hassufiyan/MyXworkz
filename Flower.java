class Flower{
String name;
String color;
int numberOfPetals;
void sheddingFragrance(){
System.out.println(name +" is "+color+" in color "+" and it has "+numberOfPetals+" no. of petals");
}
void blooming(){
System.out.println(name+" blooms everyday");
}
public static void main(String[] args){
Flower rose=new Flower();
rose.name="Rose";
rose.color="Red";
rose.numberOfPetals=12;
rose.sheddingFragrance();
rose.blooming();
}
}
