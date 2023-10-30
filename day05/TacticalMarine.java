public class TacticalMarine extends SpaceMarine {

    public void TacticalMarine(String name) {
        super(name, 100, 20);
        System.out.println(name + " on duty.");
        TacticalMarine.equip(Weapon PlasmaRifle);
    }

    @Override
    public void recoverAP() {
        if (getAp() > 38) {
            this.ap = 50;
        }
        else {
            this.ap = getAp() + 12;
        }
    }
}