package com.capg;

import java.util.Scanner;

public class IncomTax {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your ctc : ");
		int n=sc.nextInt();
		if(n<=180000) {
			System.out.println("Your Tax is Nil. ");
		}
		else if(n>180000 && n<=300000) {
			double tax1= n*0.1d;
			System.out.println(tax1);
		}
		else if(n>300000 && n<=500000) {
			double tax1=n*0.2d;
			System.out.println(tax1);
		}
		else if(n>500000 && n<=1000000) {
			double tax1=n*0.3d;
			System.out.println(tax1);
		}
	}

}
