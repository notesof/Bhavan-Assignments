package com.capg;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the English Marks : ");
		int n = sc.nextInt();
		System.out.println("Enter the Science Marks : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the Maths Marks : ");
		int n2 = sc.nextInt();
		if (n > 60 && n1 > 60 && n2 > 60) {
			System.out.println("You are Passed!!!");
		} else if ((n > 60 && n1 > 60 && n2 <= 60) || (n1 > 60 && n2 > 60 && n <= 60)
				|| (n2 > 60 && n > 60 && n1 <= 60)) {
			System.out.println("Congrats you are promoted$$$");
		} else if ((n > 60 && n1 <= 60 && n2 <= 60) || (n1 > 60 && n <= 60 && n2 <= 60)
				|| (n2 > 60 && n <= 60 && n1 <= 60) || (n <= 60 && n1 <= 60 && n2 <= 60)) {
			System.out.println("You are Failed@@@");
		}
	}

}
