import java.util.List;
import java.util.ArrayList;
public class Battalion{

    private List<Character> characters;

    public Battalion() {
        this.characters = new ArrayList<>();
    }

    public void add(List<Character> characters) {
        this.characters.addAll(characters);
    }
    public void display(){
        for(int i = 0; i < this.characters.size(); i++) {
            System.out.println(this.characters.get(i).getName());
        }
    }
}
