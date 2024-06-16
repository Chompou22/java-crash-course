// Parent class
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class extending the parent class
class Car extends Vehicle {
    // Override the start method from the parent class
    @Override
    public void start() {
        // Call the start method of the parent class using 'super'
        super.start();
        System.out.println("Car is starting...");
    }
}

public class Super {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car();

        // Call the start method of the Car class
        myCar.start();
    }
}
