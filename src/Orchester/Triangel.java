package Orchester;

public class Triangel extends Instrument{
    public Triangel(int l) {
        super(l);
    }

    @Override
    public int play() {
        System.out.println(" Die Triangel wird geschlagen");
        return lautstaerke;
    }
}
