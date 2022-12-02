package com.xworkz.exception.exceptionprogramms.Custom_exceptions.compiletimeexception;

public class SuprDailyOnlineStore {

	Product[] products= {new Product("Bat",500.00),
			new Product("Bowl",100.00),
			new Product("Gloves",300.00),
			new Product("Helmet",600.00)};
	
	
		void search(Product product) throws SuprDailyException   {	
			
			
			boolean isProduct=false;
			for(int i=0;i<products.length;i++) {
				if(products[i].equals(product)){
					isProduct=true;
				}
			}
		if(isProduct) {
			System.out.println("Product found..");
			
		}
		else {
			       
			throw new SuprDailyException();
			
		}
	}
	
	
}
