class UnarypreOperations1{
public static void main(String[] args){
int x=10;
int y=++x;
int z=++y;
System.out.println("x: "+x);//11
System.out.println("y: "+(++y));//13
System.out.println("z: "+(++z));//12
System.out.println("z: "+(x+z));//3
//x=11;
//y=12;
//z=12;
}
}