public class Gecko {

    public String name = "Unknown";

    public Gecko () {
        System.out.println("Hello!");
    }

    public Gecko (String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }
}