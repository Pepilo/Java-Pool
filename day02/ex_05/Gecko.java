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
        case 1: case 2: case 3:
            System.out.println("Baby Gecko");
            break;
        case 4: case 5: case 6: case 7: case 8: case 9: case 10:
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

    public void hello(String str1) {
        System.out.println("Hello " + str1 + ", I'm " + getName() + "!");
    }

    public void hello(int count) {
        for(int i = 0; i < count; i++) {
            System.out.println("Hello, I'm " + getName() + "!");
        }
    }
}