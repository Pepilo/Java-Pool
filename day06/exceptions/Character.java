import java.io.WriteAbortedException;

public abstract class Character implements Movable {

    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected final String RPGClass;

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

    protected Character(String name, String RPGClass){
        this.name = name;
        this.RPGClass = RPGClass;
    }

    public void attack(String weapon) throws WeaponException {
        System.out.println(getName() + ": Rrrrrrrrr....");
    }
    public void tryToAttack(String weapon){
        try{
            this.attack(weapon);
        } catch (WeaponException message) {
            System.out.println(message.getMessage());
        }
    }
    public final void unsheathe() {
        System.out.println(getName() + "unseathes his weapon.");
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
}