public class Gecko {

    private String name = "Unknown";
    private int age;

    public void setAge (int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }   
    public int getAge() {
        return age;
    }

    public Gecko () {
        System.out.println("Hello!");
    }

    public Gecko(String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public Gecko (int age) {
        this.age = age;
        System.out.println("Hello!");
    }

    public Gecko (String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello " + name + "!");
    }

    public void status () {
        switch(this.age) {
        case 0:
            System.out.println("Unborn Gecko");
            break;
        case 1: case 2:
            System.out.println("Baby Gecko");
            break;
        case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
            System.out.println("Adult Gecko");
            break;
        case 11: case 12: case 13:
            System.out.println("Old Gecko");
            break;
        default:
            System.out.println("Impossible Gecko");
            break;
        }
    }
}