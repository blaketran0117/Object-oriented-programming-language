import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class HTMLFileWriteSample{
    static void writeHTMLFile(PrintWriter printer, String innerHTML){
        printer.println("<!DOCTYPE html>");
        printer.println("<html>");
        printer.println(" <body>");
        printer.println("   <p>" + innerHTML + "</p>");
        printer.println(" </body>");
        printer.println("</html>");
    }

    public static void main(String[] args) throws IOException{
        FileOutputStream fileStream = new FileOutputStream("simple.html");
        PrintWriter filePrinter = new PrintWriter(fileStream);

        writeHTMLFile(filePrinter, "Hello <b>HTML</b> world!");
        filePrinter.close();

        PrintWriter systemOutPrinter = new PrintWriter(System.out);
        writeHTMLFile(systemOutPrinter, "Hello <b> HTML </b> world!");
        systemOutPrinter.close();
    }
}
