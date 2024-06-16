enum Day1 {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumClassExample {
    public static void main(String[] args) {
        // Using methods provided by the Enum class
        Day1 today = Day1.MONDAY;
        System.out.println("Name of enum constant: " + today.name());
        System.out.println("Ordinal position of enum constant: " + today.ordinal());

        // Using the values() method
        Day1[] days = Day1.values();
        System.out.println("All enum constants:");
        for (Day1 day : days) {
            System.out.println(day);
        }

        // Using the valueOf() method
        Day1 wednesday = Day1.valueOf("WEDNESDAY");
        System.out.println("Enum constant with name WEDNESDAY: " + wednesday);
    }
}
