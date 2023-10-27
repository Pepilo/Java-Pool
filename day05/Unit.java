public abstract class Unit implements Fighter {

    protected String name;
    protected int hp;
    protected int ap;
    protected Fighter isClose;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getHp() {
        return hp;
    }
    @Override
    public int getAp() {
        return ap;
    }
    public Fighter getIsClose() {
        return isClose;
    }

    protected Unit(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    @Override
    public void receiveDamage(int damage) {
        this.hp = getHp() - damage;
    }
    @Override
    public boolean moveCloseTo(Fighter target) {
        if (getHp() >0) {
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
        if (getAp() > 43) {
            this.ap = 50;
        }
        else {
            this.ap = getAp() + 7;
        }
    }
}