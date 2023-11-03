package Factory;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    protected List<Toy> toyList = new ArrayList<>();
    protected Toy newToy;

    public List<Toy> getToyList() {
        return toyList;
    }

    public Toy create(String toy) throws NoSuchToyException {
        switch(toy) {
            case "teddy":
                newToy = new TeddyBear();
                toyList.add(newToy);
                return newToy;
            case "gameboy":
                newToy = new Gameboy();
                toyList.add(newToy);
                return newToy;
            default:
                throw new NoSuchToyException("No such toy: " + toy + ".");
        }
    }
    public List<GiftPaper> getPapers(int n){
        List<GiftPaper> papers = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            papers.add(new GiftPaper());
        }
        return papers;
    }
}