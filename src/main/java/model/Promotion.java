package model;

import model.builder.PromotionBuilder;

public class Promotion {
    private int id;
    private String libelle;
    private DateGes dateDebut;
    private DateGes dateFin;
    private int statut;

    public Promotion(PromotionBuilder promotionBuilder) {
        this.id = promotionBuilder.getId();
        this.libelle = promotionBuilder.getLibelle();
        this.dateDebut = promotionBuilder.getDateDebut();
        this.dateFin = promotionBuilder.getDateFin();
        this.statut = promotionBuilder.getStatut();
    }

    public static PromotionBuilder getBuilder(){
        return new PromotionBuilder();
    }
}
