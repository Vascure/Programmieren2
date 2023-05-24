package Orchester;

public class Instrument implements Comparable<Instrument> {
    protected int lautstaerke;
    private double value;
private String nickname;

    public Instrument(String nickname) {
        this.nickname = nickname;
    }

    public Instrument(int l) {
        l = lautstaerke;

    }

    public Instrument(double value) {
        this.value = value;
    }

    public int play() {
        System.out.println(" Instrument macht geräusche");
        return lautstaerke;
    }

    //vergleich se lautstaerke
    @Override
    public int compareTo(Instrument o) {
        if (lautstaerke < o.lautstaerke) {
            return -1;
        }
        if (lautstaerke > o.lautstaerke) {
            return 1;
        }
        if (lautstaerke == o.lautstaerke) {
            return 0;
        } return lautstaerke;
    }
}

