// We assume that Constuctor as a Person

public class Constructor {
    private String name;

    // Default Constructor
    public Constructor() {
        this.name = "Unknown";
    }

    // Parameterized Constructor
    public Constructor(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor("pou");

        System.out.println(constructor1.name);
        System.err.println(constructor2.name);
    }
}
