class StatInstMembersDemo{
static int a=-10;
int b=20;

static void cell(){
System.out.println("running cell method");
}
void noCell(){
	++b;
	System.out.println(b);
System.out.println("running noCell method");
}
public static void main(String[] args){
a++;

System.out.println("a: "+StatInstMembersDemo.a);//11;
System.out.println(~a);
++a;
System.out.println("a: "+StatInstMembersDemo.a);//12;
StatInstMembersDemo a1=new StatInstMembersDemo();
System.out.println("b: "+a1.b);//21;
StatInstMembersDemo.cell();
a1.noCell();
}
}