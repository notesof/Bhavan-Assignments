package com.capg;

public class StringOperations {
	
	public static void main(String[] args) {
		
		String str="Java String pool consists of collection of Strings which are stored in heap memory";
		
		System.out.println(str.toLowerCase());
		
		System.out.println("-----------------------");
		
		System.out.println(str.toUpperCase());
		
		System.out.println("------------------------");
		
		System.out.println(str.contains("collection"));
		
		System.out.println("-------------------------");
		
		String str2="java string pool consists of collection of strings which are stored in heap memory";
		
		System.out.println("-------------------");
		
		System.out.println(str.equals(str2));
		
		System.out.println(str.replace('a', '$'));
				
		
		
	}

}
