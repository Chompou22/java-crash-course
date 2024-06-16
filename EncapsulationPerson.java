public class EncapsulationPerson {
    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person(25);

        // Get and print the initial age
        System.out.println("Initial Age: " + person1.getAge());

        // Set a new age
        person1.setAge(30);

        // Get and print the updated age
        System.out.println("Updated Age: " + person1.getAge());

        // Try setting an invalid age
        person1.setAge(-5);

        // Get and print the age after attempting to set an invalid age
        System.out.println("Age after invalid update: " + person1.getAge());
    }
}

/*
For the reason we are using Encapsulation for class :
1. To organize both private variables and also public methods by using getter and setter methods
to prevent the error statement occur and break the whole program.
 */
