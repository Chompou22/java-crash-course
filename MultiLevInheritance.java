class Animal1 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Bulldog extends Dog1 {
    void guard() {
        System.out.println("Bulldog is guarding");
    }
}


public class MultiLevInheritance {
    public static void main(String[] args) {
        Bulldog dog = new Bulldog();
        dog.guard();
        dog.bark();
        dog.eat();
    }
}
