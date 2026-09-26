//Esli Quest Esabu 24019733

public class Question5 {
 
    // Version 1: only a name is given
    public static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }
 
    // Version 2: name and age are given
    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
 
    public static void main(String[] args) {
        // Calling the single-parameter version
        displayInfo("Amantle");
 
        // Calling the two-parameter version
        displayInfo("Kagiso", 21);
    }
}
 