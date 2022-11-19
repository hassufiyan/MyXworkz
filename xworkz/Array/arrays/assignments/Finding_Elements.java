package com.xworkz.arrays.assignments;

public class Finding_Elements {
	public static void main(String[] args) {
		String []arr1= {"Apple","Orange","Bannana","Mango","JackFruit"};
		
		String fruit="Apple";
		int temp=0;
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
			if(fruit.equals(arr1[i])) {				
			System.out.println(fruit+ " is present in the given array...");
			temp++;
			}
		}
			if(temp==0) {
				System.out.println(fruit+" is not found in the given array...");
			}
			
		}
	}


	
		
		
	
	


