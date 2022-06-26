package com.capg;

public class StringInsertion {
	
	public static void main(String[] args) {
		String s="It is used to at the specified index position";
		StringBuffer sb=new StringBuffer(s);
		System.out.println("Orignal String : "+s);
		sb.insert(13," insert text ");
		System.out.println("After insertion : "+sb.toString());
	}

}
