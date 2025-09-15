
public abstract class Atm {
	String location;
	String machineId;
	
	  public Atm(String location, String machineId) {
	        this.location = location;
	        this.machineId = machineId;
	    }

	    public abstract void withdraw(Account account, double amount);
	    public abstract void deposit(Account account, double amount);
	    
	    public void checkBalance(Account account) {
	        System.out.println("Balance: " + account.getBalance());
	    }
	    
}
