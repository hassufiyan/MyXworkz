package com.xworkz.string_class;

public class StringClass_Methods {
	public static void main(String[] args) {
		String sr = "Dumbelling  ";
		String sr1 = " Iron Plates Dumbelling";
		String sr2 = "gymnastics";

		System.out.println(sr.charAt(3));// shows the char at particular index..
		System.out.println(sr.hashCode());// hashcode of string..
		System.out.println(sr2.compareTo(sr));
		System.out.println(sr1.compareTo(sr));
		System.out.println(sr1.compareToIgnoreCase(sr2));
		System.out.println(sr2.concat(sr1));
		System.out.println(sr2.contains(sr));//
		System.out.println(sr2.contentEquals(sr));// false
		System.out.println(sr.endsWith(sr));// true       
		System.out.println(sr.equals(sr1));// false
		System.out.println(sr2.equalsIgnoreCase(sr));
		System.out.println(sr.isEmpty());
		System.out.println(sr.regionMatches(false, 0, sr2, 0, 0));// compares the substrings of sr and sr2 ignoring the
																	// length of strib=ngs,if gthey are sane type it
																	// returns true..
		System.out.println(sr.matches(sr1));// false
		System.out.println(sr.replace('D', 'e'));// here 'D' is replaced by 'e'...
		System.out.println(sr.startsWith(sr2));// false
		System.out.println(sr.intern());// "Dumbelling"
		System.out.println(sr.substring(3));
		System.out.println(sr.toLowerCase());// converts all strings of sr to lowercase
		System.out.println(sr.trim());
		System.out.println(sr.getBytes());
		System.out.println(sr.chars());

	}

}
