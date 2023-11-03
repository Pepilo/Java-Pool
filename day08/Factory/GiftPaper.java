package Factory;

public class GiftPaper {

    protected Toy gift;
    protected Toy inPaper;

    public void wrap(Toy toy){
        this.gift = toy;
    }
    public Toy unwrap() {
        inPaper = gift;
        gift = null;
        return inPaper;
    }
}