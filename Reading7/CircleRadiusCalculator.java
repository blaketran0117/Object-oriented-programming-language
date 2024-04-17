import java.util.Scanner;

public class CircleRadiusCalculator {
   public static double getArea(Scanner scnr) throws Exception {
      double circleArea;

      System.out.print("Enter area: ");

      circleArea = scnr.nextDouble();

      if (circleArea < 0) {
         throw new Exception("Invalid area");
      }

      return circleArea;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double circleArea;
      double circleRadius;

      try {
         circleArea = getArea(scnr);
         circleRadius = Math.sqrt(circleArea / Math.PI);
         System.out.println(circleRadius);
      }
      catch (Exception excpt) {
         System.out.println(excpt.getMessage());
      }
   }
}
