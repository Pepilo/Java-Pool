public abstract class SpaceMarine extends Unit {

    protected Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public boolean equip(Weapon weapon) {
        if (this.getHp() > 0) {
            if (weapon.isPick == false) {
                this.weapon = weapon;
                System.out.println(this.getName() + " has been equipped with a " + weapon.getName()+ ".");
                weapon.isPick = true;
            }
        }
        else {
            return false;
        }
    }
    @Override
    public boolean attack(Fighter target) {
        if (this.getHp() > 0){
            if (this.weapon = null){
                System.out.println(name + ": Hey, this is crazy. I'm not going to fight this empty-handed.");
            }
            else if (this.weapon.isMelee() == true && this.getIsClose() == null) {
                System.out.println(this.getName() + ":I'm too far away from " + target.getName() + ".");
            }
            else if (this.weapon.getApcost() <= this.getAp()) {
                this.ap = this.getAp() - this.weapon.getApcost();
                System.out.println(this.getName() + " attacks " + target.getName() + " with a " + this.weapon.getName() + ".");
                this.weapon.attack();
                target.receiveDamage(this.weapon.getDamage());
            }
        }
        return {
            return false;
        }
    }
    @Override
    public boolean moveCloseTo(Fighter target) {
        if (getHp() > 0 || this.weapon.melee == true) {
            if (target != getIsClose() && this != target) {
            System.out.println(getName() + " is moving closer to " + target.getName());
            return true;
            }
            else {
                return false;
            }
        }
    }
    @Override
    public void recoverAP() {
        if (getAp() > 41) {
            this.ap = 50;
        }
        else {
            this.ap = getAp() + 9;
        }
    }
}