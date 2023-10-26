public class Cat extends Animal {

    private String color = "grey";

    public String getColor() {
        return color;
    }

    public Cat (String name) {
        super(name, 4, Animal.type.MAMMAL);
        this.name = name;
        System.out.println(name + ": MEEEOOWWW");
    }
    public Cat (String name, String color) {
        super(name, 4, Animal.type.MAMMAL);
        this.name = name;
        this.color = color;
        System.out.println(name + ": MEEEOOWWW");
    }

    public void meow () {
        System.out.println(name + " the " + " kitty is meowing.");
    }
}