package Bunny;

public class Osterhase  extends Hase {
    public Osterhase(String name,int alter, int carrots) {
        super(name,alter,carrots);
    }

    public void versteckeOstereier() {
        System.out.println(super.name + " versteckt Ostereier");
    }

    @Override
    public void hoppeln() {
        System.out.println(" Hase hoppelt");
        super.hoppeln();
    }

    @Override
    public String toString() {
        return "Osterhase{" +
                "name='" + name + '\'' +
                ", alter=" + alter + '\'' +
                ", carrots=" + carrots +
                '}';
    }
}
