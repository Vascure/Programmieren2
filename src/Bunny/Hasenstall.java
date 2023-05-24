package Bunny;

import java.util.ArrayList;

public class Hasenstall {
   protected ArrayList<Hase> hasen = new ArrayList<>();

   public void addHasen(Hase h) {
       hasen.add(h);
   }
   public void alleHoppeln(Hase h) {
       for (Hase hase: hasen) {
           hase.hoppeln();

       }

   }
}
