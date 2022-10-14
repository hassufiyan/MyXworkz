class Method{
 void learnFramework(){
learnJava();
System.out.println("I Have Learnt Framework");
}
 void learnJava(){
System.out.println("Ihave learnt java");
}
public static void main(String []args){
System.out.println("Main Method Started");
Method m1=new Method();
m1.learnFramework();
System.out.println("Main Method ended");
}
}


