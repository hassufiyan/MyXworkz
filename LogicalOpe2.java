class LogicalOpe2{
public static void main(String []args){
int a=10;
int b=20;
boolean res=((a<b)&&(a!=b++));
System.out.println(res);
System.out.println(b);
}
}