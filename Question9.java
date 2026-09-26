//Esli Quest Esabu 24019733

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class Question9 {
    public static void main(String[] args) {
        // Scanner for reading keyboard input (not file input) from the user
        Scanner keyboard = new Scanner(System.in);
 
        try {
            PrintWriter writer = new PrintWriter("results.txt");
 
            // Loop three times to collect three students' details
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter name for student " + i + ": ");
                String name = keyboard.nextLine();
 
                System.out.print("Enter score for student " + i + ": ");
                int score = keyboard.nextInt();
                keyboard.nextLine(); // consume the leftover newline after nextInt()
 
                // Write the pair as a single comma-separated line
                writer.println(name + "," + score);
            }
 
            writer.close();
            System.out.println("Results have been written to results.txt");
        } catch (IOException e) {
            System.out.println("Something went wrong while writing to results.txt");
        } finally {
            keyboard.close();
        }
    }
}