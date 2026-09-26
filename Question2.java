//Esli Quest Esabu 24019733

public class Question2 {

    // Static method that calculates and returns the area of a circle.
    // Formula: area = pi * radius^2
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Calling circleArea() with two different radius values
        double area1 = circleArea(2.0);
        double area2 = circleArea(5.5);

        System.out.println("Area of circle with radius 2.0: " + area1);
        System.out.println("Area of circle with radius 5.5: " + area2);
    }
}