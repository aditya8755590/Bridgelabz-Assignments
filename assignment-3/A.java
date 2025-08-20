// Create two classes: A and B. Inside A, create a static variable x. In class B, change and print it.
public class A {
static int x=2000;

 class abc{
 }

 class abcd{
   A.x=500;
    }       
    public A() {        

 }
 public static void main(String[] args) {
    System.out.println("hii");
    A a = new A();
    A.abc a1 = a.new abc();
    A.abcd a2 = a.new abcd();
    System.out.println("Value of x: " + A.x);
    System.out.println("Class abc: " + a1.getClass().getName());
    System.out.println("Class abcd: " + a2.getClass().getName());
    System.out.println("Class A: " + a.getClass().getName());
    System.out.println("Class A's static variable x: " + A.x);  
 }

    
}
