package ORKester;

public class Demo2 {
    public static void main(String[] args) {
Geige2 g= new Geige2(3);
Gitarre2 gi= new Gitarre2(2);
Trompete2 tr= new Trompete2(5);
Triangel2 t= new Triangel2(1);

Orchester2 orchester= new Orchester2();

orchester.addInstrument(g);
orchester.addInstrument(gi);
orchester.addInstrument(t);
orchester.addInstrument(tr);
        System.out.println(orchester.playAll());

        g.playAsIsntrument();
    }
}
