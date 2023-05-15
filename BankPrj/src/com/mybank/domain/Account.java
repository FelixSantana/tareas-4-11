package com.mybank.domain;

public class Account{
	protected double balance;
	
	public Account(double initBalance){
		balance = initBalance;
	}

	public boolean deposit(double amt){
		balance = balance + amt;
        return true;
	}
	
	public boolean withdraw(double amt){
        boolean result = true;
		if(amt <= balance){
			balance = balance - amt;
		}
        return result;
	}
		
	public double getBalance(){
        return balance;
	}
	
}