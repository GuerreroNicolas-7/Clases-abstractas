// File: Main.java
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Call the method from the Animal abstract class
        myDog.makeSound(); // Output: Woof
        myDog.sleep();     // Output: Zzz

        // Call the methods from the Pet interface
        myDog.play();      // Output: The dog wags its tail and fetches the ball.
        myDog.beFriendly(); // Output: The dog licks your hand.

        System.out.println("---");

        // Using Polymorphism with Interfaces
        // You can treat the Dog object as a Pet
        Pet myPet = myDog;
        myPet.play(); // This works
        // myPet.makeSound(); // COMPILE ERROR! The 'Pet' reference type doesn't know about 'makeSound()'.
    }
}