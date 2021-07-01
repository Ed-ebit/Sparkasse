package de.iad.ef.firma;

public class Azubi extends Mitarbeiter{

    public Azubi(String name, double gehalt) {
        super(name, gehalt);
    }
    @Override
    public String toString() {
        return super.toString() + " ist ein(e) " + getClass().getSimpleName()+"(r)";
    }

}
