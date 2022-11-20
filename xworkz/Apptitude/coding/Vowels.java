package com.xworkz.coding;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the input");
	
		
		String s1=scn.next();
		s1.toLowerCase();
		int count=0;
		
		while(true) {	
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				count++;
			
			}
		}
		 System.out.println("no.of volwels in given string is: " +count);
			break;
		}
		
		
		
		
	}
		
	}
	


