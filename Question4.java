//Esli Quest Esabu 24019733


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class Question4 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("story.txt");
            Scanner sc = new Scanner(reader);
 
            int lineCount = 0;
 
            // Every time we successfully read a line, increase the counter
            while (sc.hasNextLine()) {
                sc.nextLine();
                lineCount++;
            }
 
            sc.close();
            System.out.println("story.txt contains " + lineCount + " lines.");
        } catch (IOException e) {
            System.out.println("Could not read story.txt");
        }
    }
}
 
 