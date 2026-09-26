//Esli Quest Esabu 24019733

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class Question3 {
    public static void main(String[] args) {
        try {
            // This file is not expected to exist - it will trigger an exception
            FileReader reader = new FileReader("missing.txt");
            Scanner sc = new Scanner(reader);
 
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
 
            sc.close();
        } catch (IOException e) {
            // The try/catch block gives us control over what happens on failure,
            // so we print a friendly message instead of crashing
            System.out.println("Sorry, the file 'missing.txt' could not be found.");
        }
    }
}
 