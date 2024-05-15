package model;

import model.builder.ApprenantBuilder;

public class Apprenant {
    private int id;
    private String matricule;
    private int referentiel;
    private int promotion;
    private User user;
    public Apprenant(ApprenantBuilder apprenantBuilder) {
        this.id = apprenantBuilder.getId();
        this.promotion = apprenantBuilder.getPromotion();
        this.referentiel = apprenantBuilder.getReferentiel();
        this.matricule = apprenantBuilder.getMatricule();
        this.user = apprenantBuilder.getUser();
    }

    public static ApprenantBuilder getBuilder(){
        return new ApprenantBuilder();
    }

}
