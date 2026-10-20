public class Rabbit extends Pet {
    public Rabbit(String name) {
        super(name);
    }

    public void feed() {
        System.out.println(getName() + " was fed!");
    }
}
