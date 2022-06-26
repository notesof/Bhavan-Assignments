package com.capg;

public class StringBufferExample {
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("String Buffer");
		System.out.println("Before appending : "+sb);
		sb.append(" is a peer class of string");
		System.out.println("After append : "+sb);
		sb.append(" that provides much of");
		System.out.println(sb);
		sb.append(" the functionality of string");
		System.out.println(sb);
	}

}
