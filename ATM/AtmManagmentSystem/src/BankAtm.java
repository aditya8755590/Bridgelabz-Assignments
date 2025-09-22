import java.util.*;
class BankAtm extends Atm implements TransactionLogger {
	
    public BankAtm(String location, String machineId) {
		super(location, machineId);
	}

	private List<Transaction> transactions = new ArrayList<>();

    @Override
    public void withdraw(Account account, double amount) {
        boolean success = false;
        if (account instanceof SavingAccount) {
            success = ((SavingAccount) account).withdraw(amount);
        } else if (account instanceof CurrentAccount) {
            success = ((CurrentAccount) account).withdraw(amount);
        }

        if (success) {
            Transaction t = new Transaction(amount, "Withdraw",account.getBalance());
            transactions.add(t);
            logTransation(t);
        }
    }
    @Override
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        Transaction t = new Transaction(amount, "Deposit",account.getBalance());
        transactions.add(t);
        logTransation(t);
    }


    @Override
    public void logTransation(Transaction transaction) {
        System.out.println("Transaction Logged: " + transaction);
    }

    public void showTransactions() {
        System.out.println("\n--Transaction History ---");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}

