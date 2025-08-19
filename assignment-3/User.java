//  Write a class User with a final instance variable userId. 
//Initialize it using a constructor.
public class User {
    final int userId;
    User(int value){
        userId=value;
    }
    public static void main(String[] args) {
        User obj=new User(10);
        User obj2=new User(100);
       // print the final keyword
       System.out.println(obj.userId);
       System.out.println(obj2.userId);
    }
    
}
