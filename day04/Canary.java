public class Canary extends Animal {

    private int eggs = 0;

    public int getEggsCount() {
        return eggs;
    }

    public Canary (String name) {
        super(name, 2, Animal.type.BIRD);
        System.out.println("Yellow and smart? Here I am!");
    }

    public void layEgg() {
        eggs++;
    }
}