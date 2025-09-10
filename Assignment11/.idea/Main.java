package Assignment11;

import Assignment11.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("1231213", "aditya");
        a.displayDetails();
        a.deposit(5000);
        a.withdraw(2000);
        a.displayDetails();
        Vehicle v = new Vehicle("DL-1234", "Aditya", "Car");
        v.displayDetails();
        Vehicle.updateRegistrationFee(600);
        v.displayDetails();
        Student s = new Student(1, "Aditya", "A");
        s.displayDetails();
        Student.displayTotalStudents();

        Student s2 = new Student(2, "Rahul", "B");
        s2.displayDetails();
        Student.displayTotalStudents();
        
    
    }
}