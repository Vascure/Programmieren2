package Orchester;

public class Trompete extends Instrument{
    public Trompete(int l) {
        super(l);
    }

    @Override
    public int play() {
        System.out.println(" Die Trompete wird geblasen");
        return lautstaerke;
    }
}
