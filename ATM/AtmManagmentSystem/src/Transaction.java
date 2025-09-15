import java.util.*;
public class Transaction {
	private static int counter = 2000;
	private int transactionId;
	private Date date;
	private double amount;
	private String type;
	 private double balanceAfterTransation;
	 public Transaction(double amount, String type,double balanceAfterTransation) {
	        this.transactionId = ++counter;
	        this.date = new Date();
	        this.amount = amount;
	        this.type = type;
	        this.balanceAfterTransation=balanceAfterTransation;
	    }
	 public int getTransactionId() { return transactionId; }
	    public Date getDate() { return date; }
	    public double getAmount() { return amount; }
	    public String getType() { return type; }
	    // in this we override the class of object
	    
	    @Override
	    public String toString() {
	        return "TxnID" + transactionId + " | " + type + " | Amount" + amount +" | Current Balance "+balanceAfterTransation+ " | Date" + date;
	    }


}
