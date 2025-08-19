// Create a final variable inside a class. Try changing its value later. What error do you get?
public class que7 {

    final int year=2025;
    public static void main(String[] args) {
        que7 obj=new que7();
        //The final field que7.year cannot be assignedJava(33554512)
        //obj.year=2027;
        
    }
    
}