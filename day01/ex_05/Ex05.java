import java.util.ArrayList;

public class Ex05 {
    public static ArrayList<String> myGetArgs(String... var) {
        ArrayList<String> myGetArgs = new ArrayList<>();
        for (String argument : var) {
            myGetArgs.add(argument);
        }
        return myGetArgs;
    }
}