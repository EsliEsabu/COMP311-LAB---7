//Esli Quest Esabu 24019733

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class Question8 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("numbers.txt");
            Scanner sc = new Scanner(reader);
 
            int total = 0;
 
            // hasNextInt()/nextInt() let us read only integers from the file
            while (sc.hasNextInt()) {
                total += sc.nextInt();
            }
 
            sc.close();
            System.out.println("The total of all numbers in numbers.txt is: " + total);
        } catch (IOException e) {
            System.out.println("Could not read numbers.txt");
        }
    }
}
 