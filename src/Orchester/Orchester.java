package Orchester;

import java.util.ArrayList;

public class Orchester {
private ArrayList<Instrument> or;

public Orchester() {or= new ArrayList<>();}

public void addInstrument( Instrument i) {or.add(i);}

public int playAll() {
    int sum=0;
    for (Instrument i:or) {
        sum+= i.play();

    }
    return sum;
}
}
