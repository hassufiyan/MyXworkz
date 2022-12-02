package com.xworkz.exception.exceptionprogramms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompiletimeExceptionDemo {
	public static void main(String[] args)  {
		
		try {
			FileReader file=new FileReader("E:\\Java.txt");
			System.out.println("to check whtr the pointer comes here or not");
			BufferedReader reader=new BufferedReader(file);
			for(int i=0;i<2;i++) {
				System.out.println(reader.readLine());
			}
			
		} catch (IOException e) {//here filenotfound exception is child of I/O exception,so parent reffernce can hold child object(upcasting)..
			System.out.println("Exception caught..");
		}
		System.out.println("Main method ended");
		
		
		
		
		
		
		
	}
	

}
