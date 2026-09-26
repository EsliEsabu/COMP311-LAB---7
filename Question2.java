//Esli Quest Esabu 24019733

import java.io.IOException;
import java.io.PrintWriter;
 
public class Question2 {
    public static void main(String[] args) {
        try {
            // Opens (or creates) output.txt for writing
            PrintWriter writer = new PrintWriter("output.txt");
 
            // println() works the same way as System.out.println(), but writes to the file
            writer.println("This is the first line.");
            writer.println("This is the second line.");
            writer.println("This is the third line.");
            writer.println("This is the fourth line.");
            writer.println("This is the fifth line.");
 
            writer.close(); // must close the file so the data is actually saved
            System.out.println("Successfully wrote 5 lines to output.txt");
        } catch (IOException e) {
            System.out.println("Something went wrong while writing to output.txt");
        }
    }
}
 