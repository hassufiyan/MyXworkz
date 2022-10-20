package com.xworkz.decision_making;

public class If_elseIfDemo {
	public static void main(String[] args) {
		int minBalance=2000;
		if(minBalance<2000) {
			System.out.println("insufficient balance,transaction failed");
		}
		else if(minBalance>2000) {
			System.out.println("Transaction successfull");
		}
		else {
			System.out.println("Invalid transaction");
			
		}
	}

}
