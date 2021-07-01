package de.iad.ef;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Anwendungsprogrammierer

//        Konto konto = new Konto("Rudi Ratlos");
//        Konto konto1 = new Konto("Susi Sorglos", 600);
//
//        kontoBuchung(konto1, 300);
//
//        kontoBuchung(konto1, -500);
//        kontoBuchung(konto1, -500);

//        Konto [] bank38 = new Konto [100]; Arraymöglichkeit

        List<Konto> bank38 = new ArrayList<Konto>();

        while(kontoErföffnung(bank38)){
            System.out.println("Ciaoo");
        }

        }

    private static boolean kontoErföffnung(List<Konto> bank38) {
        String name= utils.IOPaneTools.readLine("Bitte Kontoinhaber (leere Eingabe zum Beenden): ");
        if (name.isEmpty()){
            return false;
        }

        //Konto tempKonto = new Konto(name);
        bank38.add(new Konto(name));
        return true;

    }

    private static void kontoBuchung(Konto konto, float betrag) {
        if (konto.buchung(betrag)) {
            System.out.println("Buchung von " + betrag + " Euro erfolgreich");
        } else {
            System.out.println("Abbuchung von " + betrag + " Euro nicht erfolgt");

        }
        System.out.println(konto.display());
    }
}
