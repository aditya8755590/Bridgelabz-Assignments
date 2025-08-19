//Create a class Account with instance variables: accountHolder, balance. 
//Use default values. Print them without setting any values.
public class Account {
String accountHolder="aditya";
int balance=2700;
public static void main(String[] args) {
    Account obj= new Account();
    System.out.println(obj.accountHolder+".   "+obj.balance);
}
    
}