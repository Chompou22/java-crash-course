import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Student class implementing Comparable interface
class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.id - otherStudent.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

// Comparator class to compare students based on their names
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class Collection {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", 101));
        studentList.add(new Student("Alice", 102));
        studentList.add(new Student("Bob", 103));

        // Printing unsorted list
        System.out.println("Unsorted list:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Sorting using Comparable (natural ordering based on student id)
        Collections.sort(studentList);
        System.out.println("\nSorted list using Comparable (based on student id):");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Sorting using Comparator (based on student name)
        Collections.sort(studentList, new NameComparator());
        System.out.println("\nSorted list using Comparator (based on student name):");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
