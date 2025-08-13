//**Create
/* a class Car with instance variables brand and speed, and a static variable
wheels = 4.

Write a program to create 3 car objects with different brands and speeds,
and print their details.
Write
a program to prove that static variables are shared among all
objects.

Hint: Change the static variable through one object and print it from
another.
Create
a class Student with instance variables name and marks.

Add a method to calculate if the student passed (marks ≥ 40) or failed.  */

public class Car {
    int speed;
    String brand;
    static int wheels = 4;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    
    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h, Wheels: " + wheels);
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 120);
        Car car2 = new Car("Honda", 140);
        Car car3 = new Car("belero", 700);

        car1.displayDetails();
        car2.displayDetails();
       // Change static variable through car1
        car1.wheels = 5;
        car3.displayDetails(); // This will show the updated wheels count
        // checking the static variable change
        car2.displayDetails(); // This will also show the updated wheels count
    }
}
