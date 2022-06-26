package com.capg;

import java.util.StringJoiner;

public class StringJoining {
	
	public static void main(String[] args) {
		StringJoiner s=new StringJoiner(" ");
		s.add("Hello");
		s.add("How are you?");
		System.out.println(s.toString());
		
	}

}
