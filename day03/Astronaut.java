import chocolate.*;
import planet.*;

public class Astronaut {

    private String name;
    private int snacks = 0;
    private String destination = null;
    private static int globalId = 0;
    private int id;

    public String getName() {
        return name;
    }
    public int getSnacks() {
        return snacks;
    }
    public String getDestination() {
        return destination;
    }
    public int getId() {
        return id;
    }

    public Astronaut(String name) {
        id = globalId;
        globalId++;
        this.name = name;
        System.out.println(name + " ready for launch!");
    }

    public void doActions() {
        System.out.println(getName() + ": Nothing to do." );
        if (getDestination() == null) {
            System.out.println(getName() + ": I may have done nothing, but I have " + getSnacks() + " Mars to eat at least!");
        }
    }
    public void doActions(planet.Mars mars) {
        this.destination = mars.getLandingSite();
        System.out.println(getName() + ": Started a mission!");

    }
    public void doActions(chocolate.Mars mars) {
        snacks++;
        System.out.println(getName()+ ": Thanks for this mars number " + mars.getId());
        if (getDestination() == null) {
            System.out.println(getName() + ": I may have done nothing, but I have " + getSnacks() + " Mars to eat at least!");
        }
    }
}