public abstract class Weapon {

    protected String name;
    protected int apcost;
    protected int damage;
    protected boolean melee;
    protected boolean pick;

    public String getName() {
        return name;
    }
    public int getApcost() {
        return apcost;
    }
    public int getDamage() {
        return damage;
    }
    public boolean isMelee() {
        return melee;
    }
    public boolean isPick() {
        return pick;
    }

    protected Weapon(String name, int apcost, int damage, boolean melee) {
        this.name = name;
        this.apcost = apcost;
        this.damage = damage;
        this.melee = melee;
    }

<<<<<<< HEAD
    public abstract void attack();
}
=======
    public void attack();
}
>>>>>>> 1b78ccf3965c491c222d6062d5a08ccdbb5141f2
