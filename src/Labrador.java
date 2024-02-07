public class Labrador extends Dog{
    public Labrador(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Bark");
    }

    @Override
    void stay() {
        System.out.println("Staying");
    }

    public void sit(){
        System.out.println("I am a good boi");
    }
}
