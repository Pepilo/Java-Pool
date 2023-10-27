public abstract class Monster extends Unit {

    protected int damage = 0;
    protected int apcost = 0;

    public int getDamage() {
        return damage;
    }
    public int getApcost() {
        return apcost;
    }
    @Override
    public boolean equip() {
        if (getHp() > 0) {
            System.out.println("Monsters are proud and fight with their own bodies.");
        }
        else {
            return false;
        }       
    }
    @Override
    public boolean attack(Fighter target) {
        if (getHp() > 0) {
            if (target != getIsClose()) {
                System.out.println(getName() + ": I'm too far away from " + target.getName());
            }
            else if (getAp() >= getApcost()) {
                this.ap = getAp() - getApcost();
                System.out.println(getName() + " attacks " + target.getName());
                target.receiveDamage(getDamage());
            }
        }
        else {
            return false;
        }    
    }
}