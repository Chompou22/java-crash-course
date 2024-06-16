// Normal Interface
interface Animal {
    void makeSound();
    void eat();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof");
    }

    public void eat() {
        System.out.println("Eating bones");
    }
}


public class NormalInterface {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog dog = new Dog();

        // Calling methods
        dog.makeSound();  // Output: Woof
        dog.eat();        // Output: Eating bones
    }
}
