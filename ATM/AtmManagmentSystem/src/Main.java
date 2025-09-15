
public class Main {
    public static void main(String[] args) {
    	 Atm atm = new BankAtm("Mursan", "INDIA-1");
    	 Account acc1 = new SavingAccount("S1001", "Aditya", 2000);
         Account acc2 = new CurrentAccount("C1002", "Rahul", 5000);
    	 
         atm.checkBalance(acc1);
         atm.withdraw(acc1, 10); // should fail because min balance reached 
         atm.withdraw(acc1, 1000); // success
         atm.deposit(acc1, 500);

         atm.checkBalance(acc2);
         atm.withdraw(acc2, 4800);//success
         atm.deposit(acc2, 2000);

         ((BankAtm) atm).showTransactions(); // show all transactions
    }
}