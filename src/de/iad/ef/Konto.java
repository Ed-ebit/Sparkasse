package de.iad.ef;

/***
 *
 *      Konto
 *     -------
 *     -int Kontonr
 *     -float  saldo
 *     -String name
 *     ------------
 *     + Konto (String Inhaber)
 *     +bool buchung (float betrag)
 *     + String display ()
 *     --------------------
 ***/
// Systemprogrammierer, aka Implementierer
public class Konto {
    private int kontoNr;
    private float saldo;
    private String name;


    public Konto(String inhaber) {
        this.name = inhaber;

    }

    public boolean buchung(float betrag) {

        //Einzahlung/Auszahlung

        if (betrag < 0 && Math.abs(betrag) > this.saldo) {
            return false;
        }
        this.saldo += betrag;
        return true;

    }

    public String display() {

        return String.format("Kunde %s hat Kontostand %.2f Euro", this.name, this.saldo);
    }


}
