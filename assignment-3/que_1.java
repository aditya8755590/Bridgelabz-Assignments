//Create a class Car with instance variables model and year. Create two car objects and display their details.
public class que_1 {
    // car class 
public static class car {
    String model;
    int year;
    car(String model,int year){
        this.model=model;
        this.year=year;
    }
    
}
public static void main(String[] args) {
    // que_1 thsi=new que_1();
    // que_1.car que_1 = new car(null, 0);
    car blero =new car("S24", 2017);
    car maruti =new car("G25", 2025);
     System.out.println(blero.model+" "+blero.year);
     System.out.println(maruti.model+" "+maruti.year);
    


}
}