//Esli Quest Esabu 24019733

public class Question1 {

    // Static method: takes an int parameter and returns true/false
    // depending on whether it is even.
    public static boolean isEven(int n) {
        // A number is even if there is no remainder when divided by 2
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        // Calling isEven() a few times from main with different values
        System.out.println("Is 4 even? " + isEven(4));
        System.out.println("Is 7 even? " + isEven(7));
        System.out.println("Is 0 even? " + isEven(0));
        System.out.println("Is -6 even? " + isEven(-6));
    }
}