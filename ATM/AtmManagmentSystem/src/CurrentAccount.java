class CurrentAccount extends Account {
    public CurrentAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds");
            return false;
        }
    }
}