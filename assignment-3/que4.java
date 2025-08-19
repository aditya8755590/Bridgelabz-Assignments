// Write a program where you modify a static variable using one object,
// and access it from another object. Show how it reflects the change.
public class que4 {
    static int count = 0;
    public static void main(String[] args) {
        que4 obj1 = new que4();
        obj1.count = 5;

        que4 obj2 = new que4();
        obj2.count=20;
        System.out.println("Value of count " + obj1.count);
           System.out.println("Value of count of 2nd object " + obj2.count);

}}
