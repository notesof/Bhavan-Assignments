package com.capg;
import java.util.Scanner;

public class SimpleCompound {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Principal Amount : ");
		double principal=sc.nextDouble();
		System.out.println("Please Enter the Rate of Intrest : ");
		double rate=sc.nextDouble();
		System.out.println("Please Enter the time in Years : ");
		double time=sc.nextDouble();
		
		double si= (principal*rate*time)/100;
		System.out.println("Simple intrest is : "+si);
		double amount= principal*Math.pow((1+ rate/100),time);
		double ci=amount-principal;
		System.out.println("Compound intrest is : "+ci);
	}

}
