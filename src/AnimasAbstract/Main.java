package AnimasAbstract;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      // geht nicht als Objekt anzulegen, da Abstract!
        //  Animal a= new Animal();

Giraffe georg= new Giraffe("Georg",4,"braun",43);
Papagei pauli = new Papagei("Pauli",2,"blau");

georg.praesentiertFlecken();

// upcasten auf abstrakten Basisklassen
        Animal g1=georg;

        ArrayList<Animal>zoo= new ArrayList<>();

        zoo.add(g1);
        zoo.add(pauli);

        for (Animal a: zoo) {
            a.move(100);

        }

        }
    }

