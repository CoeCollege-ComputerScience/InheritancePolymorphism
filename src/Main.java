import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog d = new Labrador("Rover");
        Labrador lab = new Labrador("Ben");
        System.out.println(d);
        d.speak();
        System.out.println(lab);
        lab.speak();
        lab.sit();
        d = new Labrador("Rex");
        System.out.println(d);
        d.speak();
        ((Labrador) d).sit();
        Dog d2 = new Beagle("Snoopy");
        d2.speak();

        ArrayList<Dog> kennel = new ArrayList<Dog>();
        kennel.add(new Beagle("Fido"));
        kennel.add(new Labrador("Killer"));
        kennel.add(new Labrador("Brutus"));


        for (Dog boarder : kennel){
            boarder.speak();
        }

    }
}