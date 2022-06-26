package com.capg;

import java.util.Scanner;

class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String message) {
		super(message);
	}
	public InsufficientBalanceException() {
		super("Insufficient Balance in your savings account");
	}
}
class IllegalBankTransactionException extends RuntimeException{
	public IllegalBankTransactionException(String message) {
		super(message);
	}
	public IllegalBankTransactionException() {
		super("Amount entered cannot be less than zero");
	}
}
public class Banking {
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	
	System.out.print("PLease enter the amount : ");
	
	int amount =scan.nextInt();
	int balance =10000;
	try {
		if(amount>balance) {
			throw new InsufficientBalanceException();
		}
		else if(amount<0) {
			throw new IllegalBankTransactionException();
		}
		else {
		    balance=balance-amount;
		    System.out.println("Your Transaction is Successful!!!");
		}
	} 
	catch (InsufficientBalanceException e) {
		e.printStackTrace();
	}
	catch (IllegalBankTransactionException e) {
		e.printStackTrace();
	}
}
}