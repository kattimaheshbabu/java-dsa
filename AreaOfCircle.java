import java.util.Scanner;

public class AreaOfCircle {
   public AreaOfCircle() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the radius of the circle: ");
      double var2 = var1.nextDouble();
      double var4 = Math.PI * var2 * var2;
      System.out.println("Area of the circle is: " + var4);
      var1.close();
   }
}
