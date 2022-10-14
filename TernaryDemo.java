class TernaryDemo{
public static void main(String[] args){
int x=1000;
int y=200;
int z=300;
System.out.println("the greatest value is: "+((x<=y)? y:(y<=z)? z:y));
}
}