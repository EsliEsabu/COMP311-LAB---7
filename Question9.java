//Esli Quest Esabu 24019733

public class Question9 {
 
    public static void main(String[] args) {
        Shape shape = new Shape();
 
        // Overloading in action - same method name, different parameter lists
        shape.describe();
        shape.describe("a generic 2D figure");
 
        // Overriding in action - Circle provides its own version of area()
        Circle circle = new Circle(3.0);
        System.out.println("Shape area (default): " + shape.area());
        System.out.println("Circle area (overridden): " + circle.area());
    }
}
 
// Parent class containing two overloaded "describe" methods
class Shape {
 
    // Overload 1: no parameters, prints a default description
    public void describe() {
        System.out.println("This is a shape.");
    }
 
    // Overload 2: takes a String parameter for a custom description
    public void describe(String details) {
        System.out.println("This is a shape: " + details);
    }
 
    // A method that subclasses can override
    public double area() {
        return 0.0; // no area defined for a generic shape
    }
}
 
// Subclass that overrides area() to provide circle-specific behaviour
class Circle extends Shape {
    private double radius;
 
    public Circle(double radius) {
        this.radius = radius;
    }
 
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}