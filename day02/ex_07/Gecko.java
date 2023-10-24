public class Gecko {

    private String name = "Unknown";
    private int age;
    private int energy = 100;

    public String getName() {
        return name;
    }   
    public int getAge() {
        return age;
    }
    public int getEnergy() {
        return energy;
    }

    public void setAge (int age) {
        this.age = age;
    }
    public void setEnergy (int energy) {
        this.energy = energy;
    }

    public Gecko(String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public Gecko (String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello " + name + "!");
    }

    public Gecko (int age) {
        this.age = age;
        System.out.println("Hello!");
    }

    public Gecko () {
        System.out.println("Hello!");
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
        System.out.println("Hello " + str1 + ", I'm " + name + "!");
    }

    public void hello(int str1) {
        for(int i = 0; i < str1; i++) {
            System.out.println("Hello, I'm " + name + "!");
        }
    }

    public void eat(String str2) {
        switch(str2) {
            case "Meat":
                System.out.println("Yummy!");
                if (energy < 91) {
                    setEnergy(this.energy + 10);
                }     
                break;
            case "Vegetable":
                System.out.println("Erk!");
                if (energy >9) {
                    setEnergy(this.energy - 10);
                }
                break;
            default:
                System.out.println("I can't eat this!");
                break;
        }
    }

    public void work () {
        if (getEnergy() >= 25) {
            System.out.println("I'm working T.T");
            setEnergy(this.energy - 9);
        }
        else {
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
            setEnergy(this.energy + 50);
        }
    }
}