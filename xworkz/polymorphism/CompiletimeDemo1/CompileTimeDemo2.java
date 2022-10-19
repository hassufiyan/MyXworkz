package com.xworkz.polymorphism.CompiletimeDemo1;

public class CompileTimeDemo2 {

	public static void main(String[] args) {
		Human h1=new Human();
	Unknown unknown=new Unknown();
	Friend friend=new Friend();
	h1.speak(unknown);
	h1.speak(friend);

	}

}
