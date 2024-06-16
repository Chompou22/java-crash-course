class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }

    void playFetch() {
        System.out.println("Playing fetch");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting from Dog to Animal
        
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;  // Downcasting from Animal to Dog
            dog.playFetch();  // Accessing Dog-specific method
        }

    }
}
