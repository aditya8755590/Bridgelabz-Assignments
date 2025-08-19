//Add a static variable numberOfCars in the Car class from Q1 to count how many objects have been created.
public class Car_2 {
    String model;
    int year;
    static int numberOfCars = 0;

    Car_2(String model, int year) {
        this.model = model;
        this.year = year;
        numberOfCars++;
    }

    public static void main(String[] args) {
        Car_2 blero = new Car_2("S24", 2017);
        Car_2 maruti = new Car_2("G25", 2025);
        System.out.println(blero.model + " " + blero.year);
        System.out.println(maruti.model + " " + maruti.year);
        System.out.println("Total number of cars created: " + Car_2.numberOfCars);
    }
    }