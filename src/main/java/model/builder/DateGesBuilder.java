package model.builder;

import model.DateGes;

public class DateGesBuilder {
    private int id;
    private int jour;
    private int mois;
    private int annee;

    public int getId() {
        return id;
    }

    public DateGesBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public int getJour() {
        return jour;
    }

    public DateGesBuilder setJour(int jour) {
        this.jour = jour;
        return this;
    }

    public int getMois() {
        return mois;
    }

    public DateGesBuilder setMois(int mois) {
        this.mois = mois;
        return this;
    }

    public int getAnnee() {
        return annee;
    }

    public DateGesBuilder setAnnee(int annee) {
        this.annee = annee;
        return this;
    }



    public DateGes build(){
        return new DateGes(this);
    }
}
