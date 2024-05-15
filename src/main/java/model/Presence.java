package model;

import model.builder.PresenceBuilder;

public class Presence {
    private int id;
    private Apprenant apprenant;
    private HeureGes heureArrivee;
    private Promotion promotion;

    public Presence(PresenceBuilder presenceBuilder) {
        this.id = presenceBuilder.getId();
        this.apprenant = presenceBuilder.getApprenant();
        this.heureArrivee = presenceBuilder.getHeureArrivee();
        this.promotion = presenceBuilder.getPromotion();
    }

    public static PresenceBuilder getBuilder(){
        return new PresenceBuilder();
    }
}
