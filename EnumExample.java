// Declaring an enum representing days of the week
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample {
    public static void main(String[] args) {
        // Accessing enum constants
        Day today = Day.MONDAY;
        
        // Using enum in a switch statement
        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("It's not a valid day of the week");
        }
        
        // Iterating over enum constants
        System.out.println("Days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
        
        // Using enum methods
        System.out.println("Ordinal of MONDAY: " + Day.MONDAY.ordinal());
    }
}

