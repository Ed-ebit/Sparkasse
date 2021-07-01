package de.iad.ef.firma;

public abstract class Mitarbeiter {

    protected String name;
    private float gehalt;

    public Mitarbeiter(double gehalt) {

        this.gehalt = (float) gehalt;
    }
    public Mitarbeiter(String name, double gehalt){
        this.name = name;
        this.gehalt = (float)gehalt;
    }

    protected float getGehalt() {

        return gehalt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("name='").append(name).append('\'');
        sb.append(", gehalt=").append(gehalt);
        return sb.toString();
    }

    protected void setGehalt(float gehalt) {
        this.gehalt = gehalt;
    }
    public void  gehaltserhoehung() {
        this.gehalt+=20;
    }
}

