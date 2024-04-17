import java.util.InputMismatchException;


public static int sumFile(String file) throws FileNotFoundException, InputMismatchException {
    FileInputStream inStrm = new FileInputStream(fileName);
    Scanner fileScnr = new Scanner(inStrm);
    int numValues = fileScnr.nextInt();
    int sumVal = 0;
 
    for (int i = 0; i < numValues; ++i) {
       sumVal += fileScnr.nextInt();
    }
 
    return sumVal;
 }
 
 public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String fileName;
    int sumVal;
 
    fileName = scnr.next();
 
    try {
       sumVal = sumFile(fileName);
       System.out.println(sumVal);
    }
    catch (FileNotFoundException excpt) {
       System.out.println(excpt.getMessage());
    }
 }
 