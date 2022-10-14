class TernaryDemo1{
public static void main(String[] args)
{
int a=10;//11
int b=20;//22
a+=b;//a=30;
System.out.println(a);//30;
int c=((a++<=b++) ? a:b);//a=30++;c=20;
//if condition is true,the it executes a value i.e;a=11(as we have asked it to increment the value of "a" in "c",vice versa if the condition is false,"b" value will be executed i,e:b=21				
a+=b;//a=a+b=51;
System.out.println(a);//52;
System.out.println(c);//21
++a;//53
System.out.println(a);//53
c++;//22
//b=22(condition is false),therfore c=22;
int d=c*a;//22*53;
System.out.println(c);//22
System.out.println(d);//704
}
}