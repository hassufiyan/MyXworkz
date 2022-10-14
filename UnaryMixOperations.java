class UnaryMixOperations{
public static void main(String[] args){
int a=10; //11
System.out.println("a: "+a);
int b=a++;//10
System.out.println("a: "+a);
System.out.println("b: "+b);
int c=(--b)+(--a);// a=10,b=9,c=19
System.out.println("c: "+c);
c++; // c=20
System.out.println("c: "+c);
++a; // a=11
System.out.println("a: "+a);
b--; // b=8
System.out.println("b: "+b);
System.out.println("a: "+(a--));//11;
System.out.println("b: "+(b+c));//28;
System.out.println("c: "+--b);//7;
//System.out.println(b+c);//29;
//a=11;
//b=10;
//c=19;

int z=0;
System.out.println("a: "+(++a));
System.out.println("z: "+z);
}
}