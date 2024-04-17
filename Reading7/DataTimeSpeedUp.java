import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataTimeSpeedup {
   public static double calcAvgInputVal(Scanner scnr) throws Exception {
      double sumVal = 0;
      int numValues = scnr.nextInt();

      if (numValues < 0) {
         throw new Exception("Negative number of values");
      }

      for (int i = 0; i < numValues; ++i) {
         sumVal += scnr.nextDouble();
      }

      return sumVal / (double) numValues;
   }

   public static double calcAvgSpeedup(String file1, String file2) throws FileNotFoundException, Exception {
      FileInputStream inStream1 = new FileInputStream(file1);
      FileInputStream inStream2 = new FileInputStream(file2);
      Scanner fileScnr1 = new Scanner(inStream1);
      Scanner fileScnr2 = new Scanner(inStream2);

      double file1Avg = calcAvgInputVal(fileScnr1);
      double file2Avg = calcAvgInputVal(fileScnr2);

      return file2Avg / file1Avg;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String file1;
      String file2;
      double avgSpeedup;
      boolean retry = true;

      while (retry) {
         System.out.print("Enter data file names: ");
         file1 = scnr.next();
         file2 = scnr.next();

         try {
            avgSpeedup = calcAvgSpeedup(file1, file2);
            retry = false;

            System.out.println("Speedup: " + avgSpeedup);
         }
         catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
            retry = true;
         }
         catch (Exception exception) {
            System.out.println(exception.getMessage());
            retry = false;
         }
      }
   }
}
