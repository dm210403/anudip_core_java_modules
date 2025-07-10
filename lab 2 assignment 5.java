/* 2.Create a superclass Animal with a method makeSound(). Create two subclasses Dog and Cat that override the method. */

// Superclass
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating objects of each class
        Animal myAnimal = new Animal();  // Animal object
        Dog myDog = new Dog();           // Dog object
        Cat myCat = new Cat();           // Cat object

        // Calling makeSound() on each
        myAnimal.makeSound();  // Output: Animal makes a sound
        myDog.makeSound();     // Output: Dog barks: Woof Woof
        myCat.makeSound();     // Output: Cat meows: Meow Meow
    }
}


/* Output :
	Animal makes a sound
	Dog barks: Woof Woof
	Cat meows: Meow Meow */

