package de.iad.ef;

/***
 *
 *      Konto
 *     -------
 *     -int Kontonr
 *     -float  saldo
 *     -float Kontokorrent(kk)
 *     -String name
 *     ------------
 *     + Konto (String inhaber)
 *     +bool buchung (float betrag)
 *     + Konto(String inhaber, float kk)
 *     + String display ()
 *     --------------------
 ***/
// Systemprogrammierer, aka Implementierer
public class Konto {
    private int kontoNr;
    private float saldo;
    private float kk;
    private String name;


    public Konto(String inhaber) {
        this(inhaber, 0.0f);//Aufruf des Konstruktors mit den meisten Parametern
        //Ersetzen der fehlenden Parameter mit default Werten#
        // this.name
        //this.name = inhaber;

    }
    public Konto(String inhaber,float kk) {
        this.kk = kk;
        this.name = inhaber;

    }

    public boolean buchung(float betrag) {

        //Einzahlung/Auszahlung
        float tempsaldo = this.saldo + this.kk;

        if (betrag < 0 && Math.abs(betrag) > tempsaldo) {
            return false;
        }

        this.saldo += betrag;
        return true;

    }

    public String display() {

        return String.format("Kunde %s hat Kontostand %.2f Euro", this.name, this.saldo);
    }


}
