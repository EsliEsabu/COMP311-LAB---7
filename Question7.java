//Esli Quest Esabu 24019733

public class Question7 {
 
    // This method doubles its own local copy of "number".
    // It has no effect on the variable that was passed in from main().
    public static void tryToDouble(int number) {
        number = number * 2;
        System.out.println("Inside tryToDouble(): " + number);
    }
 
    public static void main(String[] args) {
        int myNumber = 10;
        System.out.println("Before calling tryToDouble(): " + myNumber);
 
        tryToDouble(myNumber);
 
        // myNumber is unchanged here because only a copy was passed in
        System.out.println("After calling tryToDouble(): " + myNumber);
    }
}
 