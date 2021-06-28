package de.iad.ef;

public class Main {

    public static void main(String[] args) {
        //Anwendungsprogrammierer

        Konto konto = new Konto("Rudi Ratlos");
        Konto konto1 = new Konto("Susi Sorglos", 600);

        kontoBuchung(konto1, 300);

        kontoBuchung(konto1, -500);
//        kontoBuchung(konto1, -500);
    }

    private static void kontoBuchung(Konto konto, float betrag) {
        if (konto.buchung(betrag)) {
            System.out.println("Buchung von " + betrag + " Euro erfolgreich");
        } else {
            System.out.println("Abbuchung von " + betrag + " Euro nicht erfolgt");

        }
        System.out.println(konto.display());;;
    }
}
