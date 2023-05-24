package Orchester;

public class Gitarre extends Instrument{


    public Gitarre( int l) {
        super(l);
    }

    @Override
    public int play() {
        System.out.println(" die Gitarre wird gezupft");
        return lautstaerke;
    }
    public int playAsIsntrument() {
        return super.play();
    }
}
