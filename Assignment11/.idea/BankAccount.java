
public class BankAccount {
    //    Static:
//            ○       A static variable bankName is shared across all accounts.
//○       A static method getTotalAccounts() to display the total number of accounts.
//    This:
//            ○       Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
//            Final:
//            ○       Use a final variable accountNumber to ensure it cannot be changed once assigned.
//    Instanceof:
//            ○       Check if an account object is an instance of the BankAccount class before displaying its details.
    static String bankName="Punjab National Bank";
    private final String accountNumber;
    String AccountHolderName="";
    private static int totalAccount=0;
    private int balance =0;

    BankAccount(String accountNumber,String AccountHolderName){
        this.accountNumber=accountNumber;
        this.AccountHolderName=AccountHolderName;
        totalAccount++;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return AccountHolderName;
    }
    public void displayDetails(){
        if(this instanceof BankAccount){
            System.out.println("Account Number: "+accountNumber);
            System.out.println("Account Holder Name: "+AccountHolderName);
        }
       else{
            System.out.println("Not a valid Account");
        }
    }
    public int getBalance() {
        return balance;
    }
}
