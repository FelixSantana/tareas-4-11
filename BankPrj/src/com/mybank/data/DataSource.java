package com.mybank.data;
import com.mybank.domain.*;
import java.io.*;
import java.util.Scanner;

public class DataSource {
  private File dataFile;

  public DataSource(String dataFilePath) {
    this.dataFile = new File(dataFilePath);
  }

  public void loadData() throws IOException {
    Scanner input = new Scanner(dataFile);
    Customer customer;
    int numOfCustomers = input.nextInt();
    for (int idx = 0; idx < numOfCustomers; idx++) {
      String firstName = input.next();
      String lastName = input.next();
      Bank.addCustomer(firstName, lastName);
      customer = Bank.getCustomer(idx);
      int numOfAccounts = input.nextInt();
      while (numOfAccounts-- > 0) {
        char accountType = input.next().charAt(0);
        switch (accountType) {
          case 'S': {
            float initBalance = input.nextFloat();
            float interestRate = input.nextFloat();
            customer.addAccount(new SavingsAccount(initBalance,
                interestRate));
            break;
          }
          // Checking account
          case 'C': {
            float initBalance = input.nextFloat();
            float overdraftProtection = input.nextFloat();
            customer.addAccount(new CheckingAccount(initBalance, overdraftProtection));
            break;
          }
        }
      }
    }
    input.close();
  }
}
