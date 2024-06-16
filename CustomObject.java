public class CustomObject {
    private int field1;
    private String field2;

    public CustomObject(int field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Same reference
        if (obj == null || getClass() != obj.getClass()) return false;  // Different types

        CustomObject otherObject = (CustomObject) obj;
        // Compare fields for content equality
        return field1 == otherObject.field1 && field2.equals(otherObject.field2);
    }

    @Override
    public int hashCode() {
        int result = field1;
        result = 31 * result + (field2 != null ? field2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "field1=" + field1 +
                ", field2='" + field2 + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CustomObject obj1 = new CustomObject(42, "Hello");
        CustomObject obj2 = new CustomObject(42, "Hello");
        CustomObject obj3 = new CustomObject(99, "World");

        // Testing equals method
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));  // true
        System.out.println("obj1.equals(obj3): " + obj1.equals(obj3));  // false

        // Testing hashCode method
        System.out.println("obj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
        System.out.println("obj3.hashCode(): " + obj3.hashCode());

        // Testing toString method
        System.out.println("obj1.toString(): " + obj1.toString());
        System.out.println("obj2.toString(): " + obj2.toString());
        System.out.println("obj3.toString(): " + obj3.toString());
    }
}
