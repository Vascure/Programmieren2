package HashMap;

import Bunny.Hase;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
//Wir möchten alle Hasen mit einer Steuernummer versehen und speicher um sie schnell zu finden und versteuern zu können
        HashMap<String, Hase> steuerHasen = new HashMap<>();

        Hase h1= new Hase("Hansi",3,7);
        Hase h2= new Hase("Susi",5,3);
        //Input in die Hashmap
        steuerHasen.put("123H",h1);
        steuerHasen.put("345G",h2);

        //Wert auslesen durch Angabe des Schlüssels
        System.out.println(steuerHasen.get("123H"));

        // wenn wir eine Int Int Hashmap wollen:
        HashMap<Integer, Integer> integerHashMap = new HashMap<Integer, Integer>();
        //fragen ob ein Schlüssel in Hashmap ist
        System.out.println(steuerHasen.containsKey("123H"));

//ACHTUNG: Nur notfalls machen ( ist langsam)
        System.out.println(steuerHasen.containsValue(h1));


        //was passiert jetzt? Hase h2 statt Hase h1 über 123H abrufbar
        steuerHasen.put("123H",h2);



        //is angeblich super?
       // steuerHasen.getOrDefault()

          //über Hashmap iterieren
        for (Map.Entry<String,Hase> hase: steuerHasen.entrySet()) {
            System.out.println(hase.getKey());
           Hase h= hase.getValue();
            h.hoppeln();


        }
        //andere Variante: iterieren über alle Schlüsselelemente
                for (String key : steuerHasen.keySet()) {
                    System.out.println(key);
                   Hase h= steuerHasen.get(key);
                   h.hoppeln();

                }
    }
}
