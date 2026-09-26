//Esli Quest Esabu 24019733


public class Question4 {

    // Version 1: combines two ints by adding them
    public static int combine(int a, int b) {
        return a + b;
    }

    // Version 2: combines two Strings by joining (concatenating) them
    public static String combine(String a, String b) {
        return a + b;
    }

    // Version 3: combines two doubles by adding them
    public static double combine(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // The compiler picks the correct version based on the argument types
        int intResult = combine(3, 4);
        String stringResult = combine("Hello, ", "World!");
        double doubleResult = combine(2.5, 3.5);

        System.out.println("combine(int, int) = " + intResult);
        System.out.println("combine(String, String) = " + stringResult);
        System.out.println("combine(double, double) = " + doubleResult);
    }
}