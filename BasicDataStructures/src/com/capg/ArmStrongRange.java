package com.capg;

public class ArmStrongRange {
	public static void main(String[] args) {
		for (int start = 100, end = 999; start <= end; start++) {
			int n = start;
			int temp = n;
			int sum = 0;
			while (n != 0) {
				int digit = n % 10;
				sum = sum + (digit * digit * digit);
				n /= 10;
			}
			if (sum == temp) {
				System.out.println("Armstrong Number " + temp);
			}
		}

	}

}
