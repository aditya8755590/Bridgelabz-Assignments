//Create a method inside a class that declares a local variable. Try printing it outside the method. What happens?
class que2{
   int local;

   public void method(){
    local = 5;
   }
   public static void main(String[] args) {
    que2 object=new que2();
    object.method();
    // assign a new value
    object.local=7;
    System.out.println(object.local);
   }
}
