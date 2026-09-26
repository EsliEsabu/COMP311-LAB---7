//Esli Quest Esabu 24019733

public class Question3 {

    // void method: performs an action (printing) but returns nothing
    public static void printBanner() {
        System.out.println("=== Welcome to COMP311 ===");
    }

    // Returning method: builds the same text and returns it as a String,
    // leaving it up to the caller to decide what to do with it
    public static String getBanner() {
        return "=== Welcome to COMP311 ===";
    }

    public static void main(String[] args) {
        // Calling the void method - it prints on its own line
        printBanner();

        // Calling the returning method - we must store or use the result ourselves
        String banner = getBanner();
        System.out.println("Banner stored in a variable: " + banner);
    }
}