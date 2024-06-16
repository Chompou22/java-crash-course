class Animal {
    void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

public class TestOverride {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal myDog = new Dog();

        genericAnimal.makeSound();  // Output: Generic Animal Sound
        myDog.makeSound();          // Output: Bark! Bark!
    }
}
