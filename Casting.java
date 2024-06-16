public class Casting {
    public static void main(String[] args) {
        int intValue = 42;
        Integer integerValue = (Integer) intValue; // Boxing (int to Integer)
        System.out.println(integerValue);
    }
}
//Conversion between primitive types and their corresponding wrapper classes requires explicit casting.
