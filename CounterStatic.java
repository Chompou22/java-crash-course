public class CounterStatic {
    // Static variable to count instances of Counter
    static int instanceCount = 0;

    // Constructor increments the instanceCount
    public CounterStatic() {
        instanceCount++;
    }

    // Static method to get the current instanceCount
    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        // Creating instances of Counter
        CounterStatic counter1 = new CounterStatic();
        CounterStatic counter2 = new CounterStatic();
        CounterStatic counter3 = new CounterStatic();

        // Accessing the static variable using the class name
        System.out.println("Total Instances: " + CounterStatic.getInstanceCount());

        // Creating another instance
        CounterStatic counter4 = new CounterStatic();

        // Accessing the static variable again
        System.out.println("Total Instances: " + CounterStatic.getInstanceCount());
    }
}
