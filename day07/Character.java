public abstract class Character implements Movable, Comparable<Character> {

    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected final String RPGClass;
    protected int capacicty = 0;

    public String getName() {
        return name;
    }
    public int getLife() {
        return life;
    }
    public int getAgility() {
        return agility;
    }
    public int getStrength() {
        return strength;
    }
    public int getWit(){
        return wit;
    }
    public String getRPGClass() {
        return RPGClass;
    }
    public int getCapacity() {
        return capacicty;
    }

    protected Character(String name, String RPGClass){
        this.name = name;
        this.RPGClass = RPGClass;
    }
    protected Character(String name, String RPGClass, int capacicty){
        this.name = name;
        this.RPGClass = RPGClass;
    }

    public void attack(String weapon) {
        System.out.println(getName() + ": Rrrrrrrrr....");
    }
    public final void unsheathe() {
        System.out.println(getName() + ": unseathes his weapon.");
    }
    @Override
    public void moveRight() {
        System.out.println(getName() + ": moves right");
    }
    @Override
    public void moveLeft() {
        System.out.println(getName() + ": moves left");
    }
    @Override
    public void moveForward() {
        System.out.println(getName() + ": moves forward");
    }
    @Override
    public void moveBack() {
        System.out.println(getName() + ": moves back");
    }
    @Override
    public int compareTo(Character otherCharacter){
        if (otherCharacter instanceof Character) {
            if (this.getRPGClass().equals(otherCharacter.getRPGClass())) {
                return Integer.compare(this.getCapacity(), otherCharacter.getCapacity());
            }
            else if (this.getRPGClass().equals("Mage")) {
                if (otherCharacter.getCapacity() % this.getCapacity() == 0) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            else {
                if (this.getCapacity() % otherCharacter.getCapacity() == 0) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        }
        else {
            return 0;
        }
    }
}