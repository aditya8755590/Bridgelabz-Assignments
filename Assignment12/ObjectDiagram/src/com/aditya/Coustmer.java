package com.aditya;
// Problem 2: Bank and Account Holders (Association)
// Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts, and each account is linked to a Bank.
// Tasks:
// Define a Bank class and a Customer class.
// Use an association relationship to show that each customer has an account in a bank.
// Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
// Goal: Illustrate association by setting up a relationship between customers and the bank.

public class Coustmer {
    private String name;
    // for one time inslization only we use final keyword
    final private String accountNumber;
    private double balance;
    private Bank bank;
    public Coustmer(String name, String accountNumber, double balance, Bank bank) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }
    public String getName() {
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public Bank getBank() {
        return bank;
    }

}
