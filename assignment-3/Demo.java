//Create a class Demo where you declare a local variable with the same name as an instance variable. 
//Use this keyword to differentiate.

public class Demo {
    // instance variable
    String name;

    Demo(String name){
        // diffrinciate local and reference 
        this.name=name;
    }

public static void main(String[] args) {
    Demo object= new Demo("aditya");
     System.out.println(object.name);

    
}
}