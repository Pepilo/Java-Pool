package planet;

public class Mars {
    
    private static int globalId = 0;
    private int id;
    private String landingSite;

    public int getId() {
        return id;
    }
    public String getLandingSite() {
        return landingSite;
    }

    public Mars(String landingSite) {
        this.landingSite = landingSite;
        id = globalId;
        globalId ++;
    }
}