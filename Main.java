/**
Main.java

Functionality for testing Virtual Pet classes
*/
public class Main {
    public static void main(String[] args) {
        // Define starting pets
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Luna");
        Elephant elephant = new Elephant("Dumbo");

        // Print information about the pets
        System.out.println("Welcome to Virtual Pets! - Shaan");
        dog.bark();
        cat.meow();
        elephant.trumpet();

        dog.feed();
        cat.play();
        elephant.feed();

        dog.showStatus();
        cat.showStatus();
        elephant.showStatus();
    }
}
