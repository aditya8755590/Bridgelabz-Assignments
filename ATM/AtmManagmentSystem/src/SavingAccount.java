
public class SavingAccount extends Account{
	  private static final double min = 500;
	  public SavingAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}


	
	    public boolean withdraw(double amount) {
	        if (balance - amount >=min) {
	            balance -= amount;
	            return true;
	        } else {
	            System.out.println("Minimum balanced reached ");
	            return false;
	        }
	    }
	
}
