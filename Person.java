public class Person {
    // Private variable
    private int age;

    // Constructor
    public Person(int initialAge) {
        // Validate and set initial age
        if (initialAge >= 0) {
            this.age = initialAge;
        } else {
            System.out.println("Invalid age. Setting age to 0.");
            this.age = 0;
        }
    }

    // Public method to get age
    public int getAge() {
        return this.age;
    }

    // Public method to set age
    public void setAge(int newAge) {
        // Validate and set new age
        if (newAge >= 0) {
            this.age = newAge;
        } else {
            System.out.println("Invalid age. Age not updated.");
        }
    }

    // Other methods and functionalities can be added here
}

