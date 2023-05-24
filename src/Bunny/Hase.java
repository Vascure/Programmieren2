package Bunny;

public class Hase implements GoesToParty, Comparable<Hase> {
   protected String name;
   protected int alter;
   protected int carrots;

    public Hase(String name, int alter, int carrots) {
        this.name = name;
        this.alter=alter;
        this.carrots=carrots;
    }

    public void schlafen(){
        System.out.println(name+ "schläft");
    }
    public void hoppeln () {
        System.out.println(name+"hoppelt");
    }
    public void fressen() {
        System.out.println(name+ " frisst");
    }

    @Override
    public void party(String drink, String cake) {
        System.out.println(name + " geht zur Party und isst "+ cake+ " und trinkt "+ drink);
    }

    @Override
    public String toString() {
        return "Hase{" +
                "name='" + name + '\'' +
                ", alter=" + alter + '\'' +
                ", carrots=" +carrots +
                '}';
    }

    @Override
    public int compareTo(Hase o) {
        if (this.alter > o.alter) {
            return 1;
        }
        if (this.alter < o.alter) {
            return -1;
        }
        if (this.carrots> o.carrots) {
            return 1;
        }
        if (this.carrots < o.carrots) {
            return -1;
        }
            return 0;
        }

        //wenn wir nur nach Alter comparen würden: Integer.compare(this.alter, o.alter); oder bei Strings!
        }





