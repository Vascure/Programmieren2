package ORKester;

public class Gitarre2 extends Instrument2 {


    public Gitarre2(int l) {
        super(l);
    }

    @Override
    public int play() {
        System.out.println(" die Gitarre wird gezupft");
        return lautstaerke;
    }
    public int playAsIsntrument() {
        return lautstaerke;
    }
}
