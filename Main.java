class Car {
    // Attributes
    String color;
    int year;

    // Methods
    void start() {
        System.out.println("Car started");
    }

    void accelerate() {
        System.out.println("Car is accelerating");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car myCar = new Car();
        Car friendCar = new Car();

        // Setting values for attributes
        myCar.color = "Blue";
        myCar.year = 2022;

        friendCar.color = "Red";
        friendCar.year = 2021;

        // Invoking methods
        myCar.start();
        friendCar.accelerate();

        // Printout objects attributes
        System.out.println(myCar.color + " " + myCar.year);
        System.out.println(friendCar.color + " " + friendCar.year);
    }
}

