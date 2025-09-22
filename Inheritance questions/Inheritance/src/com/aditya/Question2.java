package com.aditya;

public class Question2 {
	public static void main(String[] args ){
		order o1 = new order();
		o1.orderDate="19-jan";
		o1.orderId=255532;
		System.out.println(o1.getOrderStatus());
		System.out.println(o1.orderDate);
		System.out.println(o1.orderId);
		
		
		// just like we make others  also do others
		
		shippedOrder s1=new shippedOrder();
		s1.trackingNumber=" ye abi pakistan mai hai ";
		// we make anothere aslo
		deliveredOrder d1=new deliveredOrder();
		d1.deliveryDate="20-jan";
				
		
		 SavingsAccount saving1 = new SavingsAccount(101, 50.0, 5.5);
	        CheckingAccount chacking1 = new CheckingAccount(102, 20.0, 3);
	        FixedDepositAccount fixed1 = new FixedDepositAccount(103, 100.0, 12);

	        saving1.displayAccountType();
	        chacking1.displayAccountType();
	        fixed1.displayAccountType();
		
		
		
		
	}


}
class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accNo, double bal){
        this.accountNumber = accNo;
        this.balance = bal;
    }

    void displayAccountType(){
        System.out.println("This bank account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accNo, double bal, double rate){
        super(accNo, bal);
        this.interestRate = rate;
    }

    void displayAccountType(){
        System.out.println("intrest rate " + interestRate);
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(int accNo, double bal, int limit){
        super(accNo, bal);
        this.withdrawalLimit = limit;
    }

    void displayAccountType(){
        System.out.println(withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int durationMonths;

    FixedDepositAccount(int accNo, double bal, int months){
        super(accNo, bal);
        this.durationMonths = months;
    }

    void displayAccountType(){
        System.out.println("fixed deposit for  " + durationMonths + " months");
    }
}

class order {
    int orderId;
    String orderDate;
   
    
    String getOrderStatus() {
        return "Order placed";
    }
}

class shippedOrder extends order {
    String trackingNumber;

    String getOrderStatus() {
        return "Order Shipped with Tracking: " + trackingNumber;
    }
}

class deliveredOrder extends shippedOrder {
    String deliveryDate;

    String getOrderStatus() {
        return "Order Delivered on: " + deliveryDate;
    }
}

