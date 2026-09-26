//Esli Quest Esabu 24019733

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class Question6 {
    public static void main(String[] args) {
        try {
            // Source file (reading)
            FileReader reader = new FileReader("story.txt");
            Scanner sc = new Scanner(reader);
 
            // Destination file (writing)
            PrintWriter writer = new PrintWriter("story_copy.txt");
 
            // Read each line from the source and immediately write it to the destination
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                writer.println(line);
            }
 
            sc.close();
            writer.close();
            System.out.println("story.txt has been copied to story_copy.txt");
        } catch (IOException e) {
            System.out.println("Something went wrong while copying the file.");
        }
    }
}