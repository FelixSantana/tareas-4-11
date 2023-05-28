package com.mybank.domain;

public class Account{
	protected double balance;
	
	protected Account(double initBalance){
		balance = initBalance;
	}

	public void deposit(double amt){
		balance = balance + amt;
	}
	
	public void withdraw(double amt) throws OverdraftException{
		if(amt <= balance){
			balance = balance - amt;
		}else{
			throw new OverdraftException("Insufficent funds", amt - balance);
		}
	}
		
	public double getBalance(){
        return balance;
	}
	
}