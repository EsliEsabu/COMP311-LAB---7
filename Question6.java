//Esli Quest Esabu 24019733

public class Question6 {
 
    public static void main(String[] args) {
        // Static method is called using the class name - no object needed
        int sum = Calculator.add(4, 5);
        System.out.println("4 + 5 = " + sum);
 
        // Instance method requires creating an object first
        Calculator calc = new Calculator();
        int product1 = calc.multiply(3, 6);
        int product2 = calc.multiply(2, 2);
 
        System.out.println("3 * 6 = " + product1);
        System.out.println("2 * 2 = " + product2);
        System.out.println("multiply() was called " + calc.getCallCount() + " times");
    }
}
 
// Calculator class containing both a static and an instance method
class Calculator {
 
    // Private instance field - belongs to each object, not the class itself
    private int callCount = 0;
 
    // Static method - performs addition, does not depend on any object state
    public static int add(int a, int b) {
        return a + b;
    }
 
    // Instance method - uses and updates the instance field callCount
    public int multiply(int a, int b) {
        callCount++; // increment every time this method is called
        return a * b;
    }
 
    // Helper instance method to check how many times multiply() has run
    public int getCallCount() {
        return callCount;
    }
}