class Student {
    String name;
    int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Other methods can be added as needed
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] studentArray = new Student[3];

        // Initializing objects in the array
        studentArray[0] = new Student("Alice", 20);
        studentArray[1] = new Student("Bob", 22);
        studentArray[2] = new Student("Charlie", 21);

        // Accessing and printing information from the array
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println("Name: " + studentArray[i].name + ", Age: " + studentArray[i].age);
        }
    }
}
