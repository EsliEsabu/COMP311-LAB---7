//Esli Quest Esabu 24019733

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class Question10 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("results.txt");
            Scanner sc = new Scanner(reader);
            PrintWriter writer = new PrintWriter("passed.txt");
 
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
 
                // Split "Name,Score" into its two parts using the comma
                String[] parts = line.split(",");
                String name = parts[0];
                int score = Integer.parseInt(parts[1].trim());
 
                // Only write the student to passed.txt if they scored 50 or above
                if (score >= 50) {
                    writer.println(name + "," + score);
                }
            }
 
            sc.close();
            writer.close();
            System.out.println("Passing students have been written to passed.txt");
        } catch (IOException e) {
            System.out.println("Something went wrong while processing the files.");
        }
    }
}
 