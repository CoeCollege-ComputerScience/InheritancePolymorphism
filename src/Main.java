import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog d = new Labrador("Rover");
        Labrador lab = new Labrador("Ben");
        System.out.println(d);
        System.out.println("Speak "+ d);
        d.speak();
        System.out.println(lab);
        System.out.println("Speak "+ lab);
        lab.speak();
        System.out.println("Sit "+ lab);
        lab.sit();

        d = new Labrador("Rex");
        System.out.println(d);
        System.out.println("Speak "+ d);
        d.speak();
        System.out.println("Sit "+ lab);
        ((Labrador) d).sit();

        Dog d2 = new Beagle("Snoopy");
        System.out.println(d2);
        System.out.println("Speak "+ d2);
        d2.speak();


        System.out.println("My Kennel");
        ArrayList<Dog> kennel = new ArrayList<Dog>();
        kennel.add(new Beagle("Fido"));
        kennel.add(new Labrador("Killer"));
        kennel.add(new Labrador("Brutus"));


        for (Dog boarder : kennel){
            boarder.speak();
        }

    }
}