public class Beagle extends Dog{
    public Beagle(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Aroooooooooooooo!");
    }

    @Override
    void stay() {
        System.out.println("Woof");
    }

    @Override
    public String toString() {
        return super.toString() + " is a Beagle";
    }
}
