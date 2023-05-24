package ORKester;

public class Triangel2 extends Instrument2 {
    public Triangel2(int l) {
        super(l);
    }

    @Override
    public int play() {
        System.out.println(" Die Triangel wird geschlagen");
        return lautstaerke;
    }
}
