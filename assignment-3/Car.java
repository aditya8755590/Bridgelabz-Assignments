public class Car {
   String model;
   int year;

   Car(String var1, int var2) {
      this.model = var1;
      this.year = var2;
   }

   public static void main(String[] var0) {
      Car var1 = new Car("S24", 2017);
      Car var2 = new Car("G25", 2025);
      System.out.println(var1.model + " " + var1.year);
      System.out.println(var2.model + " " + var2.year);
   }
}
