public class Mars {
    
    private static int globalId = 0;
    private int id;

    public int getId() {
        return id;
    }

    public Mars() {
        id = globalId;
        globalId ++;
    }
}