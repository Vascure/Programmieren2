package Bunny;

public class Weihnachtshase extends Hase{
    public Weihnachtshase(String name, int alter, int carrots) {
        super(name,alter, carrots);
    }
    public void verteileGeschenke() {
        System.out.println(super.name+ " verteilt Geschenke");
    }

//    @Override
//    public void hoppeln() {
//        System.out.println( " Hase hoppelt");
//        super.hoppeln();
//    }

    @Override
    public void party(String drink, String cake) {
        System.out.println("Weihnachtshase "+ name+ " bringt ganz viele Geschenke mit zur Party");
        super.party(drink, cake);
    }

    @Override
    public String toString() {
        return "Weihnachtshase{" +
                "name='" + name + '\'' +
                ", alter=" + alter + '\'' +
                ", carrots=" + carrots +
                '}';
    }
}


