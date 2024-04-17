import java.util.Scanner;

public class DensityCalculator {
   public static double getDensity(Scanner scnr) throws Exception {
      double massVal = scnr.nextDouble();
      double volumeVal = scnr.nextDouble();
      double densityCalc = massVal / volumeVal;

      if (Double.isNaN(densityCalc)) {
         throw new Exception("densityCalc is NaN");
      }

      return densityCalc;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double densityCalc = 0.0;

      try {
         densityCalc = getDensity(scnr);
         System.out.println("Density: " + densityCalc);
      }
      catch (Exception excpt) {
         // Programmer only intended to handle NaN Exception.
         // Catch block catches ALL exceptions.
      }
   }
}