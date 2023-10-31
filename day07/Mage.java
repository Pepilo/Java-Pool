public class Mage extends Character {

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
            case "magic":
                System.out.println(getName() + ": Rrrrrrrrr....");
                System.out.println(getName() + ": Feel the power of my " + weapon + "!");
                break;
            case "wand":
                System.out.println(getName() + ": Rrrrrrrrr....");
                System.out.println(getName() + ": Feel the power of my " + weapon + "!");
                break;
            default:
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