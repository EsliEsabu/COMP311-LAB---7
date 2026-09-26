//Esli Quest Esabu 24019733

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class Question5 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("story.txt");
            Scanner sc = new Scanner(reader);
 
            int wordCount = 0;
 
            // hasNext()/next() read one word at a time, splitting on whitespace,
            // which is different from hasNextLine()/nextLine()
            while (sc.hasNext()) {
                sc.next();
                wordCount++;
            }
 
            sc.close();
            System.out.println("story.txt contains " + wordCount + " words.");
        } catch (IOException e) {
            System.out.println("Could not read story.txt");
        }
    }
}
 