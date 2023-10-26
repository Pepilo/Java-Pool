public class Shark extends Animal {

    private boolean frenzy = false;

    public void setFrenzy( boolean frenzy) {
        this.frenzy = frenzy;
    }

    public Shark(String name) {
        super(name, 0, Animal.type.FISH);
        System.out.println("A KILLER IS BORN!");
    }

    public void smellBlood(boolean isBlood) {
        setFrenzy(isBlood);
    }

    public void status() {
        if (frenzy) {
            System.out.println(name + " is smelling blood and wants to kill.");
        }
        else {
            System.out.println(name + " is swimming peacefully.");
        }
    }

    public void canEat(Animal) {

    }
}