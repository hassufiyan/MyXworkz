package com.xworkz.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add('e');
	list.add("str");
	list.add(2);
	list.add(null);
	//System.out.println(list);
	ArrayList list1=new ArrayList();
	list1.add(list);
	list.add(4);
	System.out.println(list1);	
	list.add('j');	
	System.out.println(list1.containsAll(list));	
	list.clear();	
		
	}

}
