package ORKester;

public class Trompete2 extends Instrument2 {
    public Trompete2(int l) {
        super(l);
    }

    @Override
    public int play() {
        System.out.println(" Die Trompete wird geblasen");
        return lautstaerke;
    }
}
