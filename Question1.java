//Esli Quest Esabu 24019733

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class Question1 {
    public static void main(String[] args) {
        // File operations can throw exceptions, so we wrap them in try/catch
        try {
            // Open the file for reading
            FileReader reader = new FileReader("story.txt");
            // Scannerize the reader so we can use familiar Scanner methods
            Scanner sc = new Scanner(reader);
 
            // Iterate through the file, one line at a time
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
 
            sc.close(); // always close the file when done
        } catch (IOException e) {
            // Handles the case where story.txt does not exist or can't be opened
            System.out.println("Could not find or read story.txt");
        }
    }
}