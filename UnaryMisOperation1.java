class UnaryMisOperation1{
public static void main(String[] args){
int a=10;//11;
int b=a++;//10
int c=(--b)+(--a);//b=9,a=10,c=19;
c++;//c=20
++a;//a=11;
b--;//b=8
System.out.println("a: "+(a--));//11
System.out.println("a: "+(b+c));//28
System.out.println("a: "+(--b));//7
System.out.println("a: "+(b+c));//27
}
}