package com.xworkz.arrays.multi_dimensional_array;

public class MultiDimensionalArrayDemo1 {
	public static void main(String[] args) {
	
		int[][] arr=new int[3][3];
		
		int num=10;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=num;
				num=num+10;
			}
		}
			
			
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if((i==0 & j==0)||(i==1 &j==1)||(i==2 & j==2)||(i==0 & j==2)||(i==2 & j==0)) {
				System.out.print("*"+" ");
			}
			else {
		System.out.print(arr[i][j]+" ");
		}
		}
		System.out.println();
	}
	}
}

			
	


