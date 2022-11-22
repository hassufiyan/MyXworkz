package com.xworkz.enumclasses.enumclasses;

public class EnumDemo2 {
	
	enum Season{
		WINTER(10),SUMMER(20),SPRING(30);
	
	
	
	private int value;
	Season(int value){
		this.value=value;
}
}
public static void main(String[] args) {
	for(Season s:Season.values())
	System.out.println(s+" "+s.value);
	
	
	
}
}


