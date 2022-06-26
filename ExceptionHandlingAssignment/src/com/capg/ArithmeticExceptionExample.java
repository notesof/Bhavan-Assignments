package com.capg;

import java.util.Scanner;

class UnSupportedOperationException extends Exception{
	
	public UnSupportedOperationException(String message) {
		super(message);
	}
	
	public UnSupportedOperationException() {
		System.out.println("Number cannot divide by 0");
	}
}

public class ArithmeticExceptionExample extends UnSupportedOperationException {
	
	
	int b=0;

	
	public static void main(String[] args) {
    	int a=100,b=0;
    	int c;
	try {
		 c=(a/b);
	} 
	catch (ArithmeticException e) {
		System.out.println("Invalid operation");
	}
  }
}
