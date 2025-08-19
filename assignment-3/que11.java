//. Declare a class variable (static) without initialization. 
//Print its default value. Then assign and print again.
public class que11 {
    static String  name;
    public static void main(String[] args) {
        // it shows null
        System.out.println(name);
        name="aditya";
        System.out.println(name);
    }

}
