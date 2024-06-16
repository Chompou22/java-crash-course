public class StaticPolymorphism {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        StaticPolymorphism math = new StaticPolymorphism();

        // Adding integers
        int resultInt = math.add(5, 10);
        System.out.println("Result of adding integers: " + resultInt);

        // Adding doubles
        double resultDouble = math.add(3.5, 2.5);
        System.out.println("Result of adding doubles: " + resultDouble);

        // Concatenating strings
        String resultString = math.add("Hello", " World");
        System.out.println("Result of concatenating strings: " + resultString);
    }
}
