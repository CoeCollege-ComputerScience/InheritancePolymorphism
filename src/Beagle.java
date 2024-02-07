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

}
