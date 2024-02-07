public abstract class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }
    public void speak(){
        System.out.println("Woof");
    }
    abstract void stay();
}
