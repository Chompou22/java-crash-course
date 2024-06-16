class DynamicPolymorphism {
    public void makeSound() {
        System.out.println("Some generic sound");
    }

    public static void main(String[] args) {
        DynamicPolymorphism cat = new Cat3();
        DynamicPolymorphism dog = new Dog3();

        // Polymorphic method invocation
        cat.makeSound();  // Output: Meow
        dog.makeSound();  // Output: Woof
    }
}

class Cat3 extends DynamicPolymorphism {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog3 extends DynamicPolymorphism {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

/*
Polymorphism is a key concept in object-oriented programming (OOP) that allows objects of different classes to be treated as objects of a common base class. There are two types of polymorphism in Java: compile-time (static) polymorphism and runtime (dynamic) polymorphism.
 */
