package ORKester;

public class Geige2 extends Instrument2 {

    public Geige2(int l) {
        super(l);
    }

    @Override
    public int play() {
        System.out.println(" Die Geige wird gestrichen");
        return lautstaerke;
    }
    public int playAsIsntrument() {
        return lautstaerke;
    }
}


