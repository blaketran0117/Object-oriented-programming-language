import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;


public class CountingWords{
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        FileInputStream fileByteStream = null;
        Scanner inFS= null;
        String userWord, currWord;
        int wordFreq = 0;

        System.out.println("Opening file wordFile.txt.txt");
        fileByteStream = new FileInputStream("wordFile.txt");
        inFS = new Scanner(fileByteStream);

        System.out.print("Enter a word: ");
        userWord = scnr.next();
        while (inFS.hasNext()){
            currWord = inFS.next();
            if(currWord.equals(userWord)){
                ++wordFreq;
            }
        }
        
        System.out.println(userWord + " appears in the file " +
                            wordFreq + " times.");

        fileByteStream.close();

    }
}