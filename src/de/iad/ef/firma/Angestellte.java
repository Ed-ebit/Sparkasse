package de.iad.ef.firma;

public class Angestellte extends Mitarbeiter {

    public Angestellte(String name, double gehalt) {
        super(name, gehalt);
    }

    @Override
    public String toString() {
        return super.toString() + " ist ein(e) " + getClass().getSimpleName()+"(r)";
    }
}
