//Esli Quest Esabu 24019733

import java.util.Scanner;
 
public class Question10 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Reading input from the user
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
 
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
 
        // Calling the static methods from the Rectangle class
        double area = Rectangle.area(length, width);
        double perimeter = Rectangle.perimeter(length, width);
 
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
 
        scanner.close();
    }
}
 
// Rectangle class containing two static utility methods
class Rectangle {
 
    // Static method to calculate the area of a rectangle
    public static double area(double length, double width) {
        return length * width;
    }
 
    // Static method to calculate the perimeter of a rectangle
    public static double perimeter(double length, double width) {
        return 2 * (length + width);
    }
}
 