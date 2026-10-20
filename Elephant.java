public class Elephant extends Pet {
    public Elephant(String name) {
        super(name);
    }

    public void trumpet() {
        System.out.println(getName() + " trumpets loudly!");
    }
}
