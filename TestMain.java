public class TestMain {
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
    }
}
