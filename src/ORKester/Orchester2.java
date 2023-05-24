package ORKester;

import java.util.ArrayList;

public class Orchester2 {
private ArrayList<Instrument2> or;

public Orchester2() {or= new ArrayList<>();}

public void addInstrument( Instrument2 i) {or.add(i);}

public int playAll() {
    int sum=0;
    for (Instrument2 i:or) {
        sum+= i.play();

    }
    return sum;
}
}
