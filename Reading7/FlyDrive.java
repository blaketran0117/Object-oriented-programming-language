import java.util.Scanner;

public class FlyDrive {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        double miles;
        double hoursFly;
        double hoursDrive;

        System.out.print("Enter a distance in miles:");
        miles = scnr.nextDouble();
        hoursFly = miles / 500.0;
        hoursDrive= miles/60.0;

        System.out.printf("%.2f miles would take:\n " , miles);
        System.out.printf("%.2f hours to fly\n ", hoursFly);
        System.out.printf("%.2f hours to drive\n", hoursDrive);
    }
}
