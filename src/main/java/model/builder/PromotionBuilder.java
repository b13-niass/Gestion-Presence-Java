package model.builder;

import model.DateGes;
import model.Promotion;

public class PromotionBuilder {
    private int id;
    private String libelle;
    private DateGes dateDebut;
    private DateGes dateFin;
    private int statut;

    public int getId() {
        return id;
    }

    public PromotionBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public String getLibelle() {
        return libelle;
    }

    public PromotionBuilder setLibelle(String libelle) {
        this.libelle = libelle;
        return this;
    }

    public DateGes getDateDebut() {
        return dateDebut;
    }

    public PromotionBuilder setDateDebut(DateGes dateDebut) {
        this.dateDebut = dateDebut;
        return this;
    }

    public DateGes getDateFin() {
        return dateFin;
    }

    public PromotionBuilder setDateFin(DateGes dateFin) {
        this.dateFin = dateFin;
        return this;
    }

    public int getStatut() {
        return statut;
    }

    public PromotionBuilder setStatut(int statut) {
        this.statut = statut;
        return this;
    }

    public Promotion build(){
        return new Promotion(this);
    }
}
