package de.iad.ef.firma.App;

import de.iad.ef.firma.Angestellte;
import de.iad.ef.firma.Azubi;
import de.iad.ef.firma.Chef;
import de.iad.ef.firma.Mitarbeiter;

import java.util.ArrayList;
import java.util.List;

public class Application extends Object {

    public static void main(String[] args) {
        //AP

        List<Mitarbeiter> iad = new ArrayList<>(); //<> muss nicht nochmal befüllt werden
        iad.add(new Azubi("Fritz", 345));
        iad.add(new Chef("Rudi " , 3456.0, 1000));
        iad.add(new Angestellte("susi", 3458));

        for (Mitarbeiter m : iad) {
            System.out.println(m);
            //Polymorphie Methode unten kommt einfach in Basisklasse, um if Schleife zu vermeiden
            // Methode kann für jede Klasse von Mitarbeitern dann individuell geändert, aka überschreieben werden
            //if(m instanceof Chef){
            //    ((Chef) m).gehaltserhoehung(); stattdessen:
            m.gehaltserhoehung();

        }
        System.out.println("Nach Gehaltserhöhung ! ");
        iad.forEach((m) -> System.out.println(m));
//        Chef toni = new Chef("Rudi " , 3456.0);
//        //System.out.println("  " + toni.getName() + toni.getGehalt() + toni.getBoni());
//        //toni.setBoni(1000);
//        //Mitarbeiter m = new Mitarbeiter(346);
//        System.out.println(toni);
//        Azubi fritze = new Azubi("Fritz", 345); // !! Mitarbeiter fritze = new Azubi("Fritz", 345); auch möglich, da initialisierung selbst nicht über die abstrakte Klasse läuft
//        Angestellte susi = new Angestellte("susi", 3458);
//        System.out.println(susi);
//        System.out.println(fritze);

    }
}
