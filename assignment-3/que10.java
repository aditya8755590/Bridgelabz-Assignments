// 10. Create a class that uses all three types of variables:
// Instance variable
// Static variable
// Local variable
// Print all of them in a method.

public class que10 {
    String model;// instance variable
    static int year  = 2023; 
    que10(String model, int year) {
        this.model = model;
        this.year = year;
    }
    void print(){
        // Local variable
        String local = "ye local variable hai";
        System.out.println(local);
    }

    public static void main(String[] args) {
        que10 car = new que10("Toyota", 2023);
        System.out.println(car.model+""+"thsi is an static variable "+year);
        car.print();
    }   
}
