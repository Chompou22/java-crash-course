// Superclass or base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass or Derived class
class Dog extends Animal {
    void bark() {
        super.eat(); // Calls the eat() method of the superclass
        System.out.println("Dog is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Calls the eat() method from Animal class
        myDog.bark(); // Calls the bark() method from Dog class
    }
}


/*
class Superclass {
    // Superclass members (fields and methods)
}

class Subclass extends Superclass {
    // Subclass members (fields and methods)
}

 */