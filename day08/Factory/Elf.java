package Factory;

import java.util.ArrayList;
import java.util.List;

public class Elf {
    
    protected Toy toy;
    protected List<GiftPaper> papers;
    protected Factory factory;

    public boolean pickToy(String toyName) {
        for (int i = 0; i < factory.getToyList().size(); i++) {
            if (factory.getToyList().get(i).getTitle().equals(toyName)) {
                if (this.toy == null) {
                    this.toy = factory.getToyList().get(i);
                    factory.getToyList().remove(i);
                    System.out.println("What a nice one! I would have liked to keep it...");
                    return true;
                }
                else {
                    System.out.println("Minute please?! I'm not that fast.");
                }         
            }
        }
        System.out.println("I didn't find any " + toyName + ".");
        return false;
    }
    public boolean pickPapers(int nb) {
        factory.getPapers(nb);
        return true;
    }
    public GiftPaper pack() {
        if (toy!= null && papers != null) {
            System.out.println("And another kid will be happy!");
        }
        else if (toy == null) {
            System.out.println("I don't have any toy, but hey at least it's paper.");
        }
        else if (papers == null) {
            System.out.println("Wait... I can't pack it with my shirt.");
        }
    }
}
