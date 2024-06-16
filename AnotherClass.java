// File: AnotherClass.java
// This class is in the same package as MyClass
class AnotherClass extends MyClass {

    void accessMembers() {
        // Accessing public members
        System.out.println(publicVariable);
        publicMethod();

        // Accessing protected members
        System.out.println(protectedVariable);
        protectedMethod();

        // Accessing default (package-private) members from the same package
        System.out.println(defaultVariable);
        defaultMethod();

        // Uncommenting the lines below will result in compilation errors
        // System.out.println(privateVariable); // privateVariable is private
        // privateMethod(); // privateMethod is private
    }

   public static void main(String[] args) {
        AnotherClass anotherInstance = new AnotherClass();

        // Assigning values to variables in AnotherClass
        anotherInstance.publicVariable = 1;
        anotherInstance.protectedVariable = 2;
        anotherInstance.defaultVariable = 3;

        // Uncommenting the lines below will result in compilation errors
        // anotherInstance.privateVariable = 4; // privateVariable is private

        anotherInstance.accessMembers();
    }
}
