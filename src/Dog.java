// File: Dog.java
// A Dog IS AN Animal (extends) and CAN ACT AS a Pet (implements).
public class Dog extends Animal implements Pet {

    // 1. Method required by the 'Animal' abstract class
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    // 2. Methods required by the 'Pet' interface
    @Override
    public void play() {
        System.out.println("The dog wags its tail and fetches the ball.");
    }

    @Override
    public void beFriendly() {
        System.out.println("The dog licks your hand.");
    }
}