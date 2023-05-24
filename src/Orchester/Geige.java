package Orchester;

public class Geige extends Instrument{

    public Geige(int l) {
        super(l);
    }

    @Override
    public int play() {
        System.out.println(" Die Geige wird gestrichen");
        return lautstaerke;
    }
    public int playAsIsntrument() {
        return super.play();
    }
}


