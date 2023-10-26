public class Animal {

    protected String name;
    private int legs;
    protected Type type;
    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfBirds = 0;
    private static int numberOfFish = 0;

    protected enum Type {
        MAMMAL,
        FISH,
        BIRD
    }

    public String getName() {
        return name;
    }
    public int getLegs() {
        return legs;
    }
    public String getType() {
        return type.name().toLowerCase();
    }
    public int getNumberOfAnimals() {
        if (numberOfAnimals == 1) {
            System.out.println("There is currently 1 animal in our world.");
        }
        else {
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        }
        return numberOfAnimals;
    }
    public int getNumberOfMammals() {
        if (numberOfMammals == 1) {
            System.out.println("There is currently 1 mammal in our world.");
        }
        else {
            System.out.println("There are currently " + numberOfMammals + " mammals in our world.");
        }
        return numberOfMammals;
    }
    public int getNumberOfBirds() {
        if (numberOfBirds == 1) {
            System.out.println("There is currently 1 bird in our world.");
        }
        else {
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");
        }
        return numberOfBirds;
    }
    public int getNumberOfFish() {
        if (numberOfFish == 1) {
            System.out.println("There is currently 1 fish in our world.");
        }
        else {
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }
        return numberOfFish;
    }

    protected Animal(String name, int legs, Type type) {
        numberOfAnimals++;
        this.name = name;
        this.legs = legs;
        this.type = type;
        switch(type) {
            case MAMMAL:
                numberOfMammals++;
                break;
            case BIRD:
                numberOfBirds++;
                break;
            case FISH:
                numberOfFish++;
                break;
        }
        System.out.println("My name is " + name + " and I am a " + type.name().toLowerCase() + "!");
    }
}