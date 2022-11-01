package Constructor.Constructor_Chainning;

public class ConstructorChainningDemo1 {
public static void main(String[] args) {
 
 
 
 
 TV t1=new TV();
 System.out.println(t1.name);
 System.out.println(t1.price);
 System.out.println(t1.color);
 
 
 TV t2=new TV("SamSung",30000.00);
 System.out.println(t2.name);
 System.out.println(t2.price);

 TV t3=new TV(null,0.00,null);
 System.out.println(t3.name);
 System.out.println(t3.price);
 System.out.println(t3.color);




}
}
