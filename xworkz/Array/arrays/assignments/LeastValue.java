package com.xworkz.arrays.assignments;

public class LeastValue {
	public static void main(String[] args) {
		char []arr= {'a','b','c','d'};
		char value=arr[3];
			
		for(int i=0;i<=arr.length-1;i++) {
				if (arr[i]<value) {
				value=arr[i]; 
		
			}
				System.out.println(arr[i]);
		}
			System.out.println("least value in given array is: "+value);
	
		}
}

		
		
		
		
	


