package com.xworkz.string_class.Stringclass_literal_newkeyword;

public class LiteralDemo {
public static void main(String[] args) {
	
	String str="Xworkz";
	String str2="Xworkz";
	String str3="evm";
	str3="net";
	
	System.out.println(str==str2);//true,coz here "==" operator is  checking adress o the object..
	//System.out.println(str.equals(str2));	
	
	String str11=new String("xworkz");
	String str12=new String("xworkz");
String	str13=str12.intern();//str13=SCP  && str12==heap memory refernce varibale...

//System.out.println(str11==str12);
//System.out.println(str11.equals(str12));
System.out.println(str13.equals(str12));
System.out.println(str13==(str12));
}



}
