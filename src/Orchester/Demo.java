package Orchester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
Geige g= new Geige(3);
Gitarre gi= new Gitarre(2);
Trompete tr= new Trompete(5);
Triangel t= new Triangel(1);

Orchester orchester= new Orchester();

orchester.addInstrument(g);
orchester.addInstrument(gi);
orchester.addInstrument(t);
orchester.addInstrument(tr);
        System.out.println(orchester.playAll());

        g.playAsIsntrument();

        List<Instrument> instruments= new ArrayList<>();
        instruments.add(g);
        instruments.add(gi);
        instruments.add(t);
        Collections.sort(instruments);
        System.out.println(instruments);
    }
}
