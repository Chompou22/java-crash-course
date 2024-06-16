// Default Interface
interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
}

public class DefaultInterface {
    public static void main(String[] args) {
         // Creating an instance of Car
        Car car = new Car();

        // Calling methods
        car.start();  // Output: Car started
        car.stop();   // Output: Vehicle stopped
    }
}
