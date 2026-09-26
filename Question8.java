//Esli Quest Esabu 24019733

public class Question8 {
 
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.speak();
 
        // Cat is a subclass of Animal - its speak() overrides the parent's version
        Cat myCat = new Cat();
        myCat.speak();
 
        // Polymorphism: even though the reference type is Animal,
        // Java calls Cat's overridden version at run time
        Animal polymorphicAnimal = new Cat();
        polymorphicAnimal.speak();
    }
}
 
// Parent class with a generic speak() method
class Animal {
    public void speak() {
        System.out.println("The animal makes a generic sound.");
    }
}
 
// Subclass that overrides speak() with cat-specific behaviour
class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("The cat says: Meow!");
    }
}
 