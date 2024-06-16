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

public class ForEach {
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] studentArray = {
                new Student("Alice", 20),
                new Student("Bob", 22),
                new Student("Charlie", 21)
        };

        // Using enhanced for loop to iterate over the array
        for (Student student : studentArray) {
            System.out.println("Name: " + student.name + ", Age: " + student.age);
        }
    }
}

/*
The enhanced for loop, also known as the "for-each" loop,
is a simplified way to iterate over elements in an array or other iterable collections in Java.

Syntax :
for (ElementType element : array) {
    // Code to be executed for each element
}

 */
