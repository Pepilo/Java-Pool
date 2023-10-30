public class AssaultTerminator extends SpaceMarine {

    public void AssaultTerminator(String name) {
        super(name, 150, 30);
        System.out.println(name + " has teleported from space.");
        TacticalMarine.equip(Weapon PowerFist);
    }

    @Override
    public void receiveDamage(int damage) {
        if (damage >= 4) {
            damage -= 3;
        }
        else {
            damage = 1;
        }
        this.hp = getHp() - damage;
    }
}