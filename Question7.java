//Esli Quest Esabu 24019733

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 
public class Question7 {
    public static void main(String[] args) {
        try {
            // The second argument, true, tells FileWriter to APPEND
            // instead of overwriting the existing file
            FileWriter fw = new FileWriter("output.txt", true);
            PrintWriter writer = new PrintWriter(fw);
 
            writer.println("This is an appended sixth line.");
            writer.println("This is an appended seventh line.");
 
            writer.close();
            System.out.println("Two new lines were appended to output.txt");
        } catch (IOException e) {
            System.out.println("Something went wrong while appending to output.txt");
        }
    }
}
 