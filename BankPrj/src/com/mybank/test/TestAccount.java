package com.mybank.test;
import com.mybank.domain.Account;

public class TestAccount{
	public static void main(String args[]){
		Account acc1 = new Account(100.0);
		acc1.deposit(47.0);
		acc1.withdraw(150.0);
		System.out.println("Final account balance is: " + acc1.getBalance());
	}
}