package com.mybank.domain;
import java.util.*;

public class Customer {
    private String firstName;
	private String lastName;
	private List<Account> accounts;
	
	public Customer(String f, String l){
		this.firstName = f;
		this.lastName = l;
		accounts = new ArrayList<>(10);
	}
	
	public void addAccount(Account acct){
		accounts.add(acct);
	}
	
	public int getNumOfAccounts(){
		return accounts.size();
	}

	public Account getAccount(int account_index){
		return accounts.get(account_index);
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
}
