package de.iad.ef.firma;

public class Chef extends Mitarbeiter {

    private float boni;


    public Chef(String name, double gehalt, double boni) {
        super(name,gehalt);
        //     super.gehalt= (float)gehalt;
       this.boni=(float)boni;
    }

    public String getName() {
        return super.name;
    }

    public float getBoni() {
        return boni;
    }

    public float getGehalt() {
        return super.getGehalt();
    }

    public void setBoni(float boni) {
        if(boni<=0) return; //if(boni<=this.boni) return; - alter bonus
        this.boni = boni;
    }

    //@Override  - Annotation, muss nicht stehen bleiben aus technischer Sicht,
    // ist aber ein durch Compiler selbst genutzer Hinweis
    public String toString() {
        return super.toString() + " ist ein(e) " + getClass().getSimpleName()+"(r)" +
                " und bekommt " + this.boni + " Euro Bonus";
    }

    @Override
    protected void setGehalt(float gehalt) {
        super.setGehalt(gehalt);
    }


    @Override
    public void gehaltserhoehung(){
        super.setGehalt(super.getGehalt()*1.2f);
        super.gehaltserhoehung();

    }
}
