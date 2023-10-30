public class Mage extends Character {

    protected int life = 70;
    protected int agility = 10;
    protected int strength = 3;
    protected int wit = 10;

    public Mage(String name) {
        super(name, "Mage");
        this.life = 70;
        this.agility = 10;
        this.strength = 3;
        this.wit = 10;
        System.out.println(name + ": May the gods be with me.");
    }

    @Override
    public void attack(String weapon) {
        switch(weapon) {
            case "":
                System.out.println(getName() + ": I refuse to fight with my bare hands.");
            case "magic":
                System.out.println(getName() + ": Rrrrrrrrr....");
                System.out.println(getName() + ": Feel the power of my " + weapon + "!");
                break;
            case "wand":
                System.out.println(getName() + ": Rrrrrrrrr....");
                System.out.println(getName() + ": Feel the power of my " + weapon + "!");
                break;
            default:
                System.out.println(getName() + ": A " + weapon + "?? What should  I do with this?!");
                break;
        }
    }
    @Override
    public void moveRight() {
        System.out.println(getName() + ": moves right furtively.");
    }
    @Override
    public void moveLeft() {
        System.out.println(getName() + ": moves left furtively.");
    }
    @Override
    public void moveForward() {
        System.out.println(getName() + ": moves forward furtively.");
    }
    @Override
    public void moveBack() {
        System.out.println(getName() + ": moves back furtively.");
    }    
}