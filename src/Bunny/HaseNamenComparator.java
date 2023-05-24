package Bunny;

import java.util.Comparator;

public class HaseNamenComparator implements Comparator<Hase> {
    @Override
    public int compare(Hase o1, Hase o2) {
        return o1.name.compareTo(o2.name);
    //  if ( o1.name.compareTo(o2.name)==0) {
      //} else {
        //  return o1.name.compareTo(o2.name);
      }
    }

