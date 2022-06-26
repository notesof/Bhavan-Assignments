package com.capg;

public class ArithmeticExceptionChecking {
	
	public static void main(String[] args) {
		int a=0,b=10;
		int c;
		try {
			c=b/a;
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("Arithmetic Exception Handled");
		}
	}

}
