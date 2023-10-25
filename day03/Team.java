import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Astronaut> members;

    public String getName() {
        return name;
    }

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<Astronaut>();
    }

    public void add(Astronaut astronaut) {
        members.add(astronaut);
    }
    public void remove(Astronaut astronaut) {
        members.remove(astronaut);
    }
    public int countMembers() {
        return members.size();
    }
    public void showMembers() {
        if (members.size() != 0) {
            StringBuilder result = new StringBuilder();
            result.append(getName() + ": ");
            for (int i = 0; i < members.size(); i++) {
                Astronaut member = members.get(i);
                if (member.getDestination() != null) {
                    result.append(member.getName() + " on mission");
                }
                else {
                    result.append(member.getName() + " on standby");
                }
                if (i < members.size() - 1) {
                    result.append(", ");
                }
                else {
                    result.append(".");
                }
            }
            System.out.println(result);
        }
        
    }
}