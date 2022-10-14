class MixSample{
static int a;
int b=1;
 static void test(){
	System.out.println("...");
}

public static void main(String[] args)
{
int c;
a=10;
System.out.println("a :"+MixSample.a);
MixSample a1=new MixSample();
System.out.println("b :"+a1.b);
MixSample.test();
c=14;
System.out.println("c :"+c);
System.out.println("a :"+MixSample.a);


}
}

