// Abstract class
abstract class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void makeSound();

    // Concrete method
    void eat() {
        System.out.println(name + " is eating");
    }
}

// Concrete subclass
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Implementation of abstract method
    @Override
    void makeSound() {
        System.out.println(name + " says Woof");
    }
}

// Concrete subclass
class Cat extends Animal {
    // Constructor
    public Cat(String name) {
        super(name);
    }

    // Implementation of abstract method
    @Override
    void makeSound() {
        System.out.println(name + " says Meow");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        // Cannot instantiate abstract class
        // Animal animal = new Animal();  // Error: Cannot instantiate abstract class

        // Instantiate concrete subclasses
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Call concrete methods
        dog.eat();  // Output: Buddy is eating
        cat.eat();  // Output: Whiskers is eating

        // Call abstract methods
        dog.makeSound();  // Output: Buddy says Woof
        cat.makeSound();  // Output: Whiskers says Meow
    }
}

