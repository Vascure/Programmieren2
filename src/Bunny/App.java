package Bunny;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Hase h= new Hase("Fridolin",2,12);
        Osterhase o= new Osterhase("Chef",2023,5000);
        Weihnachtshase w= new Weihnachtshase("Olaf",1750,3200);
        Hase h2= new Hase("Hoppels",5,17);
        Hase h3= new Hase("Snowball",3,2);
        Hase h4= new Hase("Gulasch",6,9);

        h.fressen();
        h.hoppeln();
        h.schlafen();
        o.versteckeOstereier();
        w.verteileGeschenke();


Hasenstall hs= new Hasenstall();
hs.addHasen(o);
hs.addHasen(h);

        ArrayList<GoesToParty> partyPeople = new ArrayList<>();
        partyPeople.add(o);
        partyPeople.add(w);
        partyPeople.add(h);
        partyPeople.add(new Hase("Bernhard",4,7));
        partyPeople.add(new Igel());

        for (GoesToParty p :partyPeople) {
            p.party("Karottensaft","Karottenkuchen");

        }
        System.out.println("------------------------------------");

        List<Hase>haseList=new ArrayList<>();
        haseList.add(o);
        haseList.add(w);
        haseList.add(h);
        haseList.add(h2);
        haseList.add(h3);
        haseList.add(h4);
        System.out.println(haseList);
        Collections.sort(haseList);
        Collections.sort(haseList,new HaseNamenComparator());
        System.out.println(haseList);

    }
}
