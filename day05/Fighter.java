public interface Fighter {

    public boolean equip(Weapon weapon);
    public boolean attack(Fighter):
    public void receiveDamage(int);
    public boolean moveCloseTo(Fighter);
    public void recoverAP();
    public String getName();
    public int getAp();
    public int getHp();

}